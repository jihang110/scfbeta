package com.ut.scf.reqbean.factor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InvcRegReqBean {

	/**
	 * 主键
	 */
	private String recUid;

	/**
	 * 批次类型
	 */
	private String batchTp;

	/**
	 * 协议id
	 */
	private String cntId;

	/**
	 * 协议编号
	 */
	private String cntNo;

	/**
	 * 产品名称
	 */
	private String productNm;

	/**
	 * 交易对手名称
	 */
	private String counterPartyNm;

	/**
	 * 本次确认发票总额
	 */
	private BigDecimal invcConfirmAmt;

	/**
	 * 待确认发票总额
	 */
	private BigDecimal invcTotalAmt;

	/**
	 * 0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 */
	private String chargeMode;

	/**
	 * 费用承当方
	 */
	private String chargeBear;

	/**
	 * 费率
	 */
	private BigDecimal rate;

	/**
	 * 费用总额
	 */
	private BigDecimal chargeTotalAmt;

	/**
	 * 可转让发票总额
	 */
	private BigDecimal invcTransTotalAmt;

	/**
	 * 本次转让发票总额
	 */
	private BigDecimal invcTransAmt;

	/**
	 * 创建人
	 */
	private String createUser;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 业务日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date busiDt;

	/**
	 * 最后更新人
	 */
	private String updateUser;

	/**
	 * 最后更新时间
	 */
	private Date updateTime;

	/**
	 * 0删除，1正常
	 */
	private Short status;

	private List<InvcInfoReqBean> invcsList;

	/**
	 * 主键
	 * 
	 * @return REC_UID 主键
	 */
	public String getRecUid() {
		return recUid;
	}

	/**
	 * 主键
	 * 
	 * @param recUid
	 *            主键
	 */
	public void setRecUid(String recUid) {
		this.recUid = recUid;
	}

	/**
	 * 批次类型
	 * 
	 * @return BATCH_TP 批次类型
	 */
	public String getBatchTp() {
		return batchTp;
	}

	/**
	 * 批次类型
	 * 
	 * @param batchTp
	 *            批次类型
	 */
	public void setBatchTp(String batchTp) {
		this.batchTp = batchTp;
	}

	/**
	 * 协议id
	 * 
	 * @return CNT_ID 协议id
	 */
	public String getCntId() {
		return cntId;
	}

	/**
	 * 协议id
	 * 
	 * @param cntId
	 *            协议id
	 */
	public void setCntId(String cntId) {
		this.cntId = cntId;
	}

	/**
	 * 本次确认发票总额
	 * 
	 * @return INVC_CONFIRM_AMT 本次确认发票总额
	 */
	public BigDecimal getInvcConfirmAmt() {
		return invcConfirmAmt;
	}

	/**
	 * 本次确认发票总额
	 * 
	 * @param invcConfirmAmt
	 *            本次确认发票总额
	 */
	public void setInvcConfirmAmt(BigDecimal invcConfirmAmt) {
		this.invcConfirmAmt = invcConfirmAmt;
	}

	/**
	 * 待确认发票总额
	 * 
	 * @return INVC_TOTAL_AMT 待确认发票总额
	 */
	public BigDecimal getInvcTotalAmt() {
		return invcTotalAmt;
	}

	/**
	 * 待确认发票总额
	 * 
	 * @param invcTotalAmt
	 *            待确认发票总额
	 */
	public void setInvcTotalAmt(BigDecimal invcTotalAmt) {
		this.invcTotalAmt = invcTotalAmt;
	}

	/**
	 * 0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 * 
	 * @return CHARGE_MODE 0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 */
	public String getChargeMode() {
		return chargeMode;
	}

	/**
	 * 0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 * 
	 * @param chargeMode
	 *            0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 */
	public void setChargeMode(String chargeMode) {
		this.chargeMode = chargeMode;
	}

	/**
	 * 费用承当方
	 * 
	 * @return CHARGE_BEAR 费用承当方
	 */
	public String getChargeBear() {
		return chargeBear;
	}

	/**
	 * 费用承当方
	 * 
	 * @param chargeBear
	 *            费用承当方
	 */
	public void setChargeBear(String chargeBear) {
		this.chargeBear = chargeBear;
	}

	/**
	 * 费率
	 * 
	 * @return RATE 费率
	 */
	public BigDecimal getRate() {
		return rate;
	}

	/**
	 * 费率
	 * 
	 * @param rate
	 *            费率
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	/**
	 * 费用总额
	 * 
	 * @return CHARGE_TOTAL_AMT 费用总额
	 */
	public BigDecimal getChargeTotalAmt() {
		return chargeTotalAmt;
	}

	/**
	 * 费用总额
	 * 
	 * @param chargeTotalAmt
	 *            费用总额
	 */
	public void setChargeTotalAmt(BigDecimal chargeTotalAmt) {
		this.chargeTotalAmt = chargeTotalAmt;
	}

	/**
	 * 可转让发票总额
	 * 
	 * @return INVC_TRANS_TOTAL_AMT 可转让发票总额
	 */
	public BigDecimal getInvcTransTotalAmt() {
		return invcTransTotalAmt;
	}

	/**
	 * 可转让发票总额
	 * 
	 * @param invcTransTotalAmt
	 *            可转让发票总额
	 */
	public void setInvcTransTotalAmt(BigDecimal invcTransTotalAmt) {
		this.invcTransTotalAmt = invcTransTotalAmt;
	}

	/**
	 * 本次转让发票总额
	 * 
	 * @return INVC_TRANS_AMT 本次转让发票总额
	 */
	public BigDecimal getInvcTransAmt() {
		return invcTransAmt;
	}

	/**
	 * 本次转让发票总额
	 * 
	 * @param invcTransAmt
	 *            本次转让发票总额
	 */
	public void setInvcTransAmt(BigDecimal invcTransAmt) {
		this.invcTransAmt = invcTransAmt;
	}

	/**
	 * 创建人
	 * 
	 * @return CREATE_USER 创建人
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * 创建人
	 * 
	 * @param createUser
	 *            创建人
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * 创建时间
	 * 
	 * @return CREATE_TIME 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间
	 * 
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 业务日期
	 * 
	 * @return BUSI_DT 业务日期
	 */
	public Date getBusiDt() {
		return busiDt;
	}

	/**
	 * 业务日期
	 * 
	 * @param busiDt
	 *            业务日期
	 */
	public void setBusiDt(Date busiDt) {
		this.busiDt = busiDt;
	}

	/**
	 * 最后更新人
	 * 
	 * @return UPDATE_USER 最后更新人
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * 最后更新人
	 * 
	 * @param updateUser
	 *            最后更新人
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * 最后更新时间
	 * 
	 * @return UPDATE_TIME 最后更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 最后更新时间
	 * 
	 * @param updateTime
	 *            最后更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 0删除，1正常
	 * 
	 * @return STATUS 0删除，1正常
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * 0删除，1正常
	 * 
	 * @param status
	 *            0删除，1正常
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	public List<InvcInfoReqBean> getInvcsList() {
		return invcsList;
	}

	public void setInvcsList(List<InvcInfoReqBean> invcsList) {
		this.invcsList = invcsList;
	}

	public String getCntNo() {
		return cntNo;
	}

	public void setCntNo(String cntNo) {
		this.cntNo = cntNo;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public String getCounterPartyNm() {
		return counterPartyNm;
	}

	public void setCounterPartyNm(String counterPartyNm) {
		this.counterPartyNm = counterPartyNm;
	}

}