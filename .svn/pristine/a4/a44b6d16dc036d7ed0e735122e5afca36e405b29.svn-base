package com.ut.scf.service.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ut.scf.pojo.auto.SysUser;
import com.ut.scf.service.sys.IUserDeptRoleStrategyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class UserDeptRoleStrategyServiceTest {

	@Resource(name = "userDeptRoleUnbindStrategyService")
	private IUserDeptRoleStrategyService unbindStrategyService;

	@Test
	public void test() {
		String roleIds = "ROLE000005";
		List<SysUser> list = unbindStrategyService.getUserNamesBy(roleIds);
		for (SysUser u : list) {
			System.out.println(u.getUsername());
		}
	}
}
