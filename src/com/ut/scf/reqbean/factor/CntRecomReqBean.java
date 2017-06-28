package com.ut.scf.reqbean.factor;


/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月20日 下午4:28:08
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public class CntRecomReqBean {

	private String recUid;
	
	/**
	 * 产品名称
	 */
	private String productNm;
	/**
	 * 额度模式
	 */
	private String lmtMol;
	/**
	 * 关联额度
	 */
	private String assocAmt;

	/**
	 * 额度类型
	 */
	private String amtTp;
	/**
	 * 产品id
	 */
	private String productId;
	/**
	 * 买方名称
	 */
	private String custNm;
	/**
	 * 买方id
	 */
	private String custId;
	/**
	 * 卖方名称
	 */
	private String counterPartyNm;
	/**
	 * 卖方id
	 */
	private String counterPartyId;
	/**
	 * 卖方组织机构代码证号
	 */
	private String selOrgnNo;
    
	/**
	 * 买方组织机构代码证号
	 */
	private String buyOrgnNo;
	
	private String businessLicense;
	
	private String officeAddress;
	
	private String mobPhone;
	
	private String fixedPhone;
	
	private String legalPerson;
	
	private String legalMobPhone;
	
	private String postcode;
	
	private String email;
	
	private String domicileAddr;
	
    public String getBusinessLicense() {
    	return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
    	this.businessLicense = businessLicense;
    }
    
    public String getOfficeAddress() {
    	return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
    	this.officeAddress = officeAddress;
    }

    public String getMobPhone() {
    	return mobPhone;
    }
	
    public void setMobPhone(String mobPhone) {
    	this.mobPhone = mobPhone;
    }
	
    public String getFixedPhone() {
    	return fixedPhone;
    }
	
    public void setFixedPhone(String fixedPhone) {
    	this.fixedPhone = fixedPhone;
    }

	
    public String getLegalPerson() {
    	return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
    	this.legalPerson = legalPerson;
    }

    public String getLegalMobPhone() {
    	return legalMobPhone;
    }
	
    public void setLegalMobPhone(String legalMobPhone) {
    	this.legalMobPhone = legalMobPhone;
    }
	
    public String getPostcode() {
    	return postcode;
    }
	
    public void setPostcode(String postcode) {
    	this.postcode = postcode;
    }
	
    public String getEmail() {
    	return email;
    }

    public void setEmail(String email) {
    	this.email = email;
    }
	
    public String getDomicileAddr() {
    	return domicileAddr;
    }
	
    public void setDomicileAddr(String domicileAddr) {
    	this.domicileAddr = domicileAddr;
    }

	public String getRecUid() {
    	return recUid;
    }
	
    public void setRecUid(String recUid) {
    	this.recUid = recUid;
    }
	
    public String getLmtMol() {
    	return lmtMol;
    }

    public void setLmtMol(String lmtMol) {
    	this.lmtMol = lmtMol;
    }
	
    public String getAssocAmt() {
    	return assocAmt;
    }

    public void setAssocAmt(String assocAmt) {
    	this.assocAmt = assocAmt;
    }

    public String getAmtTp() {
    	return amtTp;
    }

    public void setAmtTp(String amtTp) {
    	this.amtTp = amtTp;
    }

	public String getSelOrgnNo() {
    	return selOrgnNo;
    }

    public void setSelOrgnNo(String selOrgnNo) {
    	this.selOrgnNo = selOrgnNo;
    }
	
    public String getBuyOrgnNo() {
    	return buyOrgnNo;
    }
	
    public void setBuyOrgnNo(String buyOrgnNo) {
    	this.buyOrgnNo = buyOrgnNo;
    }


	public String getProductId() {
    	return productId;
    }

	
    public void setProductId(String productId) {
    	this.productId = productId;
    }
	
    public String getCustId() {
    	return custId;
    }

    public void setCustId(String custId) {
    	this.custId = custId;
    }
	
    public String getCounterPartyId() {
    	return counterPartyId;
    }
	
    public void setCounterPartyId(String counterPartyId) {
    	this.counterPartyId = counterPartyId;
    }

	public String getProductNm() {
    	return productNm;
    }
	
    public void setProductNm(String productNm) {
    	this.productNm = productNm;
    }
	
    public String getCustNm() {
    	return custNm;
    }
	
    public void setCustNm(String custNm) {
    	this.custNm = custNm;
    }
	
    public String getCounterPartyNm() {
    	return counterPartyNm;
    }
	
    public void setCounterPartyNm(String counterPartyNm) {
    	this.counterPartyNm = counterPartyNm;
    }
	
}
