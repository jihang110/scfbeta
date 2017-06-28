package com.ut.scf.core.bpm;

import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

import com.ut.scf.reqbean.bpm.AuditSubmitReqBean;

public class BpmProcessContext<FORMBEAN> {

	private Task task;

	private AuditSubmitReqBean<FORMBEAN> auditSubmitReqBean;

	private String formDataJson;

	private ProcessInstance processInstance;

	private FORMBEAN formData;

	private Class<FORMBEAN> formBeanClass;

	private String processDefinitionKey;

	private boolean isProcessEnd;

	public boolean isProcessEnd() {
		return isProcessEnd;
	}

	public void setProcessEnd(boolean isProcessEnd) {
		this.isProcessEnd = isProcessEnd;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public Class<FORMBEAN> getFormBeanClass() {
		return formBeanClass;
	}

	public void setFormBeanClass(Class<FORMBEAN> formBeanClass) {
		this.formBeanClass = formBeanClass;
	}

	public FORMBEAN getFormData() {
		return formData;
	}

	public void setFormData(FORMBEAN formData) {
		this.formData = formData;
	}

	public ProcessInstance getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

	public String getFormDataJson() {
		return formDataJson;
	}

	public void setFormDataJson(String formDataJson) {
		this.formDataJson = formDataJson;
	}

	public AuditSubmitReqBean<FORMBEAN> getAuditSubmitReqBean() {
		return auditSubmitReqBean;
	}

	public void setAuditSubmitReqBean(AuditSubmitReqBean<FORMBEAN> auditSubmitReqBean) {
		this.auditSubmitReqBean = auditSubmitReqBean;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
