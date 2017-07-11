package com.ut.scf.reqbean.sys;

import org.hibernate.validator.constraints.NotBlank;

import com.ut.scf.reqbean.BaseReqBean;

public class MenuMoveReqBean extends BaseReqBean {
	
	/**
	 * 菜单Id
	 */
	@NotBlank(message = "{menu.menuId.notblank}")
	private String menuId;
	
	private Integer menuOrder;
	
	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

}
