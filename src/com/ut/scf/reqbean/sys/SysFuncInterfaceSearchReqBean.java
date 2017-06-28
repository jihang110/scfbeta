package com.ut.scf.reqbean.sys;

import java.util.Date;

import com.ut.scf.reqbean.PageReqBean;

public class SysFuncInterfaceSearchReqBean extends PageReqBean {

	private String interfaceId;

	private String interfaceName;

	private String path;

	private String method;

	private Short accessStatus;

	private String note;

	private Date createTime;
	
	private String isPage;
	
	public String getIsPage() {
		return isPage;
	}

	public void setIsPage(String isPage) {
		this.isPage = isPage;
	}

	public String getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(String interfaceId) {
		this.interfaceId = interfaceId;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Short getAccessStatus() {
		return accessStatus;
	}

	public void setAccessStatus(Short accessStatus) {
		this.accessStatus = accessStatus;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}