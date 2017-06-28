package com.ut.scf.dao.sys;

import java.util.List;
import java.util.Map;

import com.ut.scf.pojo.auto.CorpDept;
import com.ut.scf.pojo.auto.SysRole;
import com.ut.scf.pojo.auto.SysUser;

public interface IUserDeptRoleDao {

	/**
	 * 查询用户所属部门
	 * 
	 * @param userId
	 * @return
	 */
	List<CorpDept> getDeptListBy(String userId);

	/**
	 * 查询用户的所有角色
	 * 
	 * @param userId
	 * @return
	 */
	List<SysRole> getRoleListBy(String userId);

	/**
	 * 用户-机构-角色三者为非强绑定关系，按角色或者公司ID查询用户姓名
	 * 
	 * @param paramMap
	 * @return
	 */
	List<SysUser> getUserNamesByUnbind(Map<String, Object> paramMap);

	/**
	 * 用户-机构-角色三者为强绑定关系，按角色或者公司ID查询用户姓名
	 * 
	 * @param paramMap
	 * @return
	 */
	List<SysUser> getUserNamesByForcebind(Map<String, Object> paramMap);
}
