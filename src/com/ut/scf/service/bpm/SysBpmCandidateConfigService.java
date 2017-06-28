package com.ut.scf.service.bpm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ut.scf.core.util.SpringContextUtil;
import com.ut.scf.dao.auto.SysBpmCandidateConfigMapper;
import com.ut.scf.pojo.auto.SysBpmCandidateConfig;
import com.ut.scf.pojo.auto.SysBpmCandidateConfigExample;
import com.ut.scf.pojo.auto.SysUser;
import com.ut.scf.service.sys.IUserDeptRoleStrategyService;
import com.ut.scf.service.sys.IUserDeptRoleStrategyServiceFactory;

@Service
public class SysBpmCandidateConfigService {

	@Autowired
	private SysBpmCandidateConfigMapper sysBpmCandidateConfigMapper;

	public List<String> getCandidateUserList(String taskKey, String prcDefKey) {
		// 查询节点配置的候选人角色
		SysBpmCandidateConfigMapper sysBpmCandidateConfigMapper = SpringContextUtil
				.getBean(SysBpmCandidateConfigMapper.class);
		SysBpmCandidateConfigExample exam = new SysBpmCandidateConfigExample();
		SysBpmCandidateConfigExample.Criteria crit = exam.createCriteria();
		crit.andPrcDefKeyEqualTo(prcDefKey);
		crit.andTaskIdEqualTo(taskKey);
		List<SysBpmCandidateConfig> cddList = sysBpmCandidateConfigMapper.selectByExample(exam);

		List<String> userlist = new ArrayList<String>();
		for (SysBpmCandidateConfig cddCfg : cddList) {
			IUserDeptRoleStrategyService userDeptRoleStrategyService = IUserDeptRoleStrategyServiceFactory.getBy();
			List<SysUser> list = userDeptRoleStrategyService.getUserNamesBy(cddCfg.getCandidateRole());
			for (SysUser u : list) {
				userlist.add(u.getUserId());
			}
		}

		return userlist;
	}
}
