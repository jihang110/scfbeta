package com.ut.scf.service.test;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.sys.CorpListReqBean;
import com.ut.scf.service.sys.CorpService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class CorpServiceTest {

	private static final Logger log = LoggerFactory.getLogger(CorpServiceTest.class);

	@Autowired
	private CorpService corpService;

	// @Test
	// public void addCorpTest()
	// {
	// for(int i=0;i<2;i++){
	// log.info("addCorpTest start");
	// CorpAddReqBean bean = new CorpAddReqBean();
	// bean.setCorpName("测试企业"+i);
	// bean.setSysType(2);
	// bean.setOrgnNum("测试组织机构代码"+i);
	// BaseRespBean respBean = corpService.addCorpInfo(bean);
	// log.info("addCorp : " + respBean);
	// Assert.assertNotNull(respBean);
	// log.info("addCorpTest end");
	// }
	// }

	@Test
	public void corpListTest() {
		log.info("**********************************userListTest start*********************************");
		CorpListReqBean reqBean = new CorpListReqBean();
		PageInfoBean page = new PageInfoBean();
		page.setPageNumber(1);
		page.setPageSize(5);
		reqBean.setCorpName("中建八局");
		reqBean.setPage(page);
		List<Map<String, Object>> corpList = corpService.corpList(BeanUtil.beanToMap(reqBean));
		log.info("corpList : " + corpList);
		Assert.assertNotNull(corpList);
		log.info("**********************************userListTest end*********************************");
	}

	// @Test
	// public void updateCorpTest()
	// {
	// log.info("updateCorpTest start");
	// CorpUpdateReqBean reqBean = new CorpUpdateReqBean();
	// reqBean.setCorpId("2c9981e056e4b47b6656e4b47b040000");
	// reqBean.setCorpName("更新测试企业");
	// BaseRespBean respBean = corpService.updateCorp(reqBean);
	// log.info("updateCorp : " + respBean);
	// Assert.assertNotNull(respBean);
	// log.info("updateCorpTest end");
	// }
	//
	// @Test
	// public void deleteCorpTest()
	// {
	// log.info("deleteCorpTest start");
	// CorpDeleteReqBean reqBean = new CorpDeleteReqBean();
	// String CorpId = "2c9981e056e4b47b6656e4b47b040000";
	// reqBean.setCorpId(CorpId);
	// BaseRespBean respBean = corpService.deleteCorp(reqBean);
	// log.info("deleteCorp : " + respBean);
	// Assert.assertNotNull(respBean);
	// log.info("deleteCorpTest end");
	// }

}
