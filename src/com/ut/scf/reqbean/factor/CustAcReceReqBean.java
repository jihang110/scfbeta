package com.ut.scf.reqbean.factor;

import com.ut.scf.reqbean.PageReqBean;

public class CustAcReceReqBean extends PageReqBean {

	private String receAcId;
	
	private String receAcNm;
	
	private String receAcBkNm;
	
	private String custId;

	private String custName;

    public String getReceAcId() {
        return receAcId;
    }

    public void setReceAcId(String receAcId) {
        this.receAcId = receAcId;
    }

    public String getReceAcNm() {
        return receAcNm;
    }

    public void setReceAcNm(String receAcNm) {
        this.receAcNm = receAcNm;
    }

    public String getReceAcBkNm() {
        return receAcBkNm;
    }

    public void setReceAcBkNm(String receAcBkNm) {
        this.receAcBkNm = receAcBkNm;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
}