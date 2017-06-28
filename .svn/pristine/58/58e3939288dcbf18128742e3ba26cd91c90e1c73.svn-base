package com.ut.scf.dao.pubmanage;

import java.util.List;
import java.util.Map;

import com.ut.scf.pojo.auto.CustRela;
import com.ut.scf.reqbean.pubmanage.CorpToCust;

public interface ICustRelaDao {

	List<String> getRelaedCusts(Map<String, Object> paramMap);

	int checkRelaById(Map<String, Object> paramMap);

	List<CorpToCust> getList(Map<String, Object> paramMap);

	/**
	 * 查询买/卖方 名称、组织机构代码
	 * 
	 * @param paramMap
	 * @return
	 */
	List<CorpToCust> getCustList(Map<String, Object> paramMap);

	List<CustRela> getCountList(Map<String, Object> paramMap);
	
}
