package com.ut.scf.web.scheduled;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.dao.auto.SysConfigMapper;
import com.ut.scf.pojo.auto.Interests;
import com.ut.scf.pojo.auto.SysConfig;
import com.ut.scf.service.factor.InterestsService;
import com.ut.scf.sys.ScfCacheDict;

/**
 * 计息处理
 * 
 * @author shenying
 *
 */
@Component
public class InterestFlowRecordingJob {

	private final Logger log = LoggerFactory.getLogger(OverdueWarningJob.class);

	@Autowired
	private SysConfigMapper sysConfigMapper;

	@Autowired
	private InterestsService interestsService;

	@Scheduled(cron = "0 0 0 * * ?", zone = "GMT+08:00")
	public void execute() throws Exception {
		log.info("start to execute InterestFlowRecordingJob...");
		Date now = new Date();
		// 下个业务日期
		String nextBizDate = DateFormatUtils.format(now, ScfConsts.DATE_FORMAT);
		// 当前业务日期
		// Date curBizDate = ScfBizUtil.getBusiDate();

		// 日终计息处理
		Date intDate = DateUtils.parseDate(nextBizDate, ScfConsts.DATE_FORMAT);
		List<Interests> intList = interestsService.getInterests(intDate);
		for (Interests ints : intList) {
			try {
				interestsService.doProcess(intDate, ints);
			} catch (Exception e) {
				log.error("Interest doProcess error,InterestUid:{}", e, ints.getRecUid());
			}
		}

		// 更新配置表
		SysConfig busiDtCfg = new SysConfig();
		busiDtCfg.setItemKey(ScfConsts.BUSI_DT);
		busiDtCfg.setItemValue(nextBizDate);
		busiDtCfg.setCreateTime(now);
		sysConfigMapper.updateByPrimaryKey(busiDtCfg);

		// 更新缓存中的当前业务日期
		ScfCacheDict.sysConfigMap.put(ScfConsts.BUSI_DT, nextBizDate);
		log.info("complete to execute InterestFlowRecordingJob...");
	}
}
