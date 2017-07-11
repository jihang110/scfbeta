package com.ut.scf.service.bpm.impl;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.delegate.Expression;

import com.ut.scf.core.util.SpringContextUtil;
import com.ut.scf.service.bpm.BpmProcessService;

@Deprecated
public class ProcessEndExecutionListenerImpl implements ExecutionListener {

	private static final long serialVersionUID = 8944343670258514299L;

	private Expression bpmProcessServiceName;

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		String svrName = (String) bpmProcessServiceName.getValue(execution);
		BpmProcessService bpmService = SpringContextUtil.getBean(svrName, BpmProcessService.class);
		// bpmService.doProcessEnd(execution);
		
	}

	// protected FORMBEAN getFormData(DelegateExecution execution) {
	// HistoricVariableInstance varInst =
	// execution.getEngineServices().getHistoryService()
	// .createHistoricVariableInstanceQuery().processInstanceId(execution.getProcessInstanceId())
	// .variableName(BpmConsts.FORMDATA_VAR).excludeTaskVariables().singleResult();
	// FORMBEAN formData = JSONObject.parseObject((String) varInst.getValue(),
	// formBeanClass);
	// return formData;
	// }
	public Expression getBpmProcessServiceName() {
		return bpmProcessServiceName;
	}

	public void setBpmProcessServiceName(Expression bpmProcessServiceName) {
		this.bpmProcessServiceName = bpmProcessServiceName;
	}

}
