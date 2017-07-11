package com.ut.scf.reqbean.factor;

import com.ut.scf.reqbean.PageReqBean;

public class CustAcIntDeductReqBean extends PageReqBean {

	
	private String intDeductAcId;
	
	private String intDeductAcNm;
	
	private String intDeductAcBkNm;

	private String custId;

    private String custName;

    public String getIntDeductAcId() {
        return intDeductAcId;
    }

    public void setIntDeductAcId(String intDeductAcId) {
        this.intDeductAcId = intDeductAcId;
    }

    public String getIntDeductAcNm() {
        return intDeductAcNm;
    }

    public void setIntDeductAcNm(String intDeductAcNm) {
        this.intDeductAcNm = intDeductAcNm;
    }

    public String getIntDeductAcBkNm() {
        return intDeductAcBkNm;
    }

    public void setIntDeductAcBkNm(String intDeductAcBkNm) {
        this.intDeductAcBkNm = intDeductAcBkNm;
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