package com.ut.scf.reqbean.factor;

import com.ut.scf.reqbean.PageReqBean;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月16日 下午3:37:00
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * 
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public class SellerCntrctSearchReqBean extends PageReqBean {

	private String isPage;

	private String counterPartyNm;

	private String custNm;

	private String corpName;

	private String orgnNo;

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getOrgnNo() {
		return orgnNo;
	}

	public void setOrgnNo(String orgnNo) {
		this.orgnNo = orgnNo;
	}

	public String getIsPage() {
		return isPage;
	}

	public void setIsPage(String isPage) {
		this.isPage = isPage;
	}

	public String getCounterPartyNm() {
		return counterPartyNm;
	}

	public void setCounterPartyNm(String counterPartyNm) {
		this.counterPartyNm = counterPartyNm;
	}

	public String getCustNm() {
		return custNm;
	}

	public void setCustNm(String custNm) {
		this.custNm = custNm;
	}

}
