package com.ut.scf.service.factor;

import java.util.List;
import java.util.Map;

import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.bpm.BpmProcessContext;
import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.exception.BizException;
import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.dao.auto.CntrctMapper;
import com.ut.scf.dao.auto.LimitsMapper;
import com.ut.scf.dao.factor.ICntRecomDao;
import com.ut.scf.dao.factor.ICntrctDao;
import com.ut.scf.pojo.auto.Cntrct;
import com.ut.scf.pojo.auto.CntrctExample;
import com.ut.scf.pojo.auto.Limits;
import com.ut.scf.pojo.auto.CntrctExample.Criteria;
import com.ut.scf.reqbean.factor.CntRecomReqBean;
import com.ut.scf.reqbean.factor.SellerCntrctReqBean;
import com.ut.scf.respbean.factor.SellerCntRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.bpm.impl.BaseBpmProcessServiceImpl;


/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月16日 下午2:44:51
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
@Service("sellerCntrctBpmProcessService")
public class SellerCntrctBpmProcessService extends BaseBpmProcessServiceImpl<SellerCntrctReqBean> implements
BpmProcessService<SellerCntrctReqBean>{

	private static final String CNTRCT_APPLY_BPM = "PubSellerCntrctBpm";

	@Autowired
	private CntrctMapper cntrctMapper;
	
	@Autowired
	private ICntrctDao cntrctDao; 
	
	@Autowired
	private ICntRecomDao iCntRecomDao; 

	@Autowired
	private LimitsMapper limitsMapper;
	
	@Override
	public String getProcessDefinitionKey() {
		return CNTRCT_APPLY_BPM;
	}

	@Override
	protected void doAuditAfter(BpmProcessContext<SellerCntrctReqBean> context) {
		super.doAuditAfter(context);
		// 流程结束保存正式业务数据
		if (isProcessInstanceEnded(context)) {
			add(getFormData(context));
		}
	}

	@Override
	protected void doStartBefore(BpmProcessContext<SellerCntrctReqBean> context) {
		super.doStartBefore(context);
		SellerCntrctReqBean ciBean = context.getFormData();
		// 查询正式业务表是否有同名的，如有则抛出异常
		CntrctExample exam = new CntrctExample();
		Criteria crit = exam.createCriteria();
		crit.andCntNoEqualTo(ciBean.getCntNo());
		int count = cntrctMapper.countByExample(exam);
		if (count > 0) {
			log.warn("cntno existed," + ciBean.getCntNo());
			throw new BizException(ErrorCodeEnum.CNT_NO_EXIST);
		}
	}

	@Override
	protected String getProcessInstanceName(ProcessDefinition processDefinition, ProcessInstance processInstance,
			SellerCntrctReqBean formData) {
		return "协议" + formData.getCntNo() + "的" + processDefinition.getName();
	}

	@Transactional(readOnly = true)
	public List<CntRecomReqBean> getList(Map<String, Object> params, PageInfoBean page) {
		List<CntRecomReqBean> list = iCntRecomDao.getCntRecomList(params);
		return list;
	}
	
	public List<CntRecomReqBean> getList(Map<String, Object> params) {
		List<CntRecomReqBean> list = iCntRecomDao.getCntRecomList(params);
		return list;
	}
	
	public String add(SellerCntrctReqBean SellerCntrctReqBean) {
		Cntrct cnt = new Cntrct();
		DozerMapper.copy(SellerCntrctReqBean, cnt);
		cntrctMapper.insert(cnt);
		Limits lmt = new Limits();
		lmt.setCntId(SellerCntrctReqBean.getRecUid());
		lmt.setCorpId(SellerCntrctReqBean.getCustId());
		lmt.setLmtTp("3");
		lmt.setLmtSts("0");
		lmt.setLmtUsingTp(SellerCntrctReqBean.getAmtTp());
		lmt.setLmtAmt(SellerCntrctReqBean.getAssocAmt());
		limitsMapper.insert(lmt);
		return cnt.getRecUid();
	}

	public SellerCntrctReqBean get(String recUid) {
		CntRecomReqBean cnt = iCntRecomDao.selectByKey(recUid);
		SellerCntrctReqBean resp = new SellerCntrctReqBean();
		DozerMapper.copy(cnt, resp);
		return resp;
	}

	public List<SellerCntRespBean> getSellerCntList(String corpId, PageInfoBean page) {
		return cntrctDao.getSellerCntList(corpId, page);
	}
}
