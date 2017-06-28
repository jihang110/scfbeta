package com.ut.scf.service.test.bpm;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.ExclusiveGateway;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.bpmn.model.SequenceFlow;
import org.activiti.bpmn.model.UserTask;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricDetail;
import org.activiti.engine.history.HistoricFormProperty;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.PvmActivity;
import org.activiti.engine.impl.pvm.PvmTransition;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Maps;
import com.ut.scf.core.bpm.BpmConsts;
import com.ut.scf.core.bpm.BpmProcessConfig;
import com.ut.scf.core.bpm.RouteDirection;
import com.ut.scf.service.bpm.BpmHelpService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class HistoryServiceTest {

	@Autowired
	private TaskService taskService;

	@Autowired
	private HistoryService historyService;

	@Autowired
	private RepositoryService repositoryService;

	@Autowired
	private BpmHelpService bpmHelpService;

	@Autowired
	private RuntimeService runtimeService;

	@Test
	public void test5() {
		BpmProcessConfig cfg = bpmHelpService.getBpmProcessConfig("PubCorpinfoBpm:22:582512");
		Assert.assertNotNull(cfg);
	}

	@Test
	public void test4() {
		String processInstanceId = "342501";
		Task task = taskService.createTaskQuery().processInstanceId(processInstanceId).singleResult();
		String pdefId = "FactorLoanBpm:1:337504";// task.getProcessDefinitionId()
		String key = "KHJL";// task.getTaskDefinitionKey()
		UserTask prvTask = bpmHelpService.getPreviousUserTask(pdefId, key);
		System.out.println(prvTask.getName());
	}

	@Test
	public void test3() {
		String processInstanceId = "342501";
		Task task = taskService.createTaskQuery().processInstanceId(processInstanceId).singleResult();

		ProcessDefinitionEntity def = (ProcessDefinitionEntity) ((RepositoryServiceImpl) repositoryService)
				.getDeployedProcessDefinition(task.getProcessDefinitionId());
		List<ActivityImpl> activitiList = def.getActivities();

		String excId = task.getExecutionId();
		ExecutionEntity execution = (ExecutionEntity) runtimeService.createExecutionQuery().executionId(excId)
				.singleResult();
		String activitiId = execution.getActivityId();

		for (ActivityImpl activityImpl : activitiList) {
			String id = activityImpl.getId();
			if (activitiId.equals(id)) {
				System.out.println("当前任务：" + activityImpl.getProperty("name")); // 输出某个节点的某种属性
				List<PvmTransition> outTransitions = activityImpl.getOutgoingTransitions();// 获取从某个节点出来的所有线路
				for (PvmTransition tr : outTransitions) {
					PvmActivity ac = tr.getDestination(); // 获取线路的终点节点
					System.out.println("下一步任务任务：" + ac.getProperty("name"));
				}

				break;
			}
		}
	}

	@Test
	public void testGetRouteDirections() {
		List<RouteDirection> rdList = bpmHelpService.getRouteDirections("projectSetupProcess:2:5011", "usertask2");
		Assert.assertNotNull(rdList);
	}

	@Test
	public void test2() {
		HistoricVariableInstance varInst = historyService.createHistoricVariableInstanceQuery()
				.processInstanceId("210026").variableName(BpmConsts.FORMDATA_VAR).excludeTaskVariables().singleResult();
		System.out.println((String) varInst.getValue());
	}

	@Test
	public void test() {
		// String taskId = "";
		// Task task =
		// taskService.createTaskQuery().taskId(taskId).singleResult();
		// task.getProcessDefinitionId();
		String userTaskKey = "usertask2";// task.getTaskDefinitionKey();
		ProcessDefinition pdf = repositoryService.createProcessDefinitionQuery()
				.processDefinitionKey("projectSetupProcess").latestVersion().singleResult();

		String processDefinitionId = pdf.getId();
		// 获取bpmnModel对象
		BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
		// 因为我们这里只定义了一个Process 所以获取集合中的第一个即可
		org.activiti.bpmn.model.Process process = bpmnModel.getProcesses().get(0);
		// 获取所有的FlowElement信息
		Collection<FlowElement> flowElements = process.getFlowElements();
		Map<String, FlowElement> elementMap = Maps.newHashMap();
		for (FlowElement e : flowElements) {
			elementMap.put(e.getId(), e);
		}

		FlowElement curElement = elementMap.get(userTaskKey);
		if (curElement instanceof UserTask) {
			UserTask userTask = (UserTask) curElement;
			List<SequenceFlow> outgoings = userTask.getOutgoingFlows();
			for (SequenceFlow sf : outgoings) {
				SequenceFlow f = (SequenceFlow) elementMap.get(sf.getId());

				FlowElement ele = elementMap.get(f.getTargetRef());
				if (ele instanceof ExclusiveGateway) {
					List<SequenceFlow> gatwayFLows = ((ExclusiveGateway) ele).getOutgoingFlows();
					for (SequenceFlow gf : gatwayFLows) {
						System.out.println(gf.getId() + "," + gf.getName());
					}
				}
			}
		}
	}

	@Test
	public void testQueryHisTaskVarList() {
		HistoricVariableInstance var = historyService.createHistoricVariableInstanceQuery().taskId("52520")
				.variableName("hisDataJson").singleResult();
		System.out.println(var.getVariableName() + " " + var.getValue());
	}

	@Test
	public void testQueryHisTaskList() {
		String prcInstId = "27501";// "23932";
		List<HistoricTaskInstance> hisTaskList = historyService.createHistoricTaskInstanceQuery()
				.processInstanceId(prcInstId).list();
		for (HistoricTaskInstance task : hisTaskList) {
			System.out.println(task.getId() + " " + task.getName() + " " + task.getStartTime());
		}

		List<HistoricDetail> detailList = historyService.createNativeHistoricDetailQuery()
				.sql("SELECT * from act_hi_detail where proc_inst_id_ = '27501' and type_ = 'FormProperty'").list();
		for (HistoricDetail detail : detailList) {
			System.out.println(detail.getId());
		}

		HistoricFormProperty detail = (HistoricFormProperty) historyService.createHistoricDetailQuery().taskId("23946")
				.formProperties().singleResult();
		System.out.println(detail.getPropertyId());
		System.out.println(detail.getPropertyValue());
	}
}
