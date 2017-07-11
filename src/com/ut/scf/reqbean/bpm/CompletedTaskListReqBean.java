package com.ut.scf.reqbean.bpm;

import com.ut.scf.reqbean.PageReqBean;

public class CompletedTaskListReqBean extends PageReqBean {

	private String taskName;

	private String procDefName;

	private String startTime;

	private String endTime;

	// 1已结，0未结
	private String procStatus;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getProcDefName() {
		return procDefName;
	}

	public void setProcDefName(String procDefName) {
		this.procDefName = procDefName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getProcStatus() {
		return procStatus;
	}

	public void setProcStatus(String procStatus) {
		this.procStatus = procStatus;
	}

}
