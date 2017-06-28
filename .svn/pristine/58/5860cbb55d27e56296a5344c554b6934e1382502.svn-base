package com.ut.scf.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ut.scf.reqbean.pubmanage.ProductAddReqBean;
import com.ut.scf.service.pubmanage.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class ProductServiceTest {

	@Autowired
	private ProductService productService;
	 
	@Test
	public void test(){
		ProductAddReqBean reqBean = new ProductAddReqBean();
		reqBean.setProductNm("tttttttttttest");
		reqBean.setProductDescript("tttttttttttest");
		productService.addProduct(reqBean);
	}
	
}
