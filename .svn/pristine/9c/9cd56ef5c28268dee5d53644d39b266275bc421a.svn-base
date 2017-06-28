package com.ut.scf.dao.factor.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.ut.scf.dao.factor.ILimitsDao;
import com.ut.scf.pojo.auto.Limits;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class ILimitsDaoTest {

	@Autowired
	private ILimitsDao limitsDao;

	@Test
	public void test() {
		List<Limits> list = limitsDao.getParentLimitBy("1");
		Assert.notNull(list);
	}
	
	@Test
	public void testUpdateOccStsByAssLmt() {
		 int cnt = limitsDao.updateOccStsByAssLmt("1","0","1");
		 System.out.println(cnt);
	}
}
