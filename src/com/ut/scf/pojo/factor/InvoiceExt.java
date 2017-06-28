package com.ut.scf.pojo.factor;

import java.math.BigDecimal;
import java.util.Date;

public class InvoiceExt {

	/**
	 * 交易对手名称
	 */
	private String counterPartyNm;

	/**
	 * 交易对手id
	 */
	private String counterPartyId;

	/**
	 * 组织机构代码
	 */
	private String orgnNo;

	/**
	 * 合同编号
	 */
	private String cntNo;

	/**
	 * 合同id
	 */
	private String cntId;

	/**
	 * 产品名称
	 */
	private String productNm;

	/**
	 * 产品id
	 */
	private String productId;

	/**
	 * 未付应付账款总额
	 */
	private BigDecimal unpaidPayableAmt;

	/**
	 * 扣费方式
	 */
	private String deduMethod;

	/**
	 * 费用承担方
	 */
	private String rateBearParty;

	/**
	 * 费率
	 */
	private BigDecimal rate;

	/**
	 * 发票总金额
	 */
	private BigDecimal sumInvAmt;

	/**
	 * 创建人
	 */
	private String createUser;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 删除状态：0 删除，1 正常
	 */
	private Short status;

	/**
	 * 业务日期
	 */
	private Date busiDt;

	/**
	 * 最后更新人
	 */
	private String updateUser;

	/**
	 * 最后更新时间
	 */
	private Date updateTime;

	public String getCounterPartyNm() {
		return counterPartyNm;
	}

	public void setCounterPartyNm(String counterPartyNm) {
		this.counterPartyNm = counterPartyNm;
	}

	public String getOrgnNo() {
		return orgnNo;
	}

	public void setOrgnNo(String orgnNo) {
		this.orgnNo = orgnNo;
	}

	public String getCntNo() {
		return cntNo;
	}

	public void setCntNo(String cntNo) {
		this.cntNo = cntNo;
	}

	public String getCntId() {
		return cntId;
	}

	public void setCntId(String cntId) {
		this.cntId = cntId;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public String getDeduMethod() {
		return deduMethod;
	}

	public void setDeduMethod(String deduMethod) {
		this.deduMethod = deduMethod;
	}

	public String getRateBearParty() {
		return rateBearParty;
	}

	public void setRateBearParty(String rateBearParty) {
		this.rateBearParty = rateBearParty;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getSumInvAmt() {
		return sumInvAmt;
	}

	public void setSumInvAmt(BigDecimal sumInvAmt) {
		this.sumInvAmt = sumInvAmt;
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

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
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

	public BigDecimal getUnpaidPayableAmt() {
		return unpaidPayableAmt;
	}

	public void setUnpaidPayableAmt(BigDecimal unpaidPayableAmt) {
		this.unpaidPayableAmt = unpaidPayableAmt;
	}

	public String getCounterPartyId() {
		return counterPartyId;
	}

	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
