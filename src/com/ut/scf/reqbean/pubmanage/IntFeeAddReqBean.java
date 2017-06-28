package com.ut.scf.reqbean.pubmanage;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月14日 下午8:02:39
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public class IntFeeAddReqBean {
	private String recUid;
	/**
     * 产品编号
     */
	private String productId;
	/**
     * 产品名称
     */
	private String productNm;
	/**
     * 扣息方式 0.按季结息 1.按月结息 2.到期利随本清 3.预收利息，到期结息
     */
	private String deductIntWay;
	/**
     * 收息日
     */
    private String chargeDay;
    /**
     * 利率
     */
    private BigDecimal intRate;
    /**
     * 扣费方式 0.转让应收账款时支付费用
 1.获得融资款项时支付费用
 2.从费用承担方的息费扣收账户中扣收费用
     */
    private String deductFeeWay;
    /**
     * 费率
     */
    private BigDecimal feeRate;
    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 删除状态：0 删除，1 正常
     */
    private Short status;
	
    
    
    public String getRecUid() {
    	return recUid;
    }


	
    public void setRecUid(String recUid) {
    	this.recUid = recUid;
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

	public String getProductId() {
    	return productId;
    }
	
    public void setProductId(String productId) {
    	this.productId = productId;
    }
	
    public String getProductNm() {
    	return productNm;
    }
	
    public void setProductNm(String productNm) {
    	this.productNm = productNm;
    }
	
    public String getDeductIntWay() {
    	return deductIntWay;
    }
	
    public void setDeductIntWay(String deductIntWay) {
    	this.deductIntWay = deductIntWay;
    }
	
    public String getChargeDay() {
    	return chargeDay;
    }
	
    public void setChargeDay(String chargeDay) {
    	this.chargeDay = chargeDay;
    }
	
    public BigDecimal getIntRate() {
    	return intRate;
    }
	
    public void setIntRate(BigDecimal intRate) {
    	this.intRate = intRate;
    }
	
    public String getDeductFeeWay() {
    	return deductFeeWay;
    }
	
    public void setDeductFeeWay(String deductFeeWay) {
    	this.deductFeeWay = deductFeeWay;
    }
	
    public BigDecimal getFeeRate() {
    	return feeRate;
    }
	
    public void setFeeRate(BigDecimal feeRate) {
    	this.feeRate = feeRate;
    }
    
    
}
