package com.ut.scf.dao.factor.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ut.scf.dao.factor.IInvcInfoDao;
import com.ut.scf.respbean.factor.InvcInfoRespBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class IInvcInfoDaoTest {

	@Autowired
	private IInvcInfoDao invcInfoDao;

	@Test
	public void test() {
		List<InvcInfoRespBean> list = invcInfoDao.getInvcListBy("1", "2");
		Assert.assertNotNull(list);
	}

}
