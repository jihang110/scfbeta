package com.ut.scf.service.factor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ut.scf.core.bpm.BpmProcessContext;
import com.ut.scf.reqbean.factor.InvcRegReqBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.bpm.impl.BaseBpmProcessServiceImpl;

/**
 * 发票登记service类
 * 
 * @author zhangyx@starutian.com
 */
@Service("invcRegBpmService")
public class InvcRegBpmProcessService extends BaseBpmProcessServiceImpl<InvcRegReqBean> implements BpmProcessService<InvcRegReqBean> {

	@Autowired
	private InvcRegService invcRegService;

	private static final String CORPINFO_APPLY_BPM = "FactorInvcRegBpm";

	@Override
	protected void doAuditAfter(BpmProcessContext<InvcRegReqBean> context) {
		super.doAuditAfter(context);
		// 流程结束保存正式业务数据
		if (context.isProcessEnd()) {
			InvcRegReqBean invcRegReqBean = getFormData(context);
			invcRegService.add(invcRegReqBean);
		}
	}

	@Override
	public String getProcessDefinitionKey() {
		return CORPINFO_APPLY_BPM;
	}

}
