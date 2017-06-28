package com.ut.scf.dao.factor;

import java.util.List;
import java.util.Map;

import com.ut.scf.pojo.factor.InvoiceExt;
import com.ut.scf.respbean.factor.CancIntFeeDetailRespBean;
import org.apache.ibatis.annotations.Param;

import com.ut.scf.respbean.factor.InvcInfoRespBean;

public interface IInvcInfoDao {
	/**
	 * 通过合同编号等查询参数 获取发票编号、合同号、到期日等发票信息
	 *
	 * @param paramMap
	 *            查询参数 key: "cntNo" 合同编号 key: "regBtcId" 登记批次 key: "cnfBtcId"
	 *            确认批次 key: "transBtcId" 转让批次 key: "invStatus" 发票状态 key:
	 *            "invStatusMore" 发票状态List<String>
	 * @return 发票信息
	 */
	@Deprecated
	List<Map<String, Object>> getList(Map<String, Object> paramMap);

	/**
	 * 通过交易对手名称/组织机构代码等查询参数 获取交易对手信息、协议编号/id、产品名称、发票金额等
	 *
	 * @param paramMap
	 *            查询参数 key: "counterPartyNm" 交易对手名称 key: "orgnNo" 交易对手组织机构代码
	 *            key: "invStatus" 发票状态 key: "invStatusMore" 发票状态List<String>
	 * @return 交易信息
	 */
	List<InvoiceExt> getCounterPartyList(Map<String, Object> paramMap);

	/**
	 * 按协议和发票状态查询发票列表
	 * @param cntId 协议ID
	 * @param invStatus 发票状态
	 * @return 发票信息
	 */
	List<InvcInfoRespBean> getInvcListBy(@Param("cntId") String cntId, @Param("invStatus") String invStatus);

	/**
	 * 根据企业ID和发票状态查询发票列表
	 * @param corpId 企业ID
	 * @param type 结算类型
	 * @param invStatus 发票状态
	 * @return 发票列表
	 */
	List<CancIntFeeDetailRespBean> getInvcListByCorpId(@Param("corpId") String corpId, @Param("type") String type, @Param("invStatus") String invStatus);
}
