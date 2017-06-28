package com.ut.scf.service.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Lists;
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.core.util.ThreadContext;
import com.ut.scf.reqbean.pubmanage.ProductDistributionBean;
import com.ut.scf.reqbean.pubmanage.ProductDistributionReqBean;
import com.ut.scf.service.pubmanage.ProductDistributionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class ProductDistributionServiceTest {

	@Autowired
	private ProductDistributionService productDistributionService;

	@Test
	public void test() {
		ThreadContext.put(ScfConsts.SESSION_USER_ID, "root");
		ProductDistributionReqBean bean = new ProductDistributionReqBean();
		List<ProductDistributionBean> prdDistList = Lists.newArrayList();
		bean.setPrdDistList(prdDistList);

		ProductDistributionBean pd = new ProductDistributionBean();
		pd.setRecUid(ScfUUID.generate());
		pd.setCustId("aaaaa");
		pd.setProductId("11111");
		prdDistList.add(pd);
		productDistributionService.add(bean);
	}
}
