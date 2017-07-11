package com.ut.scf.reqbean.factor;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class InvcConfirmReqBean {

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
	 * 交易对手Id
	 */
	private String counterPartyId;

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

	public String getRecUid() {
		return recUid;
	}

	public void setRecUid(String recUid) {
		this.recUid = recUid;
	}

	public String getBatchTp() {
		return batchTp;
	}

	public void setBatchTp(String batchTp) {
		this.batchTp = batchTp;
	}

	public String getCntId() {
		return cntId;
	}

	public void setCntId(String cntId) {
		this.cntId = cntId;
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

	public String getCounterPartyId() {
		return counterPartyId;
	}

	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
	}

	public String getCounterPartyNm() {
		return counterPartyNm;
	}

	public void setCounterPartyNm(String counterPartyNm) {
		this.counterPartyNm = counterPartyNm;
	}

	public BigDecimal getInvcConfirmAmt() {
		return invcConfirmAmt;
	}

	public void setInvcConfirmAmt(BigDecimal invcConfirmAmt) {
		this.invcConfirmAmt = invcConfirmAmt;
	}

	public BigDecimal getInvcTotalAmt() {
		return invcTotalAmt;
	}

	public void setInvcTotalAmt(BigDecimal invcTotalAmt) {
		this.invcTotalAmt = invcTotalAmt;
	}

	public String getChargeMode() {
		return chargeMode;
	}

	public void setChargeMode(String chargeMode) {
		this.chargeMode = chargeMode;
	}

	public String getChargeBear() {
		return chargeBear;
	}

	public void setChargeBear(String chargeBear) {
		this.chargeBear = chargeBear;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getChargeTotalAmt() {
		return chargeTotalAmt;
	}

	public void setChargeTotalAmt(BigDecimal chargeTotalAmt) {
		this.chargeTotalAmt = chargeTotalAmt;
	}

	public BigDecimal getInvcTransTotalAmt() {
		return invcTransTotalAmt;
	}

	public void setInvcTransTotalAmt(BigDecimal invcTransTotalAmt) {
		this.invcTransTotalAmt = invcTransTotalAmt;
	}

	public BigDecimal getInvcTransAmt() {
		return invcTransAmt;
	}

	public void setInvcTransAmt(BigDecimal invcTransAmt) {
		this.invcTransAmt = invcTransAmt;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getBusiDt() {
		return busiDt;
	}

	public void setBusiDt(Date busiDt) {
		this.busiDt = busiDt;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public List<InvcInfoReqBean> getInvcsList() {
		return invcsList;
	}

	public void setInvcsList(List<InvcInfoReqBean> invcsList) {
		this.invcsList = invcsList;
	}
}