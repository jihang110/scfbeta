package com.ut.scf.reqbean.sys;

import java.util.List;

import com.google.common.collect.Lists;
import com.ut.scf.reqbean.PageReqBean;

public class UserSearchPageReqBean extends PageReqBean {
	private String username;
	private String mobilephone;
	private String corpId;
	private String roleId;
	private String roleName;

	private String deptId;
	private int roleType;
	/**
	 * 是否分页，0：否，1：是，默认为1.
	 */
	private Integer isPage = 1;
	
	private List<UserDeptRoleBean> deptRoles = Lists.newArrayList();
	
	private String menuId;
	

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public int getRoleType() {
		return roleType;
	}

	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}

	public Integer getIsPage() {
		return isPage;
	}

	public void setIsPage(Integer isPage) {
		this.isPage = isPage;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<UserDeptRoleBean> getDeptRoles() {
		return deptRoles;
	}

	public void setDeptRoles(List<UserDeptRoleBean> deptRoles) {
		this.deptRoles = deptRoles;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
}
