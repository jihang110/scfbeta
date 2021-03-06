package com.ut.scf.service.bpm.impl;

import java.util.List;

import org.activiti.engine.EngineServices;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.runtime.ProcessInstance;

import com.ut.scf.core.util.SpringContextUtil;
import com.ut.scf.pojo.auto.CorpInfo;
import com.ut.scf.service.bpm.SysBpmCandidateConfigService;
import com.ut.scf.service.pubmanage.CorpInfoService;
import com.ut.scf.sys.bpm.BpmConsts;

/**
 * 驳回中途节点任务时，指定处理人为当初处理人
 * 
 * @author shenying
 *
 */
public class MiddelWayTaskListenerImpl implements TaskListener {

	private static final long serialVersionUID = 5606373606524206619L;

	private Expression previousTaskKey;

	@Override
	public void notify(DelegateTask delegateTask) {
		String prvTaskKey = (String) previousTaskKey.getValue(delegateTask);
		EngineServices enginee = delegateTask.getExecution().getEngineServices();
		HistoryService historyService = enginee.getHistoryService();
		RuntimeService runtimeService = enginee.getRuntimeService();

		ProcessInstance prcInst = runtimeService.createProcessInstanceQuery()
				.processInstanceId(delegateTask.getProcessInstanceId()).singleResult();

		// 取得发起人公司ID
		String startCorpId = delegateTask.getVariable(BpmConsts.START_USER_CORPID, String.class);

		// 查询发起人公司的关联公司，即保理商公司ID
		CorpInfoService corpInfoService = SpringContextUtil.getBean(CorpInfoService.class);
		CorpInfo corp = corpInfoService.getCorpInfo(startCorpId);
		String relationCorpId = corp.getRelaCorpId();

		// 查询历史任务的最近一条
		List<HistoricTaskInstance> hisTaskList = historyService.createHistoricTaskInstanceQuery()
				.orderByTaskCreateTime().desc().list();
		HistoricTaskInstance lastHisTask = hisTaskList.get(0);

		// 判断与配置的上游节点名称是否相同，如是则表示上游节点正常流转到此节点，按节点配置角色添加候选人
		if (lastHisTask.getTaskDefinitionKey().equals(prvTaskKey)) {
			SysBpmCandidateConfigService sysBpmCandidateConfigService = SpringContextUtil
					.getBean(SysBpmCandidateConfigService.class);
			List<String> userlist = sysBpmCandidateConfigService.getCandidateUserList(
					delegateTask.getTaskDefinitionKey(), prcInst.getProcessDefinitionKey(), relationCorpId);
			delegateTask.addCandidateUsers(userlist);
		} else {
			// 如否则表示是下游节点驳回到此节点，搜索已完成历史任务列表中此节点任务，把任务的审批人做为指定人，即驳回给当初此节点的处理人
			List<HistoricTaskInstance> sameHisTaskList = historyService.createHistoricTaskInstanceQuery()
					.taskDefinitionKey(delegateTask.getTaskDefinitionKey()).finished().orderByTaskCreateTime().desc()
					.list();
			HistoricTaskInstance sameHisTask = sameHisTaskList.get(0);
			delegateTask.setAssignee(sameHisTask.getAssignee());
		}
	}

	public Expression getPreviousTaskKey() {
		return previousTaskKey;
	}

	public void setPreviousTaskKey(Expression previousTaskKey) {
		this.previousTaskKey = previousTaskKey;
	}

}
