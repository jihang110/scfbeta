package com.ut.scf.service.bpm.impl;

import java.util.List;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.runtime.ProcessInstance;

import com.ut.scf.core.util.SpringContextUtil;
import com.ut.scf.service.bpm.SysBpmCandidateConfigService;
import com.ut.scf.sys.bpm.BpmConsts;

public class TaskListenerImpl implements TaskListener {

	private static final long serialVersionUID = 478113514195354529L;

	@Override
	public void notify(DelegateTask task) {
		// 流程实例
		DelegateExecution exec = task.getExecution();
		RuntimeService runtimeService = exec.getEngineServices().getRuntimeService();
		ProcessInstance prcInst = runtimeService.createProcessInstanceQuery()
				.processInstanceId(task.getProcessInstanceId()).singleResult();

		String startCorpId = task.getVariable(BpmConsts.START_USER_CORPID, String.class);
		// 查询节点配置的候选人角色
		SysBpmCandidateConfigService sysBpmCandidateConfigService = SpringContextUtil
				.getBean(SysBpmCandidateConfigService.class);
		List<String> userlist = sysBpmCandidateConfigService.getCandidateUserList(task.getTaskDefinitionKey(),
				prcInst.getProcessDefinitionKey(), startCorpId);
		task.addCandidateUsers(userlist);
	}

}
