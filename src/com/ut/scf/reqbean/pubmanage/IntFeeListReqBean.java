package com.ut.scf.reqbean.pubmanage;

import java.math.BigDecimal;

import com.ut.scf.reqbean.PageReqBean;


/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月14日 下午8:26:22
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public class IntFeeListReqBean extends PageReqBean{

	/**
	 * 息费编号
	 */
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
     * 利率
     */
    private BigDecimal intRate;
    /**
     * 费率
     */
    private BigDecimal feeRate;
	
    
    public String getRecUid() {
    	return recUid;
    }
	
    public void setRecUid(String recUid) {
    	this.recUid = recUid;
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
	
    public BigDecimal getIntRate() {
    	return intRate;
    }
	
    public void setIntRate(BigDecimal intRate) {
    	this.intRate = intRate;
    }
	
    public BigDecimal getFeeRate() {
    	return feeRate;
    }
	
    public void setFeeRate(BigDecimal feeRate) {
    	this.feeRate = feeRate;
    }
    
}
