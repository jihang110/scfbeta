package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InvcInfo {

	/**
	 * 主键
	 */
	private String recUid;

	/**
	 * 登记批次id
	 */
	private String regBtcId;

	/**
	 * 确认批次id
	 */
	private String cnfBtcId;

	/**
	 * 转让批次id
	 */
	private String transBtcId;

	/**
	 * 发票编号
	 */
	private String invcNo;

	/**
	 * 合同号
	 */
	private String cntrctNo;

	/**
	 * 发票日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date invcDate;

	/**
	 * 起算日
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date invStartDate;

	/**
	 * 发票到期日
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date invDueDate;

	/**
	 * 发票金额
	 */
	private BigDecimal invAmt;

	/**
	 * 已登记 已确认 已确认已转让 已融资 已全额付款
	 */
	private String invStatus;

	/**
	 * 协议编号
	 */
	private String cntNo;

	/**
	 * 发票收费标志
	 */
	private String isCharge;

	/**
	 * 费用
	 */
	private BigDecimal charge;

	/**
	 * 待确认发票总额
	 */
	private BigDecimal invcTotalAmt;

	/**
	 * 本次确认发票总额
	 */
	private BigDecimal invcConfirmAmt;

	/**
	 * 创建人
	 */
	private String createUser;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 0删除，1正常
	 */
	private Short status;

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
	 * 登记批次id
	 * 
	 * @return REG_BTC_ID 登记批次id
	 */
	public String getRegBtcId() {
		return regBtcId;
	}

	/**
	 * 登记批次id
	 * 
	 * @param regBtcId
	 *            登记批次id
	 */
	public void setRegBtcId(String regBtcId) {
		this.regBtcId = regBtcId;
	}

	/**
	 * 确认批次id
	 * 
	 * @return CNF_BTC_ID 确认批次id
	 */
	public String getCnfBtcId() {
		return cnfBtcId;
	}

	/**
	 * 确认批次id
	 * 
	 * @param cnfBtcId
	 *            确认批次id
	 */
	public void setCnfBtcId(String cnfBtcId) {
		this.cnfBtcId = cnfBtcId;
	}

	/**
	 * 转让批次id
	 * 
	 * @return TRANS_BTC_ID 转让批次id
	 */
	public String getTransBtcId() {
		return transBtcId;
	}

	/**
	 * 转让批次id
	 * 
	 * @param transBtcId
	 *            转让批次id
	 */
	public void setTransBtcId(String transBtcId) {
		this.transBtcId = transBtcId;
	}

	/**
	 * 发票编号
	 * 
	 * @return INVC_NO 发票编号
	 */
	public String getInvcNo() {
		return invcNo;
	}

	/**
	 * 发票编号
	 * 
	 * @param invcNo
	 *            发票编号
	 */
	public void setInvcNo(String invcNo) {
		this.invcNo = invcNo;
	}

	/**
	 * 合同号
	 * 
	 * @return CNTRCT_NO 合同号
	 */
	public String getCntrctNo() {
		return cntrctNo;
	}

	/**
	 * 合同号
	 * 
	 * @param cntrctNo
	 *            合同号
	 */
	public void setCntrctNo(String cntrctNo) {
		this.cntrctNo = cntrctNo;
	}

	/**
	 * 发票日期
	 * 
	 * @return INVC_DATE 发票日期
	 */
	public Date getInvcDate() {
		return invcDate;
	}

	/**
	 * 发票日期
	 * 
	 * @param invcDate
	 *            发票日期
	 */
	public void setInvcDate(Date invcDate) {
		this.invcDate = invcDate;
	}

	/**
	 * 起算日
	 * 
	 * @return INV_START_DATE 起算日
	 */
	public Date getInvStartDate() {
		return invStartDate;
	}

	/**
	 * 起算日
	 * 
	 * @param invStartDate
	 *            起算日
	 */
	public void setInvStartDate(Date invStartDate) {
		this.invStartDate = invStartDate;
	}

	/**
	 * 发票到期日
	 * 
	 * @return INV_DUE_DATE 发票到期日
	 */
	public Date getInvDueDate() {
		return invDueDate;
	}

	/**
	 * 发票到期日
	 * 
	 * @param invDueDate
	 *            发票到期日
	 */
	public void setInvDueDate(Date invDueDate) {
		this.invDueDate = invDueDate;
	}

	/**
	 * 发票金额
	 * 
	 * @return INV_AMT 发票金额
	 */
	public BigDecimal getInvAmt() {
		return invAmt;
	}

	/**
	 * 发票金额
	 * 
	 * @param invAmt
	 *            发票金额
	 */
	public void setInvAmt(BigDecimal invAmt) {
		this.invAmt = invAmt;
	}

	/**
	 * 已登记 已确认 已确认已转让 已融资 已全额付款
	 * 
	 * @return INV_STATUS 已登记 已确认 已确认已转让 已融资 已全额付款
	 */
	public String getInvStatus() {
		return invStatus;
	}

	/**
	 * 已登记 已确认 已确认已转让 已融资 已全额付款
	 * 
	 * @param invStatus
	 *            已登记 已确认 已确认已转让 已融资 已全额付款
	 */
	public void setInvStatus(String invStatus) {
		this.invStatus = invStatus;
	}

	/**
	 * 协议编号
	 * 
	 * @return CNT_NO 协议编号
	 */
	public String getCntNo() {
		return cntNo;
	}

	/**
	 * 协议编号
	 * 
	 * @param cntNo
	 *            协议编号
	 */
	public void setCntNo(String cntNo) {
		this.cntNo = cntNo;
	}

	/**
	 * 发票收费标志
	 * 
	 * @return IS_CHARGE 发票收费标志
	 */
	public String getIsCharge() {
		return isCharge;
	}

	/**
	 * 发票收费标志
	 * 
	 * @param isCharge
	 *            发票收费标志
	 */
	public void setIsCharge(String isCharge) {
		this.isCharge = isCharge;
	}

	/**
	 * 费用
	 * 
	 * @return CHARGE 费用
	 */
	public BigDecimal getCharge() {
		return charge;
	}

	/**
	 * 费用
	 * 
	 * @param charge
	 *            费用
	 */
	public void setCharge(BigDecimal charge) {
		this.charge = charge;
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
}