package com.ut.scf.dao.sys;

import java.util.List;
import java.util.Map;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.pojo.auto.SysFuncInterface;
import com.ut.scf.pojo.auto.SysUser;
import com.ut.scf.pojo.auto.UploadFilePath;

public interface IUserDao {

	List<Map<String, Object>> callExpenseExpireProcedure();

	List<Map<String, Object>> hasMenuUserList(Map<String, Object> paramMap);

	List<Map<String, Object>> hasMenuUserList(Map<String, Object> paramMap, PageInfoBean page);

	int resetPwd(Map<String, Object> paramMap);

	List<UploadFilePath> selectAllFilePath();

	List<SysFuncInterface> selectAllInterface();

	List<Map<String, Object>> selectAllSysConfig();

	List<Map<String, Object>> selectBizLogList(Map<String, Object> paramMap, PageInfoBean page);

	int updatePwd(Map<String, Object> paramMap);

	List<Map<String, Object>> userList(Map<String, Object> paramMap);

	List<Map<String, Object>> userList(Map<String, Object> paramMap, PageInfoBean page);

	Map<String, Object> userLogin(Map<String, Object> paramMap);

	Map<String, Object> userPhoneLogin(String phone);
	
	SysUser selectUserById(String userId);

}