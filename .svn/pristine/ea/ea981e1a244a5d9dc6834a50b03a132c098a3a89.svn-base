package com.ut.scf.service.pubmanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ut.scf.core.bpm.BpmProcessContext;
import com.ut.scf.reqbean.pubmanage.CustRelaReqBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.bpm.impl.BaseBpmProcessServiceImpl;

/**
 * 关联买卖方service类
 * 
 * @author zhangyx@starutian.com
 */
@Service("custRelaBpmService")
public class CustRelaBpmProcessService extends BaseBpmProcessServiceImpl<CustRelaReqBean> implements BpmProcessService<CustRelaReqBean> {

	@Autowired
	private CustRelaService custRelaService;

	private static final String CORPINFO_APPLY_BPM = "PubCustRelaBpm";

	@Override
	protected void doAuditAfter(BpmProcessContext<CustRelaReqBean> context) {
		super.doAuditAfter(context);
		// 流程结束保存正式业务数据
		if (context.isProcessEnd()) {
			CustRelaReqBean custRelaBean = getFormData(context);
			custRelaService.update(custRelaBean);
		}
	}

	@Override
	public String getProcessDefinitionKey() {
		return CORPINFO_APPLY_BPM;
	}

}
