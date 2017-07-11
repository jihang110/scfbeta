package com.ut.scf.dao.factor;

import com.ut.scf.pojo.factor.InvoiceExt;

import java.util.List;
import java.util.Map;

public interface IInvcConfirmDao {

	/**
	 * 通过交易对手名称/组织机构代码等查询参数 获取交易对手信息、协议编号/id、产品名称、发票金额等
	 * 交易对手名称只查询，与该卖方签约了卖方协议的买方信息
	 * 
	 * @param paramMap
	 *            查询参数 key: "counterPartyNm" 交易对手名称 key: "orgnNo" 交易对手组织机构代码
	 *            key: "invStatus" 发票状态 key: "invStatusMore" 发票状态List<String>
	 * @return 交易信息
	 */
	List<InvoiceExt> getCounterPartyList(Map<String, Object> paramMap);

}
