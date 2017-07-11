package com.ut.scf.service.bpm.impl;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.EngineServices;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.event.ActivitiActivityEvent;
import org.activiti.engine.delegate.event.ActivitiEntityEvent;
import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.activiti.engine.delegate.event.ActivitiEventType;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ut.scf.core.util.SpringContextUtil;
import com.ut.scf.dao.auto.SysBpmCandidateConfigMapper;
import com.ut.scf.pojo.auto.SysBpmCandidateConfig;
import com.ut.scf.pojo.auto.SysBpmCandidateConfigExample;
import com.ut.scf.pojo.auto.SysUser;
import com.ut.scf.service.sys.IUserDeptRoleStrategyService;
import com.ut.scf.service.sys.IUserDeptRoleStrategyServiceFactory;

@Deprecated
public class BpmTaskCandidateEventListenerImpl implements ActivitiEventListener {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void onEvent(ActivitiEvent event) {
//		ActivitiActivityEvent e = (ActivitiActivityEvent) event;
//		String actType = e.getActivityType();
//		String bc = e.getBehaviorClass();
//		String name = e.getActivityName();
//		if (!e.getActivityType().equalsIgnoreCase("userTask")) {
//			return;
//		}
		 ActivitiEntityEvent aee = (ActivitiEntityEvent)event;
		 TaskEntity task = (TaskEntity) aee.getEntity();
		 
		if (event.getType().equals(ActivitiEventType.ENTITY_ACTIVATED)) {
			EngineServices enginee = event.getEngineServices();
			// 流程实例
			ProcessInstance prcInst = enginee.getRuntimeService().createProcessInstanceQuery()
					.processInstanceId(event.getProcessInstanceId()).singleResult();

			// 当前待办任务
//			Task task = enginee.getTaskService().createTaskQuery().processInstanceId(event.getProcessInstanceId())
//					.singleResult();
//			DelegateTask dTask = (DelegateTask) task;

			// 查询节点配置的候选人角色
			SysBpmCandidateConfigMapper sysBpmCandidateConfigMapper = SpringContextUtil
					.getBean(SysBpmCandidateConfigMapper.class);
			SysBpmCandidateConfigExample exam = new SysBpmCandidateConfigExample();
			SysBpmCandidateConfigExample.Criteria crit = exam.createCriteria();
			crit.andPrcDefKeyEqualTo(prcInst.getProcessDefinitionKey());
			crit.andTaskIdEqualTo(task.getTaskDefinitionKey());
			List<SysBpmCandidateConfig> cddList = sysBpmCandidateConfigMapper.selectByExample(exam);

//			List<String> userlist = new ArrayList<String>();
//			for (SysBpmCandidateConfig cddCfg : cddList) {
//				IUserDeptRoleStrategyService userDeptRoleStrategyService = IUserDeptRoleStrategyServiceFactory.getBy();
//				List<SysUser> list = userDeptRoleStrategyService.getUserNamesBy(cddCfg.getCandidateRole());
//				for (SysUser u : list) {
//					userlist.add(u.getUsername());
//				}
//			}
//			task.addCandidateUsers(userlist);
		}
	}

	@Override
	public boolean isFailOnException() {
		return false;
	}

}
