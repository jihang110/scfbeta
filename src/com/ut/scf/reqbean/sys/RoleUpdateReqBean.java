package com.ut.scf.reqbean.sys;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

public class RoleUpdateReqBean {

	/**
	 * 角色Id
	 */
	@NotBlank(message = "{role.roleId.notblank}")
	private String roleId;
	
	private String roleName;
	
	private String note;
	
	private String menuIdList;

	/**
	 * 添加的功能（接口）列表
	 */
	private List<String> interfaceIdList;
	
	
	public List<String> getInterfaceIdList() {
		return interfaceIdList;
	}

	public void setInterfaceIdList(List<String> interfaceIdList) {
		this.interfaceIdList = interfaceIdList;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getMenuIdList() {
		return menuIdList;
	}

	public void setMenuIdList(String menuIdList) {
		this.menuIdList = menuIdList;
	}

}
