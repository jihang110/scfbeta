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
import com.ut.scf.dao.bpm.IActiTaskDao;
import com.ut.scf.respbean.bpm.CompletedTaskRespBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class IActiTaskDaoTest {

	@Autowired
	private IActiTaskDao actiTaskDao;

	@Test
	public void test() {
		Map<String, Object> paramMap = Maps.newHashMap();
		 paramMap.put("userId", "root");
		 paramMap.put("taskName", "综合");

		PageInfoBean page = new PageInfoBean();
		page.setPageNumber(1);
		page.setPageSize(10);

		List<CompletedTaskRespBean> list = actiTaskDao.getCompletedTaskList(paramMap, page);
		Assert.assertNotNull(list);
	}

}
