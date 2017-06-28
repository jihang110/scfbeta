package com.ut.scf.reqbean.sys;

import java.util.Date;

import com.ut.scf.reqbean.PageReqBean;

/**
 * @author changxin
 */
public class CommonWebListReqBean extends PageReqBean {

	private String corpId;

	private Date createTime;

	private String createUserId;

	/**
	 * 是否分页，0：否，1：是，默认为0.
	 */
	private Integer isPage = 0;

	private String note;

	private String recUid;

	private String websiteAddress;

	private String websiteName;

	public String getCorpId() {
		return corpId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public Integer getIsPage() {
		return isPage;
	}

	public String getNote() {
		return note;
	}

	public String getRecUid() {
		return recUid;
	}

	public String getWebsiteAddress() {
		return websiteAddress;
	}

	public String getWebsiteName() {
		return websiteName;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public void setIsPage(Integer isPage) {
		this.isPage = isPage;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setRecUid(String recUid) {
		this.recUid = recUid;
	}

	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

}
