package com.ut.scf.reqbean.factor;

import java.math.BigDecimal;
import java.util.Date;

import com.ut.scf.core.annotation.ShareResource;

public class LoanDetailReqBean {
	/**
	 * 主键
	 */
	private String recUid;

	/**
	 * 主表id
	 */
	private String relaId;

	/**
	 * 发票id
	 */
	private String invcId;
	// 发票编号
	@ShareResource(toShare="invLoanAval")
	private String invcNo;
	// 发票金额
	private String invAmt;
	// 发票日期
	private String invcDate;
	// 起算日
	private String invStartDate;
	// 发票到期日
	private String invDueDate;
	// 合同号
	private String cntrctNo;

	/**
	 * 可融资金额
	 */
	private BigDecimal invLoanAval;

	/**
	 * 发票融资金额
	 */
	private BigDecimal invLoanAmt;

	/**
	 * 融资申请日
	 */
	private Date loanValDt;

	/**
	 * 融资到期日
	 */
	private Date loanDueDt;

	/**
	 * 利息
	 */
	private BigDecimal intAmt;

	/**
	 * 融资状态
	 */
	private String invLoanSts;

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
	private Date busiDt;

	/**
	 * 最后更新人
	 */
	private String updateUser;

	/**
	 * 最后更新时间
	 */
	private Date updateTime;

	public String getInvcNo() {
		return invcNo;
	}

	public void setInvcNo(String invcNo) {
		this.invcNo = invcNo;
	}

	public String getInvAmt() {
		return invAmt;
	}

	public void setInvAmt(String invAmt) {
		this.invAmt = invAmt;
	}

	public String getInvcDate() {
		return invcDate;
	}

	public void setInvcDate(String invcDate) {
		this.invcDate = invcDate;
	}

	public String getInvStartDate() {
		return invStartDate;
	}

	public void setInvStartDate(String invStartDate) {
		this.invStartDate = invStartDate;
	}

	public String getInvDueDate() {
		return invDueDate;
	}

	public void setInvDueDate(String invDueDate) {
		this.invDueDate = invDueDate;
	}

	public String getCntrctNo() {
		return cntrctNo;
	}

	public void setCntrctNo(String cntrctNo) {
		this.cntrctNo = cntrctNo;
	}

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
	 * 主表id
	 * 
	 * @return RELA_ID 主表id
	 */
	public String getRelaId() {
		return relaId;
	}

	/**
	 * 主表id
	 * 
	 * @param relaId
	 *            主表id
	 */
	public void setRelaId(String relaId) {
		this.relaId = relaId;
	}

	/**
	 * 发票id
	 * 
	 * @return INVC_ID 发票id
	 */
	public String getInvcId() {
		return invcId;
	}

	/**
	 * 发票id
	 * 
	 * @param invcId
	 *            发票id
	 */
	public void setInvcId(String invcId) {
		this.invcId = invcId;
	}

	/**
	 * 可融资金额
	 * 
	 * @return INV_LOAN_AVAL 可融资金额
	 */
	public BigDecimal getInvLoanAval() {
		return invLoanAval;
	}

	/**
	 * 可融资金额
	 * 
	 * @param invLoanAval
	 *            可融资金额
	 */
	public void setInvLoanAval(BigDecimal invLoanAval) {
		this.invLoanAval = invLoanAval;
	}

	/**
	 * 发票融资金额
	 * 
	 * @return INV_LOAN_AMT 发票融资金额
	 */
	public BigDecimal getInvLoanAmt() {
		return invLoanAmt;
	}

	/**
	 * 发票融资金额
	 * 
	 * @param invLoanAmt
	 *            发票融资金额
	 */
	public void setInvLoanAmt(BigDecimal invLoanAmt) {
		this.invLoanAmt = invLoanAmt;
	}

	/**
	 * 融资申请日
	 * 
	 * @return LOAN_VAL_DT 融资申请日
	 */
	public Date getLoanValDt() {
		return loanValDt;
	}

	/**
	 * 融资申请日
	 * 
	 * @param loanValDt
	 *            融资申请日
	 */
	public void setLoanValDt(Date loanValDt) {
		this.loanValDt = loanValDt;
	}

	/**
	 * 融资到期日
	 * 
	 * @return LOAN_DUE_DT 融资到期日
	 */
	public Date getLoanDueDt() {
		return loanDueDt;
	}

	/**
	 * 融资到期日
	 * 
	 * @param loanDueDt
	 *            融资到期日
	 */
	public void setLoanDueDt(Date loanDueDt) {
		this.loanDueDt = loanDueDt;
	}

	/**
	 * 利息
	 * 
	 * @return INT_AMT 利息
	 */
	public BigDecimal getIntAmt() {
		return intAmt;
	}

	/**
	 * 利息
	 * 
	 * @param intAmt
	 *            利息
	 */
	public void setIntAmt(BigDecimal intAmt) {
		this.intAmt = intAmt;
	}

	/**
	 * 融资状态
	 * 
	 * @return INV_LOAN_STS 融资状态
	 */
	public String getInvLoanSts() {
		return invLoanSts;
	}

	/**
	 * 融资状态
	 * 
	 * @param invLoanSts
	 *            融资状态
	 */
	public void setInvLoanSts(String invLoanSts) {
		this.invLoanSts = invLoanSts;
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
