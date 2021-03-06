package com.ut.scf.respbean.bpm;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AuditSubmitRespBean {

	// 交易流水号
	private String trxSerialNum;

	// 交易时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date trxTime;

	// 下节点候选人
	private String candidates;

	// 下节点任务名称
	private String nextTaskName;

	// 下个待办任务ID
	private String nextTaskId;

	//流程实例ID
	private String processInstanceId;
	
	//流程定义ID
	private String processDefinitionId;
	
	private String nextGuide;
	
	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getNextTaskId() {
		return nextTaskId;
	}

	public void setNextTaskId(String nextTaskId) {
		this.nextTaskId = nextTaskId;
	}

	public String getTrxSerialNum() {
		return trxSerialNum;
	}

	public void setTrxSerialNum(String trxSerialNum) {
		this.trxSerialNum = trxSerialNum;
	}

	public Date getTrxTime() {
		return trxTime;
	}

	public void setTrxTime(Date trxTime) {
		this.trxTime = trxTime;
	}

	public String getCandidates() {
		return candidates;
	}

	public void setCandidates(String candidates) {
		this.candidates = candidates;
	}

	public String getNextTaskName() {
		return nextTaskName;
	}

	public void setNextTaskName(String nextTaskName) {
		this.nextTaskName = nextTaskName;
	}

	public String getNextGuide() {
		return nextGuide;
	}

	public void setNextGuide(String nextGuide) {
		this.nextGuide = nextGuide;
	}

}
