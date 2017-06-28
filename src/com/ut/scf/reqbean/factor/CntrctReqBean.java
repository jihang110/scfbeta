package com.ut.scf.reqbean.factor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月22日 下午5:25:48
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * 
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public class CntrctReqBean {

	/**
	 * 协议编号
	 */
	private String recUid;

	/**
	 * 协议编号
	 */
	private String cntNo;

	/**
	 * 协议类型
	 */
	private String cntTp;

	/**
	 * 产品分配id
	 */
	private String productDistId;

	/**
	 * 产品名称
	 */
	private String productId;

	/**
	 * 客户，id
	 */
	private String custId;

	/**
	 * 付款方式
	 */
	private String paymentMode;

	/**
	 * 付款账号
	 */
	private String acId;

	/**
	 * 协调人名称
	 */
	private String coordinatorNm;

	/**
	 * 协调人电子邮箱
	 */
	private String coordinatorEmail;

	/**
	 * 可分配产品额度
	 */
	private BigDecimal releLmtAmt;

	/**
	 * 交易对手id
	 */
	private String counterPartyId;
	/**
	 * 交易对手id
	 */
	private String counterPartyNm;

	/**
	 * 是否推荐
	 */
	private String recomm;

	/**
	 * 关联额度
	 */
	private BigDecimal assocAmt;

	/**
	 * 额度类型
	 */
	private String amtTp;

	/**
	 * 推荐状态
	 */
	private String recommSts;

	/**
	 * 附件名称
	 */
	private String attachNm;

	/**
	 * 文件格式
	 */
	private String attachFormat;

	/**
	 * 文件大小
	 */
	private String attachSize;

	/**
	 * 最大融资比例
	 */
	private String maxLoanRatio;

	/**
	 * 是否锁定融资比例
	 */
	private String loanratioLock;

	/**
	 * 宽限天数
	 */
	private Integer graceDays;

	/**
	 * 融资截止日
	 */
	private Long loanDeadline;

	/**
	 * 0.按季结息 1.按月结息 2.到期利随本清 3.预收利息，到期结息
	 */
	private String intWay;

	/**
	 * 利率
	 */
	private BigDecimal intRate;

	/**
	 * 卖方承担 买方承担
	 */
	private String intParty;

	/**
	 * 0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 */
	private String deduMethod;

	/**
	 * 费率
	 */
	private BigDecimal rate;

	/**
	 * 费用承当方
	 */
	private String rateBearParty;

	/**
	 * 回款账号
	 */
	private String receAcId;

	/**
	 * 放款账号
	 */
	private String iouAcId;

	/**
	 * 利息扣收账号
	 */
	private String intDeductAcId;

	/**
	 * 费用扣收账号
	 */
	private String feeDeductAcId;

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

	/**
	 * 描述
	 */
	private String bewrite;

	/**
	 * 协议编号
	 * 
	 * @return REC_UID 协议编号
	 */
	public String getRecUid() {
		return recUid;
	}

	/**
	 * 协议编号
	 * 
	 * @param recUid
	 *            协议编号
	 */
	public void setRecUid(String recUid) {
		this.recUid = recUid;
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
	 * 协议类型
	 * 
	 * @return CNT_TP 协议类型
	 */
	public String getCntTp() {
		return cntTp;
	}

	/**
	 * 协议类型
	 * 
	 * @param cntTp
	 *            协议类型
	 */
	public void setCntTp(String cntTp) {
		this.cntTp = cntTp;
	}

	/**
	 * 产品分配id
	 * 
	 * @return PRODUCT_DIST_ID 产品分配id
	 */
	public String getProductDistId() {
		return productDistId;
	}

	/**
	 * 产品分配id
	 * 
	 * @param productDistId
	 *            产品分配id
	 */
	public void setProductDistId(String productDistId) {
		this.productDistId = productDistId;
	}

	/**
	 * 产品名称
	 * 
	 * @return PRODUCT_ID 产品名称
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * 产品名称
	 * 
	 * @param productId
	 *            产品名称
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * 客户，id
	 * 
	 * @return CUST_ID 客户，id
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * 客户，id
	 * 
	 * @param custId
	 *            客户，id
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * 付款方式
	 * 
	 * @return PAYMENT_MODE 付款方式
	 */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * 付款方式
	 * 
	 * @param paymentMode
	 *            付款方式
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * 付款账号
	 * 
	 * @return AC_ID 付款账号
	 */
	public String getAcId() {
		return acId;
	}

	/**
	 * 付款账号
	 * 
	 * @param acId
	 *            付款账号
	 */
	public void setAcId(String acId) {
		this.acId = acId;
	}

	/**
	 * 协调人名称
	 * 
	 * @return COORDINATOR_NM 协调人名称
	 */
	public String getCoordinatorNm() {
		return coordinatorNm;
	}

	/**
	 * 协调人名称
	 * 
	 * @param coordinatorNm
	 *            协调人名称
	 */
	public void setCoordinatorNm(String coordinatorNm) {
		this.coordinatorNm = coordinatorNm;
	}
	
    public String getCounterPartyNm() {
    	return counterPartyNm;
    }

	
    public void setCounterPartyNm(String counterPartyNm) {
    	this.counterPartyNm = counterPartyNm;
    }

	/**
	 * 协调人电子邮箱
	 * 
	 * @return COORDINATOR_EMAIL 协调人电子邮箱
	 */
	public String getCoordinatorEmail() {
		return coordinatorEmail;
	}

	/**
	 * 协调人电子邮箱
	 * 
	 * @param coordinatorEmail
	 *            协调人电子邮箱
	 */
	public void setCoordinatorEmail(String coordinatorEmail) {
		this.coordinatorEmail = coordinatorEmail;
	}

	/**
	 * 可分配产品额度
	 * 
	 * @return RELE_LMT_AMT 可分配产品额度
	 */
	public BigDecimal getReleLmtAmt() {
		return releLmtAmt;
	}

	/**
	 * 可分配产品额度
	 * 
	 * @param releLmtAmt
	 *            可分配产品额度
	 */
	public void setReleLmtAmt(BigDecimal releLmtAmt) {
		this.releLmtAmt = releLmtAmt;
	}

	/**
	 * 交易对手id
	 * 
	 * @return COUNTER_PARTY_ID 交易对手id
	 */
	public String getCounterPartyId() {
		return counterPartyId;
	}

	/**
	 * 交易对手id
	 * 
	 * @param counterPartyId
	 *            交易对手id
	 */
	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
	}

	/**
	 * 是否推荐
	 * 
	 * @return RECOMM 是否推荐
	 */
	public String getRecomm() {
		return recomm;
	}

	/**
	 * 是否推荐
	 * 
	 * @param recomm
	 *            是否推荐
	 */
	public void setRecomm(String recomm) {
		this.recomm = recomm;
	}

	/**
	 * 关联额度
	 * 
	 * @return ASSOC_AMT 关联额度
	 */
	public BigDecimal getAssocAmt() {
		return assocAmt;
	}

	/**
	 * 关联额度
	 * 
	 * @param assocAmt
	 *            关联额度
	 */
	public void setAssocAmt(BigDecimal assocAmt) {
		this.assocAmt = assocAmt;
	}

	/**
	 * 额度类型
	 * 
	 * @return AMT_TP 额度类型
	 */
	public String getAmtTp() {
		return amtTp;
	}

	/**
	 * 额度类型
	 * 
	 * @param amtTp
	 *            额度类型
	 */
	public void setAmtTp(String amtTp) {
		this.amtTp = amtTp;
	}

	/**
	 * 推荐状态
	 * 
	 * @return RECOMM_STS 推荐状态
	 */
	public String getRecommSts() {
		return recommSts;
	}

	/**
	 * 推荐状态
	 * 
	 * @param recommSts
	 *            推荐状态
	 */
	public void setRecommSts(String recommSts) {
		this.recommSts = recommSts;
	}

	/**
	 * 附件名称
	 * 
	 * @return ATTACH_NM 附件名称
	 */
	public String getAttachNm() {
		return attachNm;
	}

	/**
	 * 附件名称
	 * 
	 * @param attachNm
	 *            附件名称
	 */
	public void setAttachNm(String attachNm) {
		this.attachNm = attachNm;
	}

	/**
	 * 文件格式
	 * 
	 * @return ATTACH_FORMAT 文件格式
	 */
	public String getAttachFormat() {
		return attachFormat;
	}

	/**
	 * 文件格式
	 * 
	 * @param attachFormat
	 *            文件格式
	 */
	public void setAttachFormat(String attachFormat) {
		this.attachFormat = attachFormat;
	}

	/**
	 * 文件大小
	 * 
	 * @return ATTACH_SIZE 文件大小
	 */
	public String getAttachSize() {
		return attachSize;
	}

	/**
	 * 文件大小
	 * 
	 * @param attachSize
	 *            文件大小
	 */
	public void setAttachSize(String attachSize) {
		this.attachSize = attachSize;
	}

	/**
	 * 最大融资比例
	 * 
	 * @return MAX_LOAN_RATIO 最大融资比例
	 */
	public String getMaxLoanRatio() {
		return maxLoanRatio;
	}

	/**
	 * 最大融资比例
	 * 
	 * @param maxLoanRatio
	 *            最大融资比例
	 */
	public void setMaxLoanRatio(String maxLoanRatio) {
		this.maxLoanRatio = maxLoanRatio;
	}

	/**
	 * 是否锁定融资比例
	 * 
	 * @return LOANRATIO_LOCK 是否锁定融资比例
	 */
	public String getLoanratioLock() {
		return loanratioLock;
	}

	/**
	 * 是否锁定融资比例
	 * 
	 * @param loanratioLock
	 *            是否锁定融资比例
	 */
	public void setLoanratioLock(String loanratioLock) {
		this.loanratioLock = loanratioLock;
	}

	/**
	 * 宽限天数
	 * 
	 * @return GRACE_DAYS 宽限天数
	 */
	public Integer getGraceDays() {
		return graceDays;
	}

	/**
	 * 宽限天数
	 * 
	 * @param graceDays
	 *            宽限天数
	 */
	public void setGraceDays(Integer graceDays) {
		this.graceDays = graceDays;
	}

	/**
	 * 融资截止日
	 * 
	 * @return LOAN_DEADLINE 融资截止日
	 */
	public Long getLoanDeadline() {
		return loanDeadline;
	}

	/**
	 * 融资截止日
	 * 
	 * @param loanDeadline
	 *            融资截止日
	 */
	public void setLoanDeadline(Long loanDeadline) {
		this.loanDeadline = loanDeadline;
	}

	/**
	 * 0.按季结息 1.按月结息 2.到期利随本清 3.预收利息，到期结息
	 * 
	 * @return INT_WAY 0.按季结息 1.按月结息 2.到期利随本清 3.预收利息，到期结息
	 */
	public String getIntWay() {
		return intWay;
	}

	/**
	 * 0.按季结息 1.按月结息 2.到期利随本清 3.预收利息，到期结息
	 * 
	 * @param intWay
	 *            0.按季结息 1.按月结息 2.到期利随本清 3.预收利息，到期结息
	 */
	public void setIntWay(String intWay) {
		this.intWay = intWay;
	}

	/**
	 * 利率
	 * 
	 * @return INT_RATE 利率
	 */
	public BigDecimal getIntRate() {
		return intRate;
	}

	/**
	 * 利率
	 * 
	 * @param intRate
	 *            利率
	 */
	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	/**
	 * 卖方承担 买方承担
	 * 
	 * @return INT_PARTY 卖方承担 买方承担
	 */
	public String getIntParty() {
		return intParty;
	}

	/**
	 * 卖方承担 买方承担
	 * 
	 * @param intParty
	 *            卖方承担 买方承担
	 */
	public void setIntParty(String intParty) {
		this.intParty = intParty;
	}

	/**
	 * 0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 * 
	 * @return DEDU_METHOD 0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 */
	public String getDeduMethod() {
		return deduMethod;
	}

	/**
	 * 0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 * 
	 * @param deduMethod
	 *            0.转让应收账款时支付费用 1.获得融资款项时支付费用 2.从费用承担方的息费扣收账户中扣收费用
	 */
	public void setDeduMethod(String deduMethod) {
		this.deduMethod = deduMethod;
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
	 * 费用承当方
	 * 
	 * @return RATE_BEAR_PARTY 费用承当方
	 */
	public String getRateBearParty() {
		return rateBearParty;
	}

	/**
	 * 费用承当方
	 * 
	 * @param rateBearParty
	 *            费用承当方
	 */
	public void setRateBearParty(String rateBearParty) {
		this.rateBearParty = rateBearParty;
	}

	/**
	 * 回款账号
	 * 
	 * @return RECE_AC_ID 回款账号
	 */
	public String getReceAcId() {
		return receAcId;
	}

	/**
	 * 回款账号
	 * 
	 * @param receAcId
	 *            回款账号
	 */
	public void setReceAcId(String receAcId) {
		this.receAcId = receAcId;
	}

	/**
	 * 放款账号
	 * 
	 * @return IOU_AC_ID 放款账号
	 */
	public String getIouAcId() {
		return iouAcId;
	}

	/**
	 * 放款账号
	 * 
	 * @param iouAcId
	 *            放款账号
	 */
	public void setIouAcId(String iouAcId) {
		this.iouAcId = iouAcId;
	}

	/**
	 * 利息扣收账号
	 * 
	 * @return INT_DEDUCT_AC_ID 利息扣收账号
	 */
	public String getIntDeductAcId() {
		return intDeductAcId;
	}

	/**
	 * 利息扣收账号
	 * 
	 * @param intDeductAcId
	 *            利息扣收账号
	 */
	public void setIntDeductAcId(String intDeductAcId) {
		this.intDeductAcId = intDeductAcId;
	}

	/**
	 * 费用扣收账号
	 * 
	 * @return FEE_DEDUCT_AC_ID 费用扣收账号
	 */
	public String getFeeDeductAcId() {
		return feeDeductAcId;
	}

	/**
	 * 费用扣收账号
	 * 
	 * @param feeDeductAcId
	 *            费用扣收账号
	 */
	public void setFeeDeductAcId(String feeDeductAcId) {
		this.feeDeductAcId = feeDeductAcId;
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
	 * 删除状态：0 删除，1 正常
	 * 
	 * @return STATUS 删除状态：0 删除，1 正常
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * 删除状态：0 删除，1 正常
	 * 
	 * @param status
	 *            删除状态：0 删除，1 正常
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

	/**
	 * 描述
	 * 
	 * @return BEWRITE 描述
	 */
	public String getBewrite() {
		return bewrite;
	}

	/**
	 * 描述
	 * 
	 * @param bewrite
	 *            描述
	 */
	public void setBewrite(String bewrite) {
		this.bewrite = bewrite;
	}
}
