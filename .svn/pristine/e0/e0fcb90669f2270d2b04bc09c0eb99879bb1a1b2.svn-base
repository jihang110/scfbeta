package com.ut.scf.dao.factor;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.respbean.factor.SellerCntRespBean;

public interface ICntrctDao {

	List<SellerCntRespBean> getSellerCntList(@Param("corpId") String corpId, PageInfoBean page);

	int countAcctIdUsed(@Param("acctId") String acctId);
}
