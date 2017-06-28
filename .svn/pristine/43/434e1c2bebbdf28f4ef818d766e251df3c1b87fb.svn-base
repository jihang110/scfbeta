package com.ut.scf.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.pojo.auto.DictType;
import com.ut.scf.pojo.auto.DictTypeExample;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.service.sys.DictTypeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class DictTypeServiceTest {

	private static final Logger log = LoggerFactory.getLogger(DictTypeServiceTest.class);

	@Autowired
	private DictTypeService dictTypeService;

	@Test
	public void addDictTypeTest() {
		log.info("****************addDictTypeTest start**************");
		for (int i = 0; i < 5; i++) {
			DictType record = new DictType();
			record.setParentId("parentId" + i);
			record.setTypeName("typeName" + i);
			BaseRespBean respBean = dictTypeService.insertDictType(record);
			log.info("" + respBean);
		}
		log.info("****************addDictTypeTest end**************");
	}

	@Test
	public void deleteDictTypeTest() {
		log.info("****************deleteDictTypeTest start**************");
		String id = "2c9984c25c62bace605e62bacf630004";
		BaseRespBean respBean = dictTypeService.deleteDictType(id);
		log.info("" + respBean);
		log.info("****************deleteDictTypeTest end**************");
	}

	@Test
	public void getDictMaoListTest() {
		log.info("****************getDictMaoListTest start**************");
		DictTypeExample DictTypeExample = new DictTypeExample();
		PageInfoBean page = new PageInfoBean();
		page.setPageNumber(1);
		page.setPageSize(5);
		BaseRespBean respBean = dictTypeService.getDictTypeList(DictTypeExample, page);
		log.info("" + respBean);
		log.info("****************getDictMaoListTest end**************");
	}

	@Test
	public void updateDictTypeTest() {
		log.info("****************updateDictTypeTest start**************");
		DictType record = new DictType();
		record.setParentId("123456");
		record.setTypeName("123456");
		record.setTypeId("2c9984c25c62bace3c8462bacec70000");
		BaseRespBean respBean = dictTypeService.updateDictType(record);
		log.info("" + respBean);
		log.info("****************updateDictTypeTest end**************");
	}
}
