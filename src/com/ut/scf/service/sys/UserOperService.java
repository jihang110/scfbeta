package com.ut.scf.service.sys;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.dict.ScfBizConsts;
import com.ut.scf.core.exception.BizException;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.SysBizLogMapper;
import com.ut.scf.dao.auto.SysConfigMapper;
import com.ut.scf.dao.auto.SysFuncInterfaceMapper;
import com.ut.scf.dao.auto.SysRoleMapper;
import com.ut.scf.dao.auto.SysUserDeptRoleMapper;
import com.ut.scf.dao.auto.SysUserMapper;
import com.ut.scf.dao.auto.UploadFilePathMapper;
import com.ut.scf.dao.sys.IMenuDao;
import com.ut.scf.dao.sys.IUserDao;
import com.ut.scf.pojo.auto.CorpDept;
import com.ut.scf.pojo.auto.SysBizLog;
import com.ut.scf.pojo.auto.SysConfig;
import com.ut.scf.pojo.auto.SysFuncInterface;
import com.ut.scf.pojo.auto.SysRole;
import com.ut.scf.pojo.auto.SysUser;
import com.ut.scf.pojo.auto.SysUserDeptRole;
import com.ut.scf.pojo.auto.SysUserDeptRoleExample;
import com.ut.scf.pojo.auto.SysUserExample;
import com.ut.scf.pojo.auto.SysUserExample.Criteria;
import com.ut.scf.pojo.auto.UploadFilePath;
import com.ut.scf.pojo.auto.UploadFilePathExample;
import com.ut.scf.reqbean.sys.BizLogListReqBean;
import com.ut.scf.reqbean.sys.UserAddReqBean;
import com.ut.scf.reqbean.sys.UserDeptRoleBean;
import com.ut.scf.reqbean.sys.UserModPwdReqBean;
import com.ut.scf.reqbean.sys.UserSearchPageReqBean;
import com.ut.scf.reqbean.sys.UserUpdateReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.respbean.sys.SysConfigRespBean;
import com.ut.scf.respbean.sys.UserInfoRespBean;
import com.ut.scf.respbean.sys.UserLoginRespBean;
import com.ut.scf.sys.util.ScfBizUtil;

/**
 * 用户操作相关service类
 * 
 * @author sunll
 */
@Service
public class UserOperService {


	@Resource
	private IMenuDao menuDao;

	@Resource
	private SysBizLogMapper sysBizLogMapper;

	@Resource
	private SysConfigMapper sysConfigMapper;

	@Resource
	private SysFuncInterfaceMapper sysFuncInterfaceMapper;

	@Resource
	private SysUserDeptRoleMapper sysUserDeptRoleMapper;

	@Resource
	private SysUserMapper sysuserMapper;
	
	@Resource
	private SysRoleMapper sysroleMapper;

	@Resource
	private UploadFilePathMapper uploadFilePathMapper;

	@Resource
	private IUserDao userDao;

	
	public SysUser getById(String userId) {
		return sysuserMapper.selectByPrimaryKey(userId);
	}
	
	@Transactional(readOnly = true)
	public int countUserByPhone(String phone) {

		SysUserExample sysmobilephoneExample = new SysUserExample();
		Criteria criteriaPhone = sysmobilephoneExample.createCriteria();
		criteriaPhone.andMobilephoneEqualTo(phone);
		criteriaPhone.andStatusEqualTo((short) 1);
		return sysuserMapper.countByExample(sysmobilephoneExample);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public int deleteUser(String userId) {
		SysUser user = new SysUser();
		user.setUserId(userId);
		user.setStatus((short) ScfBizConsts.STATUS_DELETE);
		return sysuserMapper.deleteByPrimaryKey(userId);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public int deleteUserDeptRole(String userId) {
		SysUserDeptRoleExample exam = new SysUserDeptRoleExample();
		com.ut.scf.pojo.auto.SysUserDeptRoleExample.Criteria example = exam.createCriteria();
		example.andUserIdEqualTo(userId);
		return sysUserDeptRoleMapper.deleteByExample(exam);
	}

	@Transactional(readOnly = true)
	public List<SysFuncInterface> getAllInterFace() {
		return userDao.selectAllInterface();
	}

	@Transactional(readOnly = true)
	public List<Map<String, Object>> getAllSysConfig() {
		return userDao.selectAllSysConfig();
	}

	@Transactional(readOnly = true)
	public List<UploadFilePath> getAllUploadFilePath() {
		UploadFilePathExample uploadExampl = new UploadFilePathExample();
		return uploadFilePathMapper.selectByExample(uploadExampl);
	}

	@Transactional(readOnly = true)
	public BaseRespBean getBizLogList(BizLogListReqBean reqBean) {
		// 结束时间，加上时分秒，不然取不到结束那天的数据
		if (reqBean.getEndDate() != null) {
			reqBean.setEndDate(reqBean.getEndDate() + " 23:59:59");
		}
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		PageInfoBean page = new PageInfoBean();
		List<Map<String, Object>> list = userDao.selectBizLogList(paramMap, page);
		PageListRespBean pageListBean = new PageListRespBean();
		pageListBean.putDataList(list, page);
		return pageListBean;
	}

	public UserInfoRespBean getBy(String userId) {
		UserInfoRespBean resp = new UserInfoRespBean();
		SysUser user = sysuserMapper.selectByPrimaryKey(userId);
		BeanUtil.BeanToBean(resp, user);
		// 查询用户的机构角色关系表，查询用户的主部门角色信息
		IUserDeptRoleStrategyService userDeptRoleStrategyService = IUserDeptRoleStrategyServiceFactory.getBy();
		CorpDept mainDept = userDeptRoleStrategyService.getMainDeptBy(user.getUserId());
		if (mainDept != null) {
			resp.setMainDeptId(mainDept.getDeptId());
			resp.setMainDeptName(mainDept.getDeptName());
		}
		SysRole mainRole = userDeptRoleStrategyService.getMainRoleBy(user.getUserId());
		if (mainRole != null) {
			resp.setMainRoleId(mainRole.getRoleId());
			resp.setMainRoleName(mainRole.getRoleName());
		}

		// 查询用户机构角色关系
		SysUserDeptRoleExample udrExample = new SysUserDeptRoleExample();
		SysUserDeptRoleExample.Criteria udrCriteria = udrExample.createCriteria();
		udrCriteria.andUserIdEqualTo(user.getUserId());
		List<SysUserDeptRole> udrList = sysUserDeptRoleMapper.selectByExample(udrExample);

		List<UserDeptRoleBean> udrBeanList = Lists.newArrayList();
		for (SysUserDeptRole udr : udrList) {
			UserDeptRoleBean b = new UserDeptRoleBean();
			b.setMainDeptId(udr.getDeptId());
			b.setMainRoleId(udr.getRoleId());
			udrBeanList.add(b);
		}
		resp.setDeptRoles(udrBeanList);
		resp.setUserId(userId);
		return resp;
	}

	public BaseRespBean getSysConfigByKey(Map<String, Object> paramMap) {
		SysConfig result = sysConfigMapper.selectByPrimaryKey((String) paramMap.get("itemKey"));
		SysConfigRespBean respBean = new SysConfigRespBean();

		BeanUtil.mapToBean(BeanUtil.beanToMap(result), respBean);
		return respBean;
	}

	/**
	 * 条件查询 分页获取带有特定菜单的user
	 * 
	 * @param paramMap
	 * @param page
	 */

	@Transactional(readOnly = true)
	public BaseRespBean hasMenuUserList(UserSearchPageReqBean searchPage) {
		Map<String, Object> paramMap = BeanUtil.beanToMap(searchPage);

		// 是否分页，0：否，1：是
		if (searchPage.getIsPage() == 1) {
			PageListRespBean pageListBean = new PageListRespBean();
			PageInfoBean page = searchPage.getPage();
			List<Map<String, Object>> resultList = userDao.hasMenuUserList(paramMap, page);
			pageListBean.putDataList(resultList, page);
			return pageListBean;
		} else {
			List<Map<String, Object>> resultList = userDao.hasMenuUserList(paramMap);
			DataListRespBean listBean = new DataListRespBean();
			listBean.putDataList(resultList);
			return listBean;
		}
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean insertBizLog(SysBizLog sysBizLog) {
		BaseRespBean respBean = new BaseRespBean();
		int insertLogNum = sysBizLogMapper.insert(sysBizLog);
		if (insertLogNum < 1) {
			respBean.setResult(ErrorCodeEnum.ADD_FAILED);
		}
		return respBean;
	}

	/**
	 * 新增user
	 * 
	 * @param addUserBean
	 */

	@Transactional(propagation = Propagation.REQUIRED)
	public String insertUser(UserAddReqBean addUserBean) {
		String username = addUserBean.getUsername();
		String mobilephone = addUserBean.getMobilephone();
		SysUserExample sysUserExample = new SysUserExample();
		Criteria criteria = sysUserExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andStatusEqualTo((short) 1);
		int hasUser = sysuserMapper.countByExample(sysUserExample);
		
		SysUserExample sysmobilephoneExample = new SysUserExample();
		Criteria criteriaPhone = sysmobilephoneExample.createCriteria();
		criteriaPhone.andMobilephoneEqualTo(mobilephone);
		criteriaPhone.andStatusEqualTo((short) 1);
		int hasmobilephone = sysuserMapper.countByExample(sysmobilephoneExample);
		String userId = ScfUUID.generate();

		if (hasUser < 1) {
			if (hasmobilephone < 1) {
				SysUser user = new SysUser();
				user.setUserId(userId);
				user.setUsername(addUserBean.getUsername());
				user.setPassword(addUserBean.getPassword());
				user.setRealname(addUserBean.getRealname());
				// user.setDeptId(addUserBean.getDeptId());
				//user.setCorpId(ScfConsts.SESSION_CORP_NODE);
				user.setCorpId(addUserBean.getCorpId());
				user.setEmail(addUserBean.getEmail());
				user.setFixedPhone(addUserBean.getFixedPhone());
				user.setNote(addUserBean.getNote());
				user.setMobilephone(addUserBean.getMobilephone());
				user.setPhotoUrl(addUserBean.getPhotoUrl());
				user.setStatus((short) 1);
				sysuserMapper.insert(user);

				// 保存用户机构角色关联关系
				List<UserDeptRoleBean> deptRoles = addUserBean.getDeptRoles();
				if (deptRoles != null){
				    deptRoles.get(0).setIsMain("Y");
				}
				else {
	                throw new BizException(ErrorCodeEnum.DEPT_NOT_EXIST);
	            }
				
				Date now = new Date();
				for (UserDeptRoleBean userDeptRoleBean : deptRoles) {
					String[] atr = userDeptRoleBean.getMainRoleId().split(";");
					for (int i = 0; i < atr.length; i++) {
						SysUserDeptRole deptRole = new SysUserDeptRole();
						deptRole.setDeptId(userDeptRoleBean.getMainDeptId());
						deptRole.setRoleId(atr[i]);
						deptRole.setRecUid(ScfUUID.generate());
						deptRole.setUserId(user.getUserId());
						
						SysUserDeptRoleExample SysuserDeptRoleExample = new SysUserDeptRoleExample();
						com.ut.scf.pojo.auto.SysUserDeptRoleExample.Criteria criteriaRoleId = SysuserDeptRoleExample.createCriteria();
						criteriaRoleId.andRoleIdEqualTo(atr[i]);
						criteriaRoleId.andUserIdEqualTo(addUserBean.getUserId());
						long hasRoleId = sysUserDeptRoleMapper.countByExample(SysuserDeptRoleExample);
						
						if (hasRoleId == 1){
							throw new BizException(ErrorCodeEnum.ROLE_NAME_EXIST);
						}
						else if (hasRoleId == 0 && userDeptRoleBean.getIsMain() != null  && i == 0){
							deptRole.setIsMain(userDeptRoleBean.getIsMain());
						}
						else{
							deptRole.setIsMain("N");
						}
						deptRole.setCreateTime(now);
						sysUserDeptRoleMapper.insert(deptRole);
					}
				}

			} else {
				throw new BizException(ErrorCodeEnum.USER_PHONE_EXIST);
			}
		} else {
			throw new BizException(ErrorCodeEnum.USER_NAME_EXIST);
		}

		return userId;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public int resetPwd(UserModPwdReqBean usrModPwdBean) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("userId", usrModPwdBean.getUserId());
		return userDao.resetPwd(paramMap);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public int updatePwd(UserModPwdReqBean usrModPwdBean) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("newPassword", usrModPwdBean.getNewPassword());
		paramMap.put("oldPassword", usrModPwdBean.getOldPassword());
		paramMap.put("userId", usrModPwdBean.getUserId());
		return userDao.updatePwd(paramMap);
	}

	/**
	 * 修改user
	 * 
	 * @param userUpdataBean
	 */

	@Transactional(propagation = Propagation.REQUIRED)
	public String updateUser(UserUpdateReqBean userUpdataBean) {
		String username = userUpdataBean.getUsername();
		String mobilephone = userUpdataBean.getMobilephone();
		SysUserExample sysUserExample = new SysUserExample();
		Criteria criteria = sysUserExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andStatusEqualTo((short) 1);
		int hasUser = 0;
		int hasmobilephone = 0;
		if (username != null) {
			hasUser = sysuserMapper.countByExample(sysUserExample);
		}
		
		SysUserExample sysmobilephoneExample = new SysUserExample();
		Criteria criteriaPhone = sysmobilephoneExample.createCriteria();
		criteriaPhone.andMobilephoneEqualTo(mobilephone);
		criteriaPhone.andStatusEqualTo((short) 1);
		
		if (mobilephone != null) {
			hasmobilephone = sysuserMapper.countByExample(sysmobilephoneExample);
		}
		
		SysUser sysUser = userDao.selectUserById(userUpdataBean.getUserId());
		
		if (hasUser > 0 && !username.equals(sysUser.getUsername())) {
			throw new BizException(ErrorCodeEnum.USER_NAME_EXIST);
		} else {
			if (hasmobilephone > 0 && !mobilephone.equals(sysUser.getMobilephone())) {
				throw new BizException(ErrorCodeEnum.USER_PHONE_EXIST);
			} else {
				SysUser user = new SysUser();
				String cpId = userUpdataBean.getCorpId();
				int idx = cpId.lastIndexOf(";");
				cpId = cpId.substring(idx + 1, cpId.length());
				user.setUserId(userUpdataBean.getUserId());
				user.setUsername(userUpdataBean.getUsername());
				user.setRealname(userUpdataBean.getRealname());
				//user.setDeptId(userUpdataBean.getDeptId());
				user.setEmail(userUpdataBean.getEmail());
				user.setFixedPhone(userUpdataBean.getFixedPhone());
				user.setCorpId(cpId);
				user.setNote(userUpdataBean.getNote());
				user.setMobilephone(userUpdataBean.getMobilephone());
				user.setPhotoUrl(userUpdataBean.getPhotoUrl());
				user.setStatus((short) 1);
				sysuserMapper.updateByPrimaryKeySelective(user);

				// 先删除此用户全部的用户机构角色关联关系，然后再保存
				sysUserDeptRoleMapper.deleteById(userUpdataBean.getUserId());

				List<UserDeptRoleBean> deptRoles = userUpdataBean.getDeptRoles();
				if (deptRoles != null){
                    deptRoles.get(0).setIsMain("Y");
                }
                else {
                    throw new BizException(ErrorCodeEnum.DEPT_NOT_EXIST);
                }
				
				Date now = new Date();
				for (UserDeptRoleBean userDeptRoleBean : deptRoles) {
					String[] atr = userDeptRoleBean.getMainRoleId().split(";");
					for (int i = 0; i < atr.length; i++) {
						SysUserDeptRole deptRole = new SysUserDeptRole();
						deptRole.setDeptId(userDeptRoleBean.getMainDeptId());
						deptRole.setRoleId(atr[i]);
						deptRole.setRecUid(ScfUUID.generate());
						deptRole.setUserId(userUpdataBean.getUserId());
						
						SysUserDeptRoleExample SysuserDeptRoleExample = new SysUserDeptRoleExample();
						com.ut.scf.pojo.auto.SysUserDeptRoleExample.Criteria criteriaRoleId = SysuserDeptRoleExample.createCriteria();
						criteriaRoleId.andRoleIdEqualTo(atr[i]);
						criteriaRoleId.andUserIdEqualTo(userUpdataBean.getUserId());
						long hasRoleId = sysUserDeptRoleMapper.countByExample(SysuserDeptRoleExample);
						
						if (hasRoleId == 1){
							throw new BizException(ErrorCodeEnum.ROLE_NAME_EXIST);
						}
						else if (hasRoleId == 0 && userDeptRoleBean.getIsMain() != null  && i == 0){
							deptRole.setIsMain(userDeptRoleBean.getIsMain());
						}
						else{
							deptRole.setIsMain("N");
						}
						deptRole.setCreateTime(now);
						sysUserDeptRoleMapper.insert(deptRole);
					}
				}
			}
		}
		return userUpdataBean.getUserId();
	}

	/**
	 * 条件查询 分页获取user
	 * 
	 * @param paramMap
	 * @param page
	 */

	@Transactional(readOnly = true)
	public BaseRespBean userList(UserSearchPageReqBean reqBean) {
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);

		// 是否分页，0：否，1：是
		if (reqBean.getIsPage() == 1) {
			PageListRespBean pageListBean = new PageListRespBean();
			PageInfoBean page = reqBean.getPage();
			
			if (reqBean.getRoleType() == 1){
				List<Map<String, Object>> resultList = userDao.userList(paramMap, page);
				pageListBean.putDataList(resultList, page);
			}
			else{
				List<Map<String, Object>> resultList = userDao.userList1(paramMap, page);
				pageListBean.putDataList(resultList, page);
			}
			return pageListBean;
		} else {
			DataListRespBean listBean = new DataListRespBean();
			if (reqBean.getRoleType() != 1){
				List<Map<String, Object>> resultList = userDao.userList1(paramMap);
				listBean.putDataList(resultList);
			}
			else{
				List<Map<String, Object>> resultList = userDao.userList(paramMap);
				listBean.putDataList(resultList);
			}
			return listBean;
		}
	}

	@Transactional(readOnly = true)
	public BaseRespBean userLogin(Map<String, Object> paramMap) {
		Map<String, Object> resultMap = userDao.userLogin(paramMap);
		BaseRespBean respBean = new BaseRespBean();

		// 根据用户名密码没有查询到用户
		if (resultMap == null) {
			respBean.setResult(ErrorCodeEnum.LOGIN_USERNAME_PASSWORD_ERROR);
			return respBean;
		}

		UserLoginRespBean loginBean = new UserLoginRespBean();
		BeanUtil.mapToBean(resultMap, loginBean);

		// 查询用户的机构角色关系表，查询用户的主部门角色信息
		IUserDeptRoleStrategyService userDeptRoleStrategyService = IUserDeptRoleStrategyServiceFactory.getBy();
		CorpDept mainDept = userDeptRoleStrategyService.getMainDeptBy(loginBean.getUserId());
		SysRole mainRole = userDeptRoleStrategyService.getMainRoleBy(loginBean.getUserId());
		loginBean.setDeptId(mainDept.getDeptId());
		loginBean.setDeptName(mainDept.getDeptName());
		loginBean.setRoleId(mainRole.getRoleId());
		loginBean.setRoleName(mainRole.getRoleName());
		loginBean.setRoleType(mainRole.getRoleType());

		// 根据角色Id，查询菜单列表
		List<Map<String, Object>> list = menuDao.menuListByRoleId(loginBean.getRoleId());
		loginBean.setMenuList(ScfBizUtil.menuListToTree(list));

		respBean.setResultData(loginBean);
		return respBean;
	}

	@Transactional(readOnly = true)
	public BaseRespBean userPhoneLogin(String phone) {
		Map<String, Object> resultMap = userDao.userPhoneLogin(phone);
		BaseRespBean respBean = new BaseRespBean();

		// 根据用户名密码没有查询到用户
		if (resultMap == null) {
			respBean.setResult(ErrorCodeEnum.LOGIN_USERNAME_PASSWORD_ERROR);
			return respBean;
		}

		UserLoginRespBean loginBean = new UserLoginRespBean();
		BeanUtil.mapToBean(resultMap, loginBean);

		// 查询用户的机构角色关系表，查询用户的主部门角色信息
		IUserDeptRoleStrategyService userDeptRoleStrategyService = IUserDeptRoleStrategyServiceFactory.getBy();
		CorpDept mainDept = userDeptRoleStrategyService.getMainDeptBy(loginBean.getUserId());
		SysRole mainRole = userDeptRoleStrategyService.getMainRoleBy(loginBean.getUserId());
		loginBean.setDeptId(mainDept.getDeptId());
		loginBean.setRoleId(mainRole.getRoleId());
		loginBean.setRoleName(mainRole.getRoleName());
		loginBean.setRoleType(mainRole.getRoleType());

		// 根据角色Id，查询菜单列表
		List<Map<String, Object>> list = menuDao.menuListByRoleId(loginBean.getRoleId());
		loginBean.setMenuList(ScfBizUtil.menuListToTree(list));

		respBean.setResultData(loginBean);
		return respBean;
	}

}
