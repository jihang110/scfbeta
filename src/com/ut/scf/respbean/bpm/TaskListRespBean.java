package com.ut.scf.respbean.bpm;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TaskListRespBean {

	// 流程定义ID 定义KEY，区分不同流程，路由到不同的审批页
	private String processDefinitionKey;

	// 流程名称
	private String processDefinitionName;

	// 流程实例ID
	private String processInstanceId;

	// 流程实例名称
	private String processInstanceName;

	// 任务ID
	private String taskId;

	// 最后处理人
	private String lastProcessor;

	// 最后处理时间
	private String lastProcessTime;

	// 流程发起时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date processCreateTime;

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public String getProcessDefinitionName() {
		return processDefinitionName;
	}

	public void setProcessDefinitionName(String processDefinitionName) {
		this.processDefinitionName = processDefinitionName;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceName() {
		return processInstanceName;
	}

	public void setProcessInstanceName(String processInstanceName) {
		this.processInstanceName = processInstanceName;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getLastProcessor() {
		return lastProcessor;
	}

	public void setLastProcessor(String lastProcessor) {
		this.lastProcessor = lastProcessor;
	}

	public String getLastProcessTime() {
		return lastProcessTime;
	}

	public void setLastProcessTime(String lastProcessTime) {
		this.lastProcessTime = lastProcessTime;
	}

	public Date getProcessCreateTime() {
		return processCreateTime;
	}

	public void setProcessCreateTime(Date processCreateTime) {
		this.processCreateTime = processCreateTime;
	}

}
