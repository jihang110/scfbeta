package com.ut.scf.service.factor;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.dao.factor.ICustAcDao;
import com.ut.scf.reqbean.factor.CustAcFeeDeductReqBean;
import com.ut.scf.reqbean.factor.CustAcIntDeductReqBean;
import com.ut.scf.reqbean.factor.CustAcIouReqBean;
import com.ut.scf.reqbean.factor.CustAcPayReqBean;
import com.ut.scf.reqbean.factor.CustAcReceReqBean;


/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月20日 下午2:31:45
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
@Service
public class CustAcService {

	@Resource
	private ICustAcDao iCustAcDao;
	
	@Transactional(readOnly = true)
	public List<CustAcPayReqBean> getPayList(Map<String, Object> paramMap, PageInfoBean page) {

		
		List<CustAcPayReqBean> list = iCustAcDao.getPayList(paramMap);
		return list;
	}
	@Transactional(readOnly = true)
	public List<CustAcReceReqBean> getReceList(Map<String, Object> paramMap, PageInfoBean page) {
		
		
		List<CustAcReceReqBean> list = iCustAcDao.getReceList(paramMap);
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<CustAcIouReqBean> getIouList(Map<String, Object> paramMap, PageInfoBean page) {
		
		
		List<CustAcIouReqBean> list = iCustAcDao.getIouList(paramMap);
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<CustAcIntDeductReqBean> getIntDeductList(Map<String, Object> paramMap, PageInfoBean page) {
		
		
		List<CustAcIntDeductReqBean> list = iCustAcDao.getIntDeductList(paramMap);
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<CustAcFeeDeductReqBean> getFeeDeductList(Map<String, Object> paramMap, PageInfoBean page) {
		
		
		List<CustAcFeeDeductReqBean> list = iCustAcDao.getFeeDeductList(paramMap);
		return list;
	}
	
	
}
