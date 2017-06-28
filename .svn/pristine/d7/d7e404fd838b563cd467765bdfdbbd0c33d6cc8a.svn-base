package com.ut.scf.service.factor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ut.scf.core.bpm.BpmProcessContext;
import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.dao.auto.CntrctMapper;
import com.ut.scf.dao.auto.LimitsMapper;
import com.ut.scf.pojo.auto.Cntrct;
import com.ut.scf.pojo.auto.Limits;
import com.ut.scf.reqbean.factor.BuyerCntrctReqBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.bpm.impl.BaseBpmProcessServiceImpl;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月15日 下午4:14:33
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * 
 * @author wuk@starutian.com
 * @version 1.0.0
 */
@Service("buyerCntrctBpmProcessService")
public class BuyerCntrctBpmProcessService extends BaseBpmProcessServiceImpl<BuyerCntrctReqBean> implements BpmProcessService<BuyerCntrctReqBean> {

	private static final String CNTRCT_APPLY_BPM = "PubCntrctBpm";

	@Autowired
	private CntrctMapper cntrctMapper;
	
	@Autowired
	private LimitsMapper limitsMapper;

	@Override
	public String getProcessDefinitionKey() {

		return CNTRCT_APPLY_BPM;
	}

	@Override
	protected void doAuditAfter(BpmProcessContext<BuyerCntrctReqBean> context) {
		// 流程结束保存正式业务数据
				if (isProcessInstanceEnded(context)) {
					add(getFormData(context));
				}
	}
	
	public String add(BuyerCntrctReqBean buyerCntrctReqBean) {
		Cntrct cntrct = new Cntrct();
		buyerCntrctReqBean.setCntTp("0");
		DozerMapper.copy(buyerCntrctReqBean, cntrct);
//		还需添加页面的数据获取
		cntrctMapper.insert(cntrct);
		Limits lmt = new Limits();
		lmt.setCntId(buyerCntrctReqBean.getRecUid());
		lmt.setCorpId(buyerCntrctReqBean.getCustId());
		lmt.setLmtTp("2");
		lmt.setLmtSts("0");
		lmt.setLmtUsingTp(buyerCntrctReqBean.getAmtTp());
		lmt.setLmtAmt(buyerCntrctReqBean.getProductLmt());
		limitsMapper.insert(lmt);
		return cntrct.getRecUid();
	}

}
