package com.ut.scf.dao.sys;

import java.util.List;
import java.util.Map;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.pojo.auto.SysRole;

public interface IRoleDao {

	List<Map<String, Object>> selectRoleList(Map<String, Object> paramMap,
			PageInfoBean page);

	List<Map<String, Object>> selectRoleList(Map<String, Object> paramMap);
	
	int countRoleByName(Map<String, Object> paramMap);

	int insertRole(Map<String, Object> paramMap);

	int insertRoleMenu(List<Map<String, Object>> roleMenuList);
	
	SysRole selectRoleById(String roleId);

	int deleteRoleMenu(String roleId);

	int updateRole(Map<String, Object> paramMap);

	List<Map<String, Object>> selectRoleTypeList(int roleType);
	
	List<Map<String, Object>> selectRoleListByCorpId(String corpId);
}
