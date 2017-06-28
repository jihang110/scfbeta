package com.ut.scf.dao.factor.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.dao.factor.ICntrctDao;
import com.ut.scf.respbean.factor.SellerCntRespBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class ICntrctDaoTest {

	@Autowired
	private ICntrctDao cntrctDao;

	@Test
	public void test() {
		PageInfoBean page = new PageInfoBean();
		List<SellerCntRespBean> list = cntrctDao.getSellerCntList("5e03e1b6051a40a1a5b356af4c042e9a", page);
		Assert.assertNotNull(list);
	}
	
	@Test
	public void testCountAcctIdUsed() {
		int cnt  = cntrctDao.countAcctIdUsed("12342");
		Assert.assertNotNull(cnt);
	}
}
