package com.ut.scf.reqbean.factor;

import com.ut.scf.reqbean.PageReqBean;

public class CustAcPayReqBean extends PageReqBean {

	private String acId;

	private String acNm;

	private String acBkNm;
	
	private String custNm;
	
	public String getCustNm() {
		return custNm;
	}

	public void setCustNm(String custNm) {
		this.custNm = custNm;
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