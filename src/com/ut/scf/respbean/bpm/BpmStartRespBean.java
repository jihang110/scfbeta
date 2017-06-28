package com.ut.scf.respbean.bpm;

/**
 * 发起流程响应
 * 
 * @author shenying
 *
 */
public class BpmStartRespBean {

	private String processInstanceId;

	private String taskId;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

}
