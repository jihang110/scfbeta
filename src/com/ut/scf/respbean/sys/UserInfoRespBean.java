package com.ut.scf.respbean.sys;

import java.util.List;

import com.google.common.collect.Lists;
import com.ut.scf.reqbean.sys.UserDeptRoleBean;

/**
 * 单个用户信息
 * @author shenying
 *
 */
public class UserInfoRespBean {

	private String username;
	private String password;
	private String corpId;
	private String note;
	private String mobilephone;
	private String fixedPhone;
	private String email;
	private String realname;
	private String photoUrl;
	private String userId;

	private List<UserDeptRoleBean> deptRoles = Lists.newArrayList();
	
	private String mainRoleId;
	private String mainDeptId;
	private String mainRoleName;
	private String mainDeptName;

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

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
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

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public List<UserDeptRoleBean> getDeptRoles() {
		return deptRoles;
	}

	public void setDeptRoles(List<UserDeptRoleBean> deptRoles) {
		this.deptRoles = deptRoles;
	}

	public String getMainRoleId() {
		return mainRoleId;
	}

	public void setMainRoleId(String mainRoleId) {
		this.mainRoleId = mainRoleId;
	}

	public String getMainDeptId() {
		return mainDeptId;
	}

	public void setMainDeptId(String mainDeptId) {
		this.mainDeptId = mainDeptId;
	}

	public String getMainRoleName() {
		return mainRoleName;
	}

	public void setMainRoleName(String mainRoleName) {
		this.mainRoleName = mainRoleName;
	}

	public String getMainDeptName() {
		return mainDeptName;
	}

	public void setMainDeptName(String mainDeptName) {
		this.mainDeptName = mainDeptName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
