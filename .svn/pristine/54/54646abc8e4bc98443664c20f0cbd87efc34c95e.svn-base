package com.ut.scf.service.sys;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.dao.auto.SysConfigMapper;
import com.ut.scf.pojo.auto.SysConfig;
import com.ut.scf.pojo.auto.SysConfigExample;

@Service
public class SysConfigService {

	private final String SPLIT = "-";
	private final String MODULE = "UserPreference";
	private final String NOTE = "用户偏好设置";

	@Autowired
	private SysConfigMapper sysConfigMapper;

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void saveAndUpdate(SysConfig sysConfig) {
		SysConfigExample exam = new SysConfigExample();
		SysConfigExample.Criteria ctri = exam.createCriteria();
		ctri.andItemKeyEqualTo(sysConfig.getItemKey());
		int cnt = sysConfigMapper.countByExample(exam);
		if (cnt > 0) {
			sysConfigMapper.updateByPrimaryKeySelective(sysConfig);
		} else {
			sysConfigMapper.insert(sysConfig);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void saveUserPreference(Map<String, String> cfgs, String userId) {
		for (Iterator<Entry<String, String>> itr = cfgs.entrySet().iterator(); itr.hasNext();) {
			Entry<String, String> entry = itr.next();
			String key = entry.getKey();
			String val = entry.getValue();

			SysConfig cfg = new SysConfig();
			cfg.setItemKey(key + SPLIT + userId);
			cfg.setItemValue(val);
			cfg.setModuleName(MODULE);
			cfg.setItemNote(NOTE);
			saveAndUpdate(cfg);
		}
	}

	public String getUserPreference(String key, String userId) {
		SysConfigExample exam = new SysConfigExample();
		SysConfigExample.Criteria ctri = exam.createCriteria();
		ctri.andItemKeyEqualTo(key + SPLIT + userId);
		List<SysConfig> cfgs = sysConfigMapper.selectByExample(exam);
		return CollectionUtils.isNotEmpty(cfgs) ? cfgs.get(0).getItemValue() : null;
	}
}
