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
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.dao.sys.ISysFuncInterfaceDao;
import com.ut.scf.pojo.auto.SysFuncInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class ISysFuncInterfaceDaoTest {

	@Autowired
	private ISysFuncInterfaceDao sysFuncInterfaceDao;

	@Test
	public void testGetList() {
		Map<String, Object> paramMap = Maps.newHashMap();
		paramMap.put("path", "scfcloud");
		paramMap.put("accessStatus", Integer.parseInt("0"));
		
		PageInfoBean page = new PageInfoBean();
		page.setPageNumber(1);
		page.setPageSize(10);
		
		List<SysFuncInterface> list = sysFuncInterfaceDao.getList(paramMap, page);
		Assert.assertNotNull(list);
	}
}
