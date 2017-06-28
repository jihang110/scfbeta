package com.ut.scf.service.bpm;

import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

import com.ut.scf.reqbean.bpm.AuditHisFormDataReqBean;
import com.ut.scf.reqbean.bpm.AuditShowReqBean;
import com.ut.scf.reqbean.bpm.AuditSubmitReqBean;
import com.ut.scf.respbean.bpm.AuditHisFormDataRespBean;
import com.ut.scf.respbean.bpm.AuditShowRespBean;
import com.ut.scf.respbean.bpm.AuditSubmitRespBean;

public interface BpmProcessService<FORMBEAN> {

	/**
	 * 流程定义KEY
	 * 
	 * @return
	 */
	String getProcessDefinitionKey();

	/**
	 * 发起流程
	 * 
	 * @param formData
	 *            表单数据
	 * @return
	 */
	ProcessInstance start(FORMBEAN formData);

	/**
	 * 发起流程，并执行完成第一个节点
	 * 
	 * @param formData
	 * @param assignee
	 *            第一个节点的指定执行人
	 * @return
	 */
	Task startFirstGo(FORMBEAN formData, String assignee);

	/**
	 * 按某个待办任务显示审批页，从流程全局变量中取得表单数据，查询下一节点路由信息
	 * 
	 * @param auditShowReqBean
	 * @return
	 */
	AuditShowRespBean<FORMBEAN> showAudit(AuditShowReqBean auditShowReqBean);

	/**
	 * 按某个待办任务显示审批页，并将此待办指定给执行人，并将从流程全局变量中取得表单数据，查询下一节点路由信息
	 * 
	 * @param auditShowReqBean
	 * @param assignee
	 *            待办任务的指定执行人
	 * @return
	 */
	AuditShowRespBean<FORMBEAN> showAudit(AuditShowReqBean auditShowReqBean, String assignee);

	/**
	 * 完成待办任务，保存表单数据到全局变量和任务本地变量，完成任务之前可设置路由变量，完成任务之前后可保存业务数据
	 * 
	 * @param auditSubmitReqBean
	 * @return
	 */
	AuditSubmitRespBean doAudit(AuditSubmitReqBean<FORMBEAN> auditSubmitReqBean);

	/**
	 * 取得某个历史任务的表单数据
	 * 
	 * @param auditHisFormDataReqBean
	 * @return
	 */
	AuditHisFormDataRespBean<FORMBEAN> getHisFormData(AuditHisFormDataReqBean auditHisFormDataReqBean);
}
