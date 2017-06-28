package com.ut.scf.reqbean.factor;

import com.ut.scf.reqbean.PageReqBean;

public class CustAcIouReqBean extends PageReqBean {

	private String iouAcId;
	
	private String iouAcNm;
	
	private String iouAcBkNm;
	
	private String custId;

	
    public String getIouAcId() {
    	return iouAcId;
    }

	
    public void setIouAcId(String iouAcId) {
    	this.iouAcId = iouAcId;
    }

	
    public String getIouAcNm() {
    	return iouAcNm;
    }

	
    public void setIouAcNm(String iouAcNm) {
    	this.iouAcNm = iouAcNm;
    }

	
    public String getIouAcBkNm() {
    	return iouAcBkNm;
    }

	
    public void setIouAcBkNm(String iouAcBkNm) {
    	this.iouAcBkNm = iouAcBkNm;
    }

	
    public String getCustId() {
    	return custId;
    }

	
    public void setCustId(String custId) {
    	this.custId = custId;
    }
	
}