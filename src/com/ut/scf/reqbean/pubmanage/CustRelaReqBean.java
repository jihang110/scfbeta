package com.ut.scf.reqbean.pubmanage;

import java.util.Date;
import java.util.List;

/**
 * 关联买卖方请求bean 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月14日 下午3:13:00
 * <p>
 * Company: 友田
 * <p>
 * 
 * @author zhangyx@starutian.com
 * @version 1.0.0
 */
public class CustRelaReqBean {

	private Date busiDt;

	private String counterPartyId;

	private Date createTime;

	private String createUser;

	/**
	 * 客户id
	 */
	private String custId;

	/**
	 * 名称
	 */
	private String corpName;

	/**
	 * 买方名称
	 */
	private String buyerNm;

	/**
	 * 卖方名称
	 */
	private String sellerNm;

	private List<CustRelaListReqBean> sellerList;

	/**
	 * 客户组织机构代码证号
	 */
	private String orgnNo;

	private String recUid;

	private Short status;

	private String sysType;

	private Date updateTime;

	private String updateUser;

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public Date getBusiDt() {
		return busiDt;
	}

	public String getCounterPartyId() {
		return counterPartyId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public String getCustId() {
		return custId;
	}

	public String getRecUid() {
		return recUid;
	}

	public Short getStatus() {
		return status;
	}

	public String getSysType() {
		return sysType;
	}

	public void setSysType(String sysType) {
		this.sysType = sysType;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setBusiDt(Date busiDt) {
		this.busiDt = busiDt;
	}

	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setRecUid(String recUid) {
		this.recUid = recUid;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getBuyerNm() {
		return buyerNm;
	}

	public void setBuyerNm(String buyerNm) {
		this.buyerNm = buyerNm;
	}

	public String getSellerNm() {
		return sellerNm;
	}

	public void setSellerNm(String sellerNm) {
		this.sellerNm = sellerNm;
	}

	public List<CustRelaListReqBean> getSellerList() {
		return sellerList;
	}

	public void setSellerList(List<CustRelaListReqBean> sellerList) {
		this.sellerList = sellerList;
	}

	public String getOrgnNo() {
		return orgnNo;
	}

	public void setOrgnNo(String orgnNo) {
		this.orgnNo = orgnNo;
	}

}