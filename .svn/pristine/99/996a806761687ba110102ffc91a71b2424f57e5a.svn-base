package com.ut.scf.service.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.pojo.auto.DictMap;
import com.ut.scf.pojo.auto.DictMapExample;
import com.ut.scf.reqbean.sys.DictListReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.service.sys.DictMapService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class DictMapServiceTest {

	private static final Logger log = LoggerFactory.getLogger(DictMapServiceTest.class);

	@Autowired
	private DictMapService dictMapService;

	@Test
	public void addDictMapTest() {
		log.info("****************addDictMapTest start**************");
		for (int i = 0; i < 5; i++) {
			DictMap record = new DictMap();
			record.setKey("key" + i);
			record.setValue("value" + i);
			record.setNote("note" + i);
			record.setParentId("id" + i);
			record.setStatus((short) i);
			record.setTypeId("typeId" + i);
			BaseRespBean respBean = dictMapService.insertDictMap(record);
			log.info("" + respBean);
		}
		log.info("****************addDictMapTest end**************");
	}

	@Test
	public void deleteDictMapTest() {
		log.info("****************deleteDictMapTest start**************");
		String id = "2c9984c25c6806686cc26806691a0003";
		BaseRespBean respBean = dictMapService.deleteDictMap(id);
		log.info("" + respBean);
		log.info("****************deleteDictMapTest end**************");
	}

	@Test
	public void getDictMapList() {
		log.info("****************getDictMapList start**************");
		DictListReqBean dictListReqBean = new DictListReqBean();
		// dictListReqBean.setIsPage(1);
		// dictListReqBean.setPageNumber(1);
		// dictListReqBean.setPageSize(5);
		List<Map<String, Object>> respBean = dictMapService.getDictMapList(BeanUtil.beanToMap(dictListReqBean));
		log.info("" + respBean);
		log.info("****************getDictMapList end**************");
	}

	@Test
	public void getDictMapListTest() {
		log.info("****************getDictMapListTest start**************");
		DictMapExample dictMapExample = new DictMapExample();
		PageInfoBean page = new PageInfoBean();
		page.setPageNumber(1);
		page.setPageSize(5);
		BaseRespBean respBean = dictMapService.getDictMapPageList(dictMapExample, page);
		log.info("" + respBean);
		log.info("****************getDictMapListTest end**************");
	}

	@Test
	public void updateDictMapTest() {
		log.info("****************updateDictMapTest start**************");
		DictMap record = new DictMap();
		record.setId("2c9984c25c62b2c54bff62b2c5bd0004");
		record.setKey("key" + 11);
		record.setValue("value" + 11);
		record.setNote("note" + 11);
		record.setParentId("id" + 11);
		record.setStatus((short) 11);
		record.setTypeId("typeId" + 11);
		BaseRespBean respBean = dictMapService.updateDictMap(record);
		log.info("" + respBean);
		log.info("****************updateDictMapTest end**************");
	}
}
