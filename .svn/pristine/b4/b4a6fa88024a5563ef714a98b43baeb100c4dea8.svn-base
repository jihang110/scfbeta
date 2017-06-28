package com.ut.scf.dao.factor;

import java.util.List;
import java.util.Map;

import com.ut.scf.reqbean.factor.CustAcFeeDeductReqBean;
import com.ut.scf.reqbean.factor.CustAcIntDeductReqBean;
import com.ut.scf.reqbean.factor.CustAcIouReqBean;
import com.ut.scf.reqbean.factor.CustAcPayReqBean;
import com.ut.scf.reqbean.factor.CustAcReceReqBean;


/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月20日 下午2:12:45
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public interface ICustAcDao {
	//查询付款帐号
	List<CustAcPayReqBean> getPayList(Map<String, Object> paramMap);
	//查询回款帐号
	List<CustAcReceReqBean> getReceList(Map<String, Object> paramMap);
	//查询放款帐号
	List<CustAcIouReqBean> getIouList(Map<String, Object> paramMap);
	//查询利息扣收账号
	List<CustAcIntDeductReqBean> getIntDeductList(Map<String, Object> paramMap);
	//查询费用扣收
	List<CustAcFeeDeductReqBean> getFeeDeductList(Map<String, Object> paramMap);
}
