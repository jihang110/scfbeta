package com.ut.scf.respbean.factor;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InvcInfoRespBean {

	private String invcId;

	private String invcNo;

	// 发票到期日
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date invDueDate;

	// 发票金额
	private BigDecimal invAmt;

	// 发票日期
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date invcDate;

	// 起算日
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date invStartDate;

	// 合同号
	private String cntrctNo;

	private String busiDt;

	// 费用，本次默认为零
	private String fee = "0";

	// 可融资金额
	private BigDecimal invLoanAval;
	// 发票融资金额
	private BigDecimal invLoanAmt;
	// 融资申请日
	private String loanValDt;
	// 融资到期日
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date loanDueDt;
	// 利息
	private BigDecimal intAmt;

	public BigDecimal getIntAmt() {
		return intAmt;
	}

	public void setIntAmt(BigDecimal intAmt) {
		this.intAmt = intAmt;
	}

	public Date getLoanDueDt() {
		return loanDueDt;
	}

	public void setLoanDueDt(Date loanDueDt) {
		this.loanDueDt = loanDueDt;
	}

	public String getLoanValDt() {
		return loanValDt;
	}

	public void setLoanValDt(String loanValDt) {
		this.loanValDt = loanValDt;
	}

	public BigDecimal getInvLoanAmt() {
		return invLoanAmt;
	}

	public void setInvLoanAmt(BigDecimal invLoanAmt) {
		this.invLoanAmt = invLoanAmt;
	}

	public BigDecimal getInvLoanAval() {
		return invLoanAval;
	}

	public void setInvLoanAval(BigDecimal invLoanAval) {
		this.invLoanAval = invLoanAval;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public Date getInvcDate() {
		return invcDate;
	}

	public void setInvcDate(Date invcDate) {
		this.invcDate = invcDate;
	}

	public Date getInvStartDate() {
		return invStartDate;
	}

	public void setInvStartDate(Date invStartDate) {
		this.invStartDate = invStartDate;
	}

	public String getInvcId() {
		return invcId;
	}

	public void setInvcId(String invcId) {
		this.invcId = invcId;
	}

	public String getInvcNo() {
		return invcNo;
	}

	public void setInvcNo(String invcNo) {
		this.invcNo = invcNo;
	}

	public Date getInvDueDate() {
		return invDueDate;
	}

	public void setInvDueDate(Date invDueDate) {
		this.invDueDate = invDueDate;
	}

	public BigDecimal getInvAmt() {
		return invAmt;
	}

	public void setInvAmt(BigDecimal invAmt) {
		this.invAmt = invAmt;
	}

	public String getCntrctNo() {
		return cntrctNo;
	}

	public void setCntrctNo(String cntrctNo) {
		this.cntrctNo = cntrctNo;
	}

	public String getBusiDt() {
		return busiDt;
	}

	public void setBusiDt(String busiDt) {
		this.busiDt = busiDt;
	}

}
