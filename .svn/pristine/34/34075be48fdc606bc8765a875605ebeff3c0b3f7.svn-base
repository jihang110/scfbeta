package com.ut.scf.service.test;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.google.common.collect.Maps;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.respbean.bpm.CompletedTaskRespBean;
import com.ut.scf.service.bpm.BpmCommonService;
import com.ut.scf.service.pubmanage.CorpInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis-test.xml" })
public class DynamicDataSourceSwitchTest {

	@Autowired
	private BpmCommonService bpmCommonService;

	@Autowired
	private CorpInfoService corpInfoService;

	@Test
	public void test() throws ParseException {
		Map<String, Object> paramMap = Maps.newHashMap();
		paramMap.put("userId", "root");
		//paramMap.put("taskName", "综合");
		//paramMap.put("endTime", new Date());
		paramMap.put("startTime", "2017-06-21");
		paramMap.put("procStatus", "1");
		
		PageInfoBean page = new PageInfoBean();
		page.setPageNumber(1);
		page.setPageSize(1000);

		List<CompletedTaskRespBean> tasklist = bpmCommonService.getCompletedTaskList(paramMap, page);
		Assert.notNull(tasklist);

//		Map<String, Object> params2 = Maps.newHashMap();
//		List<CorpInfo> dataList2 = corpInfoService.getList(params2);
//		Assert.notNull(dataList2);
	}

}
