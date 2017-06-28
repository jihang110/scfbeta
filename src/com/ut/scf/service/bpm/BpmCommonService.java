package com.ut.scf.service.bpm;

import java.io.InputStream;
import java.util.List;

import org.activiti.engine.HistoryService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.impl.cmd.GetDeploymentProcessDiagramCmd;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.ut.scf.core.bpm.BpmConsts;
import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.exception.BizException;
import com.ut.scf.core.util.ActProcessInstanceDiagramCmd;
import com.ut.scf.reqbean.bpm.AuditHisReqBean;
import com.ut.scf.respbean.bpm.AuditHisListRespBean;
import com.ut.scf.respbean.bpm.TaskListRespBean;

@Service
public class BpmCommonService {

	@Autowired
	private TaskService taskService;

	@Autowired
	private RepositoryService repositoryService;

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private ProcessEngine processEngine;

	@Autowired
	protected HistoryService historyService;

	@Autowired
	protected ManagementService managementService;

	@Transactional(readOnly = true)
	public List<TaskListRespBean> queryToDoTaskList(PageInfoBean page, String currentUser) {
		long totolCount = taskService.createTaskQuery().taskCandidateOrAssigned(currentUser).count();
		page.setTotalRecord(new Long(totolCount).intValue());
		page.computeTotalPage();
		int firstResult = (page.getPageNumber() - 1) * page.getPageSize();

		List<Task> tasklist = taskService.createTaskQuery().taskCandidateOrAssigned(currentUser)
				.orderByTaskCreateTime().desc().listPage(firstResult, page.getPageSize());
		List<TaskListRespBean> taskRespList = Lists.newArrayList();

		for (Task task : tasklist) {
			TaskListRespBean taskResp = new TaskListRespBean();
			ProcessDefinition prdf = repositoryService.getProcessDefinition(task.getProcessDefinitionId());
			ProcessInstance prcInst = runtimeService.createProcessInstanceQuery()
					.processInstanceId(task.getProcessInstanceId()).singleResult();
			HistoricProcessInstance hisPrcInst = historyService.createHistoricProcessInstanceQuery()
					.processInstanceId(task.getProcessInstanceId()).singleResult();

			String lastTime = taskService.getVariable(task.getId(), BpmConsts.LAST_PROCESS_TIME, String.class);
			String lastProcessor = taskService.getVariable(task.getId(), BpmConsts.LAST_PROCESSOR, String.class);

			taskResp.setTaskId(task.getId());
			taskResp.setProcessDefinitionKey(prdf.getKey());
			taskResp.setProcessDefinitionName(prdf.getName());
			taskResp.setProcessInstanceId(task.getProcessInstanceId());
			taskResp.setProcessInstanceName(prcInst.getName());
			taskResp.setLastProcessor(lastProcessor);
			taskResp.setLastProcessTime(lastTime);
			taskResp.setProcessCreateTime(hisPrcInst.getStartTime());
			taskRespList.add(taskResp);
		}
		return taskRespList;
	}

	@Transactional(readOnly = true)
	public List<AuditHisListRespBean> queryAuditHistoryList(AuditHisReqBean auditHisReqBean) {
		HistoricTaskInstance t = historyService.createHistoricTaskInstanceQuery().taskId(auditHisReqBean.getTaskId())
				.singleResult();
		List<HistoricTaskInstance> hisTaskList = historyService.createHistoricTaskInstanceQuery()
				.processInstanceId(t.getProcessInstanceId()).list();
		ProcessDefinition prdf = repositoryService.createProcessDefinitionQuery()
				.processDefinitionId(t.getProcessDefinitionId()).singleResult();

		List<AuditHisListRespBean> hisList = Lists.newArrayList();
		for (HistoricTaskInstance task : hisTaskList) {
			AuditHisListRespBean his = new AuditHisListRespBean();
			his.setTaskId(task.getId());
			his.setAuditor(task.getAssignee());
			his.setAuditTime(task.getEndTime());
			his.setProcessDefinitionKey(prdf.getKey());
			his.setTaskName(task.getName());
			his.setOpinion(getHistoryTaskOpinion(task.getId()));
			hisList.add(his);
		}
		return hisList;
	}

	// 历史任务的审批意见
	private String getHistoryTaskOpinion(String taskId) {
		List<HistoricVariableInstance> hisOpnVarList = historyService.createHistoricVariableInstanceQuery()
				.taskId(taskId).variableNameLike(BpmConsts.OPINION_VAR_PREFFIX + "%").list();
		StringBuffer opBuf = new StringBuffer();
		for (HistoricVariableInstance var : hisOpnVarList) {
			opBuf.append(var.getValue());
		}
		return opBuf.toString();
	}

	@Transactional(readOnly = true)
	public InputStream getProcessGraph(String processDefinitionId, String processInstanceId, String taskId) {
		Command<InputStream> cmd = null;
		if (StringUtils.isNotEmpty(processDefinitionId)) {
			cmd = new GetDeploymentProcessDiagramCmd(processDefinitionId);
		} else if (StringUtils.isNotEmpty(processInstanceId)) {
			cmd = new ActProcessInstanceDiagramCmd(processInstanceId);
		} else if (StringUtils.isNotEmpty(taskId)) {
			HistoricTaskInstance task = historyService.createHistoricTaskInstanceQuery().taskId(taskId).singleResult();
			cmd = new ActProcessInstanceDiagramCmd(task.getProcessInstanceId());
		} else {
			throw new BizException(ErrorCodeEnum.BPM_ERROR);
		}
		InputStream is = managementService.executeCommand(cmd);
		return is;
	}

}
