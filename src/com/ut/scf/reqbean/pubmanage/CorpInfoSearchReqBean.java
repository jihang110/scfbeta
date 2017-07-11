package com.ut.scf.reqbean.pubmanage;

import com.ut.scf.reqbean.PageReqBean;

/**
 * @author shenying
 *
 */
public class CorpInfoSearchReqBean extends PageReqBean {

	private String corpName;

	private String orgnNo;

	private String corpType;

	private String isPage;

	public String getOrgnNo() {
		return orgnNo;
	}

	public void setOrgnNo(String orgnNo) {
		this.orgnNo = orgnNo;
	}

	public String getCorpType() {
		return corpType;
	}

	public void setCorpType(String corpType) {
		this.corpType = corpType;
	}

	public String getIsPage() {
		return isPage;
	}

	public void setIsPage(String isPage) {
		this.isPage = isPage;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

}
