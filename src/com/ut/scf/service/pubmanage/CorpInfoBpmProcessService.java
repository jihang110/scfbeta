package com.ut.scf.service.pubmanage;

import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.exception.BizException;
import com.ut.scf.reqbean.pubmanage.CorpInfoReqBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.bpm.impl.BaseBpmProcessServiceImpl;
import com.ut.scf.sys.bpm.BpmConsts;
import com.ut.scf.sys.bpm.BpmProcessContext;

/**
 * 客户管理
 * 
 * @author shenying
 *
 */
@Service("corpInfoBpmProcessService")
public class CorpInfoBpmProcessService extends BaseBpmProcessServiceImpl<CorpInfoReqBean> implements
		BpmProcessService<CorpInfoReqBean> {

	private static final String CORPINFO_APPLY_BPM = "PubCorpinfoBpm";

	@Autowired
	private CorpInfoService corpInfoService;

	@Override
	public String getProcessDefinitionKey() {
		return CORPINFO_APPLY_BPM;
	}

	@Override
	protected void doAuditAfter(BpmProcessContext<CorpInfoReqBean> context) {
		super.doAuditAfter(context);
		// 流程结束保存正式业务数据
		if (context.isProcessEnd()) {
			CorpInfoReqBean cibean = getFormData(context);

			// 设置客户的所属企业字段，即保理商ID
			String prcInstId = context.getTask().getProcessInstanceId();
			HistoricVariableInstance startCorpIdVar = historyService.createHistoricVariableInstanceQuery()
					.processInstanceId(prcInstId).variableName(BpmConsts.START_USER_CORPID).singleResult();
			cibean.setRelaCorpId((String) startCorpIdVar.getValue());
			if (StringUtils.isEmpty(cibean.getCorpId())) {
				corpInfoService.add(cibean);
			} else {
				corpInfoService.update(cibean);
			}
		}
	}

	@Override
	protected void doStartBefore(BpmProcessContext<CorpInfoReqBean> context) {
		super.doStartBefore(context);
		CorpInfoReqBean ciBean = context.getFormData();
		// 查询正式业务表是否有同名的，如有则抛出异常
		int count = corpInfoService.countByCorpName(ciBean);
		if (count > 0) {
			log.warn("corpname existed," + ciBean.getCorpName());
			throw new BizException(ErrorCodeEnum.CORP_NAME_EXIST);
		}
	}

	@Override
	protected String getProcessInstanceName(ProcessDefinition processDefinition, ProcessInstance processInstance,
			CorpInfoReqBean formData) {
		return "客户" + formData.getCorpName() + "的" + processDefinition.getName();
	}

}
