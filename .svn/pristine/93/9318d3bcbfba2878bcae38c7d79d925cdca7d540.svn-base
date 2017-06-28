package com.ut.scf.dao.sys.test;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Maps;
import com.ut.scf.dao.sys.IUserDeptRoleDao;
import com.ut.scf.pojo.auto.CorpDept;
import com.ut.scf.pojo.auto.SysRole;
import com.ut.scf.pojo.auto.SysUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class IUserDeptRoleDaoTest {

	@Autowired
	private IUserDeptRoleDao userDeptRoleDao;

	@Test
	public void testGetDeptListBy() {
		List<CorpDept> deptList = userDeptRoleDao.getDeptListBy("2c9984b45c66d571673a66d571d30000");
		Assert.assertNotNull(deptList);
	}

	@Test
	public void testGetRoleListBy() {
		List<SysRole> deptList = userDeptRoleDao.getRoleListBy("2c9984b45c66d571673a66d571d30000");
		Assert.assertNotNull(deptList);
	}
	
	@Test
	public void testGetUserNamesByUnbind() {
		Map<String,Object> param = Maps.newHashMap();
		param.put("roleId", "'ROLE000001','ROLE000005'");
		param.put("corpId", "corp00001");
		List<SysUser> userNames = userDeptRoleDao.getUserNamesByUnbind(param);
		Assert.assertNotNull(userNames);
	}
	
	@Test
	public void testGetUserNamesByForcebind() {
		Map<String,Object> param = Maps.newHashMap();
		param.put("roleId", "'ROLE000001','ROLE000005'");
		param.put("corpId", "corp00001");
		List<SysUser> userNames = userDeptRoleDao.getUserNamesByForcebind(param);
		Assert.assertNotNull(userNames);
	}
	
	
}
