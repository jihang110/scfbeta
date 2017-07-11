package com.ut.scf.dao.factor;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.respbean.factor.SellerCntRespBean;

public interface ICntrctDao {

	List<SellerCntRespBean> getSellerCntList(Map<String, Object> params, PageInfoBean page);

	int countAcctIdUsed(@Param("acctId") String acctId);
}
