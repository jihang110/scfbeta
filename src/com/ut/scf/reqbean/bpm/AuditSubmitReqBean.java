package com.ut.scf.reqbean.bpm;

import java.util.Map;

public class AuditSubmitReqBean<FORMBEAN> {

	private String taskId;

	private FORMBEAN formData;

	private String direction;

	// 当前节点审批意见
	private Map<String, String> opinions;

	public Map<String, String> getOpinions() {
		return opinions;
	}

	public void setOpinions(Map<String, String> opinions) {
		this.opinions = opinions;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public FORMBEAN getFormData() {
		return formData;
	}

	public void setFormData(FORMBEAN formData) {
		this.formData = formData;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
