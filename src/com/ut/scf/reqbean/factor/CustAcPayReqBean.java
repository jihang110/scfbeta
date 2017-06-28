package com.ut.scf.reqbean.factor;

import com.ut.scf.reqbean.PageReqBean;

public class CustAcPayReqBean extends PageReqBean {

	private String acId;

	private String acNm;

	private String acBkNm;
	
	private String custId;
	
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getAcId() {
		return acId;
	}

	public void setAcId(String acId) {
		this.acId = acId;
	}

	public String getAcNm() {
		return acNm;
	}

	public void setAcNm(String acNm) {
		this.acNm = acNm;
	}

	public String getAcBkNm() {
		return acBkNm;
	}

	public void setAcBkNm(String acBkNm) {
		this.acBkNm = acBkNm;
	}

}