package com.ut.scf.reqbean.sys;

import java.util.List;

import com.google.common.collect.Lists;
import com.ut.scf.reqbean.BaseReqBean;

public class UserAddReqBean extends BaseReqBean {
	private String username;
	private String password;
	// private String roleId;
	// private String deptId;
	private String corpId;
	private String note;
	private String mobilephone;
	private String fixedPhone;
	private String email;
	private String realname;
	private String photoUrl;

	private List<UserDeptRoleBean> deptRoles = Lists.newArrayList();

	public List<UserDeptRoleBean> getDeptRoles() {
		return deptRoles;
	}

	public void setDeptRoles(List<UserDeptRoleBean> deptRoles) {
		this.deptRoles = deptRoles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getFixedPhone() {
		return fixedPhone;
	}

	public void setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
