package com.ut.scf.service.bpm;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.EndEvent;
import org.activiti.bpmn.model.ExclusiveGateway;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.bpmn.model.SequenceFlow;
import org.activiti.bpmn.model.UserTask;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ut.scf.core.annotation.EmbbedList;
import com.ut.scf.core.annotation.ShareResource;
import com.ut.scf.core.annotation.UniqueResource;
import com.ut.scf.core.bpm.BpmConsts;
import com.ut.scf.core.bpm.BpmProcessConfig;
import com.ut.scf.core.bpm.BpmProcessContext;
import com.ut.scf.core.bpm.FormConfig;
import com.ut.scf.core.bpm.RouteDirection;
import com.ut.scf.core.bpm.SequenceFlowConfig;
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.exception.SharingResourceOverflowException;
import com.ut.scf.core.exception.TempResourceUniqueException;
import com.ut.scf.core.util.ReflectUtils;
import com.ut.scf.core.util.ScfBizUtil;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.SysTempResourcePoolMapper;
import com.ut.scf.dao.sys.ISysTempResourcePoolDao;
import com.ut.scf.pojo.auto.SysTempResourcePool;
import com.ut.scf.pojo.auto.SysTempResourcePoolExample;

@Service
public class BpmHelpService {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	protected HistoryService historyService;

	@Autowired
	protected RepositoryService repositoryService;

	@Autowired
	protected SysTempResourcePoolMapper sysTempResourcePoolMapper;

	@Autowired
	private ISysTempResourcePoolDao sysTempResourcePoolDao;

	private static final Map<String, Map<String, FlowElement>> PROCESSELEMENTMAPCACHE = Maps.newHashMap();

	private static final Map<String, org.activiti.bpmn.model.Process> PROCESSCACHE = Maps.newHashMap();

	public Map<String, FlowElement> getFlowElementByCache(String processDefinitionId) {
		Map<String, FlowElement> elementMap = PROCESSELEMENTMAPCACHE.get(processDefinitionId);
		if (elementMap == null) {
			BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
			org.activiti.bpmn.model.Process process = bpmnModel.getProcesses().get(0);
			Collection<FlowElement> flowElements = process.getFlowElements();

			elementMap = Maps.newHashMap();
			for (FlowElement e : flowElements) {
				elementMap.put(e.getId(), e);
			}
			PROCESSELEMENTMAPCACHE.put(processDefinitionId, elementMap);
		}
		return elementMap;
	}

	public org.activiti.bpmn.model.Process getBpmProcess(String processDefinitionId) {
		org.activiti.bpmn.model.Process process = PROCESSCACHE.get(processDefinitionId);
		if (process == null) {
			BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
			process = bpmnModel.getProcesses().get(0);
			PROCESSCACHE.put(processDefinitionId, process);
		}
		return process;
	}

	public BpmProcessConfig getBpmProcessConfig(String processDefinitionId) {
		org.activiti.bpmn.model.Process process = getBpmProcess(processDefinitionId);
		return StringUtils.isNotEmpty(process.getDocumentation()) ? JSONObject.parseObject(process.getDocumentation(),
				BpmProcessConfig.class) : null;
	}

	private SequenceFlowConfig getSequenceFlowConfig(SequenceFlow sf) {
		return StringUtils.isNotEmpty(sf.getDocumentation()) ? JSONObject.parseObject(sf.getDocumentation(),
				SequenceFlowConfig.class) : null;
	}

	private List<RouteDirection> appendRouteDirection(Map<String, FlowElement> elementMap, SequenceFlow outflow,
			boolean oneway) {
		List<RouteDirection> fdList = Lists.newArrayList();
		// 取得连接的下个节点对象
		FlowElement nextEle = elementMap.get(outflow.getTargetRef());

		// 如果连接的是排他网关，则gateway的输出连接线就是当前结点的下一步流转方向
		if (nextEle instanceof ExclusiveGateway) {
			// 取得下一个结点对象，应该是一个gateway？
			ExclusiveGateway gateway = (ExclusiveGateway) nextEle;

			// 取得gateway的连接线
			List<SequenceFlow> gatwayFLows = gateway.getOutgoingFlows();
			for (SequenceFlow sf : gatwayFLows) {
				fdList.add(new RouteDirection(sf.getId(), sf.getName(), getSequenceFlowConfig(sf)));
			}
		} else if (nextEle instanceof UserTask || nextEle instanceof EndEvent) {
			if (oneway) {
				// 节点只有一根出线，且出线连接的节点是UserTask节点时
				fdList.add(new RouteDirection(BpmConsts.ONEWAY_ROUTE, BpmConsts.ONEWAY_ROUTE_NAME, null));
			} else {
				// 如果连接的是UserTask节点，说明下一步仍是一个审批节点，添加到路由
				// 如果连接的是结束节点，仍添加到路由
				fdList.add(new RouteDirection(outflow.getId(), outflow.getName(), getSequenceFlowConfig(outflow)));
			}
		}
		return fdList;
	}

	public List<RouteDirection> getRouteDirections(String processDefinitionId, String userTaskKey) {
		Map<String, FlowElement> elementMap = getFlowElementByCache(processDefinitionId);
		// 取得当前结点对象
		UserTask userTask = (UserTask) elementMap.get(userTaskKey);
		List<SequenceFlow> outFLows = userTask.getOutgoingFlows();
		List<RouteDirection> fdList = Lists.newArrayList();

		if (outFLows.size() > 1) {
			for (SequenceFlow outflow : outFLows) {
				fdList.addAll(appendRouteDirection(elementMap, outflow, false));
			}
		} else {
			fdList.addAll(appendRouteDirection(elementMap, outFLows.get(0), true));
		}

		// 按流程分支配置排序按钮
		Collections.sort(fdList, new Comparator<RouteDirection>() {
			@Override
			public int compare(RouteDirection first, RouteDirection second) {
				if (first.getFlowCfg() != null && second.getFlowCfg() != null) {
					return first.getFlowCfg().getOrder() > second.getFlowCfg().getOrder() ? 1 : (first.getFlowCfg()
							.getOrder() < second.getFlowCfg().getOrder() ? -1 : 0);
				} else {
					return 0;
				}
			}
		});
		return fdList;
	}

	@Deprecated
	public UserTask getPreviousUserTask(String processDefinitionId, String userTaskKey) {
		Map<String, FlowElement> elementMap = getFlowElementByCache(processDefinitionId);
		// 取得当前结点对象
		UserTask userTask = (UserTask) elementMap.get(userTaskKey);
		// 取得输入连接线对象，应该只有一条？
		SequenceFlow incoming = userTask.getIncomingFlows().get(0);
		// 取得连接的源节点对象
		FlowElement sourceEle = elementMap.get(incoming.getSourceRef());

		if (sourceEle instanceof ExclusiveGateway) {
			ExclusiveGateway gateway = (ExclusiveGateway) sourceEle;
			// 取得输入连接线，应该只有一条？
			SequenceFlow inlineGw = gateway.getIncomingFlows().get(0);
			FlowElement sourceGw = elementMap.get(inlineGw.getSourceRef());

			if (sourceGw instanceof UserTask) {
				return (UserTask) sourceGw;
			} else {
				// 继续递归搜索？
				return null;
			}
		} else if (sourceEle instanceof UserTask) {
			return (UserTask) sourceEle;
		} else {
			// 其他类型的节点？没想好怎么办？F
			return null;
		}
	}

	/**
	 * 取节点的可编辑配置信息
	 * 
	 * @param processDefinitionId
	 * @param userTaskKey
	 * @return
	 */
	public FormConfig getFormConfig(String processDefinitionId, String userTaskKey) {
		Map<String, FlowElement> elementMap = getFlowElementByCache(processDefinitionId);
		// 取得当前结点对象
		UserTask userTask = (UserTask) elementMap.get(userTaskKey);
		String configJson = userTask.getDocumentation();
		return StringUtils.isNotEmpty(configJson) ? JSONObject.parseObject(configJson, FormConfig.class) : null;
	}

	// 取得formbean的临时资源注解字段，保存到临时资源表中
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public <FORMBEAN> void saveUniqueResource(BpmProcessContext<FORMBEAN> context) {
		String definition = context.getProcessDefinitionKey();
		List<Field> tempFieldList = ReflectUtils.getAllDeclaredField(context.getFormBeanClass(), UniqueResource.class);
		for (Field field : tempFieldList) {
			Object value = ReflectUtils.getFieldValue(context.getFormData(), field);
			SysTempResourcePool trp = new SysTempResourcePool();
			trp.setRecUid(ScfUUID.generate());
			trp.setDefinition(definition);
			trp.setKey(field.getName());
			trp.setValue(value.toString());
			sysTempResourcePoolMapper.insert(trp);
		}
	}

	// 释放临时资源表中definition和KEY对应的记录
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public <FORMBEAN> void releaseUniqueResource(BpmProcessContext<FORMBEAN> context) {
		String definition = context.getProcessDefinitionKey();
		FORMBEAN formdata = context.getFormData();
		List<Field> tempFieldList = ReflectUtils.getAllDeclaredField(context.getFormBeanClass(), UniqueResource.class);
		for (Field field : tempFieldList) {
			Object value = ReflectUtils.getFieldValue(formdata, field);
			SysTempResourcePoolExample exam = new SysTempResourcePoolExample();
			com.ut.scf.pojo.auto.SysTempResourcePoolExample.Criteria crit = exam.createCriteria();
			crit.andDefinitionEqualTo(definition);
			crit.andKeyEqualTo(field.getName());
			crit.andValueEqualTo((String) value);
			sysTempResourcePoolMapper.deleteByExample(exam);
		}
	}

	@Transactional(readOnly = true)
	public <FORMBEAN> void countUniqueResource(BpmProcessContext<FORMBEAN> context) {
		String definition = context.getProcessDefinitionKey();
		List<Field> tempFieldList = ReflectUtils.getAllDeclaredField(context.getFormBeanClass(), UniqueResource.class);
		for (Field field : tempFieldList) {
			Object value = ReflectUtils.getFieldValue(context.getFormData(), field);
			SysTempResourcePoolExample exam = new SysTempResourcePoolExample();
			com.ut.scf.pojo.auto.SysTempResourcePoolExample.Criteria crit = exam.createCriteria();
			crit.andDefinitionEqualTo(definition);
			crit.andKeyEqualTo(field.getName());
			crit.andValueEqualTo((String) value);
			int count = sysTempResourcePoolMapper.countByExample(exam);
			if (count > 0) {
				log.warn("WARNNING:countUniqueResource result not unique,definition:" + definition + ",field:"
						+ field.getName() + ",value:" + ReflectUtils.getFieldValue(context.getFormData(), field));
				throw new TempResourceUniqueException();
			}
		}
	}

	private boolean notMatchListType(Field field) {
		return !field.getType().equals(List.class);
	}

	@SuppressWarnings("rawtypes")
	public <FORMBEAN> void judgeSharingResource(BpmProcessContext<FORMBEAN> context) {
		String definition = context.getProcessDefinitionKey();
		List<Field> embFieldList = ReflectUtils.getAllDeclaredField(context.getFormBeanClass(), EmbbedList.class);
		// 取嵌套的集合成员变量
		for (Field embField : embFieldList) {
			if (notMatchListType(embField)) {
				continue;
			}
			List embList = (List) ReflectUtils.getFieldValue(context.getFormData(), embField);
			// 循环集合成员变量的所有值
			for (Object emb : embList) {
				List<Field> shareFieldList = ReflectUtils.getAllDeclaredField(emb.getClass(), ShareResource.class);
				// 计算共享字段的值在temp resource表中的合计值
				for (Field shareField : shareFieldList) {
					Object value = ReflectUtils.getFieldValue(emb, shareField);
					ShareResource shareAnnt = shareField.getAnnotation(ShareResource.class);
					Object shareval = ReflectUtils.getFieldValue(emb, shareAnnt.toShare());
					BigDecimal sum = sysTempResourcePoolDao.sumSharingValuesBy(definition, shareField.getName(),
							(String) value);
					// TODO 目前暂时是一次全额融资或者付款，今后要支持多次部分，需要计算可用余额再判断
					if (sum != null && sum.compareTo((BigDecimal) shareval) == 0) {
						log.warn("WARNNING:judgeSharingResource result not unique,definition:" + definition + ",field:"
								+ shareField.getName() + ",value:" + value + ",shareval:" + shareval);
						throw new SharingResourceOverflowException();
					}
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public <FORMBEAN> void saveSharingResource(BpmProcessContext<FORMBEAN> context) {
		String definition = context.getProcessDefinitionKey();
		String instanceId = context.getProcessInstance().getId();
		List<Field> embFieldList = ReflectUtils.getAllDeclaredField(context.getFormBeanClass(), EmbbedList.class);
		// 取嵌套的集合成员变量
		for (Field embField : embFieldList) {
			if (notMatchListType(embField)) {
				continue;
			}
			List<Object> embList = (List<Object>) ReflectUtils.getFieldValue(context.getFormData(), embField);
			// 循环集合成员变量的所有值
			for (Object emb : embList) {
				List<Field> shareFieldList = ReflectUtils.getAllDeclaredField(emb.getClass(), ShareResource.class);

				for (Field shareField : shareFieldList) {
					// 共享成员变量值
					Object value = ReflectUtils.getFieldValue(emb, shareField);
					ShareResource shareAnnt = shareField.getAnnotation(ShareResource.class);
					// 共享值
					Object shareval = ReflectUtils.getFieldValue(emb, shareAnnt.toShare());

					SysTempResourcePool trp = new SysTempResourcePool();
					trp.setRecUid(ScfUUID.generate());
					trp.setDefinition(definition);
					trp.setInstanceid(instanceId);
					trp.setKey(shareField.getName());
					trp.setValue(value.toString());
					trp.setShareval(shareval.toString());
					sysTempResourcePoolMapper.insert(trp);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public <FORMBEAN> void releaseSharingResource(BpmProcessContext<FORMBEAN> context) {
		String definition = context.getProcessDefinitionKey();
		String instanceId = context.getProcessInstance().getId();
		List<Field> embFieldList = ReflectUtils.getAllDeclaredField(context.getFormBeanClass(), EmbbedList.class);
		// 取嵌套的集合成员变量
		for (Field embField : embFieldList) {
			if (notMatchListType(embField)) {
				continue;
			}
			List<Object> embList = (List<Object>) ReflectUtils.getFieldValue(context.getFormData(), embField);
			// 循环集合成员变量的所有值
			for (Object emb : embList) {
				List<Field> shareFieldList = ReflectUtils.getAllDeclaredField(emb.getClass(), ShareResource.class);

				for (Field shareField : shareFieldList) {
					// 共享成员变量值
					Object value = ReflectUtils.getFieldValue(emb, shareField);
					SysTempResourcePoolExample exam = new SysTempResourcePoolExample();
					com.ut.scf.pojo.auto.SysTempResourcePoolExample.Criteria crit = exam.createCriteria();
					crit.andDefinitionEqualTo(definition);
					crit.andInstanceidEqualTo(instanceId);
					crit.andKeyEqualTo(shareField.getName());
					crit.andValueEqualTo((String) value);
					sysTempResourcePoolMapper.deleteByExample(exam);
				}
			}
		}
	}

	/**
	 * 流程结束后自动给业务表单对象设置流程创建人创建时间和最后处理人处理时间
	 * 
	 * @param context
	 */
	@SuppressWarnings("rawtypes")
	public <FORMBEAN> void setFormDataDefaultFour(BpmProcessContext<FORMBEAN> context) {
		ProcessInstance prcInst = context.getProcessInstance();
		HistoricProcessInstance hisPrcInsts = historyService.createHistoricProcessInstanceQuery()
				.processInstanceId(prcInst.getId()).singleResult();
		HistoricVariableInstance lastPrcVar = historyService.createHistoricVariableInstanceQuery()
				.processInstanceId(prcInst.getId()).variableName(BpmConsts.LAST_PROCESSOR).singleResult();
		HistoricVariableInstance startIdVar = historyService.createHistoricVariableInstanceQuery()
				.processInstanceId(prcInst.getId()).variableName(BpmConsts.START_USERID).singleResult();
		FORMBEAN formdata = context.getFormData();
		try {
			ScfBizUtil.overwriteNullValue(formdata, ScfConsts.CREATEUSER, startIdVar.getValue());
			ScfBizUtil.overwriteNullValue(formdata, ScfConsts.CREATETIME, hisPrcInsts.getStartTime());
			ScfBizUtil.overwriteNullValue(formdata, ScfConsts.UPDATEUSER, lastPrcVar.getValue());
			ScfBizUtil.overwriteNullValue(formdata, ScfConsts.UPDATETIME, hisPrcInsts.getEndTime());
			Field status = ReflectUtils.getDeclaredField(formdata, ScfConsts.STATUS);
			if (status != null) {
				if (status.getType().equals(Short.class)) {
					ReflectUtils.setFieldValue(formdata, ScfConsts.STATUS, (short) 1);
				} else if (status.getType().equals(Integer.class)) {
					ReflectUtils.setFieldValue(formdata, ScfConsts.STATUS, 1);
				}
			}

			// 循环集合成员变量，设置四个值
			List<Field> fieldList = ReflectUtils.getAllSpecialDeclaredField(context.getFormBeanClass(), List.class);
			for (Field field : fieldList) {
				List embList = (List) ReflectUtils.getFieldValue(formdata, field);
				for (Object emb : embList) {
					try {
						ScfBizUtil.overwriteNullValue(emb, ScfConsts.CREATEUSER, startIdVar.getValue());
						ScfBizUtil.overwriteNullValue(emb, ScfConsts.CREATETIME, hisPrcInsts.getStartTime());
						ScfBizUtil.overwriteNullValue(emb, ScfConsts.UPDATEUSER, lastPrcVar.getValue());
						ScfBizUtil.overwriteNullValue(emb, ScfConsts.UPDATETIME, hisPrcInsts.getEndTime());
						Field s = ReflectUtils.getDeclaredField(emb, ScfConsts.STATUS);
						if (s != null) {
							if (s.getType().equals(Short.class)) {
								ReflectUtils.setFieldValue(emb, ScfConsts.STATUS, (short) 1);
							} else if (s.getType().equals(Integer.class)) {
								ReflectUtils.setFieldValue(emb, ScfConsts.STATUS, 1);
							}
						}
					} catch (Exception e) {
					}
				}

			}
		} catch (Exception e) {
			log.warn("autoset CREATEUSER&TIME & UPDATEUSER&TIME fail", e);
		}
		// 更新formdata json
		context.setFormDataJson(JSONObject.toJSONString(formdata));
	}
}
