package com.ut.scf.service.test;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Lists;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.pojo.auto.SysRole;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.respbean.PageListRespBean;

public class RespBeanTest {

	@Test
	public void test() {
		SysRole role = new SysRole();
		role.setRoleId("R0001");
		role.setRoleName("管理员");
		role.setNote("管理员角色超级权限");

		BaseRespBean resp = new BaseRespBean();
		resp.setResultData(role);

		System.out.println(JSONObject.toJSONString(resp));
		// fail("Not yet implemented");
	}
	
	@Test
	public void testDataList() {
		List<SysRole> datalist = Lists.newArrayList();
		
		SysRole role = new SysRole();
		role.setRoleId("R0001");
		role.setRoleName("管理员");
		role.setNote("管理员角色超级权限");
		datalist.add(role);
		
		SysRole role2 = new SysRole();
		role2.setRoleId("R0002");
		role2.setRoleName("业务经理");
		role2.setNote("业务经理角色权限");
		datalist.add(role2);
		
		DataListRespBean resp = new DataListRespBean();
		resp.putDataList(datalist);

		System.out.println(JSONObject.toJSONString(resp));
	}
	
	@Test
	public void testPageDataList() {
		List<SysRole> datalist = Lists.newArrayList();
		
		SysRole role = new SysRole();
		role.setRoleId("R0001");
		role.setRoleName("管理员");
		role.setNote("管理员角色超级权限");
		datalist.add(role);
		
		SysRole role2 = new SysRole();
		role2.setRoleId("R0002");
		role2.setRoleName("业务经理");
		role2.setNote("业务经理角色权限");
		datalist.add(role2);
		
		PageInfoBean page = new PageInfoBean();
		page.setPageNumber(1);
		page.setPageSize(15);
		page.setTotalPage(5);
		page.setTotalRecord(59);
		
		PageListRespBean resp = new PageListRespBean();
		resp.putDataList(datalist, page);

		String json = JSONObject.toJSONString(resp);
		System.out.println(json);
		
		Map<String, Object> map = JSON.parseObject(
				json,new TypeReference<Map<String, Object>>(){} );
		Assert.assertNotNull(map);
	}
	
	

}
