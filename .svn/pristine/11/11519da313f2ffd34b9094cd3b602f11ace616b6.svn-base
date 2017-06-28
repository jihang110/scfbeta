package com.ut.scf.respbean.bpm;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AuditHisListRespBean {

	// 审批人
	private String auditor;

	// 审批节点名称
	private String taskName;

	// 审批时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date auditTime;

	// taskId
	private String taskId;

	// 流程定义ID 定义KEY，区分不同流程，路由到不同的审批页
	private String processDefinitionKey;

	// 审批意见
	private String opinion;

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

}
