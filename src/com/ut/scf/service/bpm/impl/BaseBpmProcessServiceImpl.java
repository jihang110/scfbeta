package com.ut.scf.service.bpm.impl;

import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.activiti.engine.HistoryService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.IdentityLink;
import org.activiti.engine.task.Task;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.ut.scf.core.bpm.BpmConsts;
import com.ut.scf.core.bpm.BpmProcessConfig;
import com.ut.scf.core.bpm.BpmProcessContext;
import com.ut.scf.core.bpm.FormConfig;
import com.ut.scf.core.bpm.RouteDirection;
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.reqbean.bpm.AuditHisFormDataReqBean;
import com.ut.scf.reqbean.bpm.AuditShowReqBean;
import com.ut.scf.reqbean.bpm.AuditSubmitReqBean;
import com.ut.scf.respbean.bpm.AuditHisFormDataRespBean;
import com.ut.scf.respbean.bpm.AuditShowRespBean;
import com.ut.scf.respbean.bpm.AuditSubmitRespBean;
import com.ut.scf.service.bpm.BpmHelpService;
import com.ut.scf.service.bpm.BpmProcessService;

public abstract class BaseBpmProcessServiceImpl<FORMBEAN> implements BpmProcessService<FORMBEAN> {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	protected ProcessEngine processEngine;

	@Autowired
	protected RepositoryService repositoryService;

	@Autowired
	protected RuntimeService runtimeService;

	@Autowired
	protected TaskService taskService;

	@Autowired
	protected HistoryService historyService;

	@Autowired
	protected BpmHelpService bpmHelpService;

	protected Class<FORMBEAN> formBeanClass = null;

	@SuppressWarnings("unchecked")
	public BaseBpmProcessServiceImpl() {
		super();
		formBeanClass = (Class<FORMBEAN>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
		log.debug("formBeanClass:" + formBeanClass.toString());
	}

	// completeTask前，设置路由信息
	protected void doAuditBefore(BpmProcessContext<FORMBEAN> context) {
		AuditSubmitReqBean<FORMBEAN> auditSubmitReqBean = context.getAuditSubmitReqBean();
		String direction = auditSubmitReqBean.getDirection();
		// 节点只有一条出线时，说明连接的不是排他网关，不需要设置路由变量
		if (!direction.equals(BpmConsts.ONEWAY_ROUTE)) {
			taskService.setVariable(auditSubmitReqBean.getTaskId(), BpmConsts.DIRECTION_VAR, direction);
		}
	}

	// completeTask后，保存正式业务数据
	protected void doAuditAfter(BpmProcessContext<FORMBEAN> context) {
		if (context.isProcessEnd()) {
			// 释放临时资源池表的唯一性字段值
			bpmHelpService.releaseUniqueResource(context);
			// 释放临时资源池表的共享资源值
			bpmHelpService.releaseSharingResource(context);

			bpmHelpService.setFormDataDefaultFour(context);
		}
	}

	// 查询运行时流程实例是否还存在，如无则表示流程已结束
	protected boolean isProcessInstanceEnded(BpmProcessContext<FORMBEAN> context) {
		ProcessInstance prcInst = runtimeService.createProcessInstanceQuery()
				.processInstanceId(context.getTask().getProcessInstanceId()).singleResult();
		context.setProcessEnd(prcInst == null ? true : false);
		return context.isProcessEnd();
	}

	// 取得表单对象
	protected FORMBEAN getFormData(BpmProcessContext<FORMBEAN> context) {
		return JSONObject.parseObject(context.getFormDataJson(), formBeanClass);
	}

	// 按要求设置流程实例名称，默认为流程定义名称
	protected String getProcessInstanceName(ProcessDefinition processDefinition, ProcessInstance processInstance,
			FORMBEAN formData) {
		return processDefinition.getName();
	}

	protected void doStartBefore(BpmProcessContext<FORMBEAN> context) {
		// 从正式数据表和临时资源池表查询判断业务数据的唯一性
		bpmHelpService.countUniqueResource(context);
		// 共享资源可用余额校验
		bpmHelpService.judgeSharingResource(context);
	}

	protected void doStartAfter(BpmProcessContext<FORMBEAN> context) {
		// 将表单数据中的唯一性字段值保存到临时资源池表中
		bpmHelpService.saveUniqueResource(context);
		// 保存共享资源数据到临时资源池中
		bpmHelpService.saveSharingResource(context);

		// 默认完成第一个节点
		Task task = taskService.createTaskQuery()
				.processInstanceId(context.getProcessInstance().getProcessInstanceId()).singleResult();
		BpmProcessConfig bpmcfg = bpmHelpService.getBpmProcessConfig(task.getProcessDefinitionId());
		if (bpmcfg != null) {
			taskService.setVariable(task.getId(), BpmConsts.DIRECTION_VAR, bpmcfg.getFirstGo());
		}
		taskService.complete(task.getId());
		context.setTask(task);
	}

	private BpmProcessContext<FORMBEAN> createContext(FORMBEAN formData) {
		BpmProcessContext<FORMBEAN> context = new BpmProcessContext<FORMBEAN>();
		context.setFormData(formData);
		context.setFormBeanClass(formBeanClass);
		context.setProcessDefinitionKey(getProcessDefinitionKey());
		return context;
	}

	private BpmProcessContext<FORMBEAN> createContext(Task task, AuditSubmitReqBean<FORMBEAN> auditSubmitReqBean,
			String formDataJson) {
		BpmProcessContext<FORMBEAN> context = new BpmProcessContext<FORMBEAN>();
		context.setFormBeanClass(formBeanClass);
		context.setProcessDefinitionKey(getProcessDefinitionKey());
		context.setTask(task);
		context.setAuditSubmitReqBean(auditSubmitReqBean);
		context.setFormDataJson(formDataJson);
		if (formBeanClass.isInstance(auditSubmitReqBean.getFormData())) {
			context.setFormData(auditSubmitReqBean.getFormData());
		} else {
			context.setFormData(getFormData(context));
		}
		
		ProcessInstance prcInst = runtimeService.createProcessInstanceQuery()
				.processInstanceId(task.getProcessInstanceId()).singleResult();
		context.setProcessInstance(prcInst);
		return context;
	}

	private ProcessInstance naiveStart(FORMBEAN formData, Map<String, Object> varMap) {
		ProcessDefinition prcDef = repositoryService.createProcessDefinitionQuery()
				.processDefinitionKey(getProcessDefinitionKey()).latestVersion().singleResult();
		ProcessInstance procIns = runtimeService.startProcessInstanceByKey(getProcessDefinitionKey(), varMap);
		runtimeService.setProcessInstanceName(procIns.getId(), getProcessInstanceName(prcDef, procIns, formData));
		return procIns;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public ProcessInstance start(FORMBEAN formData) {
		Map<String, Object> varMap = Maps.newHashMap();
		varMap.put(BpmConsts.FORMDATA_VAR, JSON.toJSONString(formData));
		return naiveStart(formData, varMap);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Task startFirstGo(FORMBEAN formData, String assignee) {
		// create context
		BpmProcessContext<FORMBEAN> context = createContext(formData);

		//
		doStartBefore(context);

		// start bpm
		Map<String, Object> varMap = Maps.newHashMap();
		varMap.put(BpmConsts.FORMDATA_VAR, JSON.toJSONString(formData));
		varMap.put(BpmConsts.LAST_PROCESS_TIME, DateFormatUtils.format(new Date(), ScfConsts.DATETIME_FORMAT));
		varMap.put(BpmConsts.LAST_PROCESSOR, assignee);
		varMap.put(BpmConsts.START_USERID, assignee);
		ProcessInstance procIns = naiveStart(formData, varMap);
		context.setProcessInstance(procIns);

		//
		doStartAfter(context);
		return context.getTask();
	}

	@Override
	@Transactional(readOnly = true)
	public AuditShowRespBean<FORMBEAN> showAudit(AuditShowReqBean auditShowReqBean) {
		String taskId = auditShowReqBean.getTaskId();
		Task task = taskService.createTaskQuery().taskId(auditShowReqBean.getTaskId()).singleResult();

		// 设置全局最新的formdata
		AuditShowRespBean<FORMBEAN> resp = new AuditShowRespBean<FORMBEAN>();
		String formDataJson = taskService.getVariable(taskId, BpmConsts.FORMDATA_VAR, String.class);
		FORMBEAN formData = JSONObject.parseObject(formDataJson, formBeanClass);
		resp.setFormData(formData);

		// 下节点路由
		List<RouteDirection> rdList = bpmHelpService.getRouteDirections(task.getProcessDefinitionId(),
				task.getTaskDefinitionKey());
		resp.setDirections(rdList);

		FormConfig config = bpmHelpService.getFormConfig(task.getProcessDefinitionId(), task.getTaskDefinitionKey());
		resp.setFormConfig(config);
		return resp;
	}

	@Override
	@Transactional(readOnly = true)
	public AuditShowRespBean<FORMBEAN> showAudit(AuditShowReqBean auditShowReqBean, String assignee) {
		taskService.claim(auditShowReqBean.getTaskId(), assignee);
		return showAudit(auditShowReqBean);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public AuditSubmitRespBean doAudit(AuditSubmitReqBean<FORMBEAN> auditSubmitReqBean) {
		String taskId = auditSubmitReqBean.getTaskId();
		Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
		String formDataJson = null;
		// 审批页表单数据不可编辑时，formdata 不提交到后台
		if (auditSubmitReqBean.getFormData() == null) {
			// 从全局变量中取得formdata json
			formDataJson = taskService.getVariable(taskId, BpmConsts.FORMDATA_VAR, String.class);
			auditSubmitReqBean.setFormData(JSONObject.parseObject(formDataJson, formBeanClass));
		} else {
			formDataJson = JSON.toJSONString(auditSubmitReqBean.getFormData());
		}

		// 设置上下文对象
		BpmProcessContext<FORMBEAN> context = createContext(task, auditSubmitReqBean, formDataJson);
		//
		doAuditBefore(context);

		// 更新全局formdata josn
		taskService.setVariable(taskId, BpmConsts.FORMDATA_VAR, formDataJson);
		// 保存task的本地formdata josn
		taskService.setVariableLocal(taskId, BpmConsts.FORMDATA_VAR, formDataJson);
		// 保存当前节点的审批意见
		if (auditSubmitReqBean.getOpinions() != null) {
			taskService.setVariablesLocal(taskId, auditSubmitReqBean.getOpinions());
		}
		// 设置最后处理人最后处理时间
		taskService.setVariable(taskId, BpmConsts.LAST_PROCESSOR, task.getAssignee());
		taskService.setVariable(taskId, BpmConsts.LAST_PROCESS_TIME,
				DateFormatUtils.format(new Date(), ScfConsts.DATETIME_FORMAT));

		//
		taskService.complete(taskId);

		// 判断流程是否已结束
		isProcessInstanceEnded(context);
		//
		doAuditAfter(context);

		// TODO 取得下一步提示
		AuditSubmitRespBean resp = new AuditSubmitRespBean();
		StringBuffer completeTip = new StringBuffer("已提交");
		// 查询当前流程实例的待办任务，得到每个任务的参与者ID，返回提示用户
		List<Task> todoList = taskService.createTaskQuery().processInstanceId(task.getProcessInstanceId()).list();
		for (Task t : todoList) {
			List<IdentityLink> idLinkList = taskService.getIdentityLinksForTask(t.getId());
			for (IdentityLink idl : idLinkList) {
				completeTip.append(idl.getUserId()).append(",");
			}
		}
		resp.setCompleteTip(completeTip.append("审批").toString());
		return resp;
	}

	@Override
	@Transactional(readOnly = true)
	public AuditHisFormDataRespBean<FORMBEAN> getHisFormData(AuditHisFormDataReqBean auditHisFormDataReqBean) {
		HistoricVariableInstance hisDataVar = historyService.createHistoricVariableInstanceQuery()
				.taskId(auditHisFormDataReqBean.getTaskId()).variableName(BpmConsts.FORMDATA_VAR).singleResult();

		List<HistoricVariableInstance> hisOpnVarList = historyService.createHistoricVariableInstanceQuery()
				.taskId(auditHisFormDataReqBean.getTaskId()).variableNameLike(BpmConsts.OPINION_VAR_PREFFIX + "%")
				.list();
		Map<String, String> opMap = Maps.newHashMap();
		for (HistoricVariableInstance op : hisOpnVarList) {
			opMap.put(op.getVariableName(), (String) op.getValue());
		}

		HistoricTaskInstance hisTask = historyService.createHistoricTaskInstanceQuery()
				.taskId(auditHisFormDataReqBean.getTaskId()).singleResult();
		FormConfig formcfg = bpmHelpService.getFormConfig(hisTask.getProcessDefinitionId(),
				hisTask.getTaskDefinitionKey());

		AuditHisFormDataRespBean<FORMBEAN> hisFormDataResp = new AuditHisFormDataRespBean<FORMBEAN>();
		FORMBEAN dataObj = JSONObject.parseObject((String) hisDataVar.getValue(), formBeanClass);
		hisFormDataResp.setFormData(dataObj);
		hisFormDataResp.setOpinions(opMap);
		hisFormDataResp.setFormConfig(formcfg);
		return hisFormDataResp;
	}

}
