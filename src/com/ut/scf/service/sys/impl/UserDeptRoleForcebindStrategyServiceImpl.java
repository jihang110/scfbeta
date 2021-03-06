package com.ut.scf.service.sys.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.google.common.base.Joiner;
import com.ut.scf.dao.auto.CorpDeptMapper;
import com.ut.scf.dao.auto.SysRoleMapper;
import com.ut.scf.dao.auto.SysUserDeptRoleMapper;
import com.ut.scf.dao.sys.IUserDeptRoleDao;
import com.ut.scf.pojo.auto.CorpDept;
import com.ut.scf.pojo.auto.SysRole;
import com.ut.scf.pojo.auto.SysUser;
import com.ut.scf.pojo.auto.SysUserDeptRole;
import com.ut.scf.pojo.auto.SysUserDeptRoleExample;
import com.ut.scf.service.sys.IUserDeptRoleStrategyService;

/**
 * 用户机构角色关系，第一种策略：用户-机构-角色强绑定关系，即用户选择某个机构的某个角色
 * 
 * @author shenying
 *
 */
@Service("userDeptRoleForcebindStrategyService")
public class UserDeptRoleForcebindStrategyServiceImpl implements IUserDeptRoleStrategyService {

	@Resource
	private SysUserDeptRoleMapper sysUserDeptRoleMapper;

	@Resource
	private IUserDeptRoleDao userDeptRoleDao;

	@Resource
	private CorpDeptMapper corpDeptMapper;

	@Resource
	private SysRoleMapper sysRoleMapper;

	private SysUserDeptRole getMainBy(String userId) {
		SysUserDeptRoleExample udrExample = new SysUserDeptRoleExample();
		SysUserDeptRoleExample.Criteria udrCriteria = udrExample.createCriteria();
		udrCriteria.andUserIdEqualTo(userId);
		udrCriteria.andIsMainEqualTo("Y");
		List<SysUserDeptRole> udrList = sysUserDeptRoleMapper.selectByExample(udrExample);
		return CollectionUtils.isNotEmpty(udrList) ? udrList.get(0) : null;
	}

	@Override
	public CorpDept getMainDeptBy(String userId) {
		SysUserDeptRole main = getMainBy(userId);
		return main != null ? corpDeptMapper.selectByPrimaryKey(main.getDeptId()) : null;
	}

	@Override
	public List<CorpDept> getDeptListBy(String userId) {
		return userDeptRoleDao.getDeptListBy(userId);
	}

	@Override
	public SysRole getMainRoleBy(String userId) {
		SysUserDeptRole main = getMainBy(userId);
		return main != null ? sysRoleMapper.selectByPrimaryKey(main.getRoleId()) : null;
	}

	@Override
	public List<SysRole> getRoleListBy(String userId) {
		return userDeptRoleDao.getRoleListBy(userId);
	}

	@Override
	public List<SysUser> getUserNamesBy(String roleIds, String corpId) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("corpId", corpId);
		param.put("roleId", "'" + Joiner.on("','").join(roleIds.split(",")) + "'");
		return userDeptRoleDao.getUserNamesByForcebind(param);
	}

}
