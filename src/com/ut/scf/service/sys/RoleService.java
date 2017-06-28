package com.ut.scf.service.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.ut.scf.dao.auto.SysRoleInterfaceMapper;
import com.ut.scf.dao.auto.SysRoleMapper;
import com.ut.scf.dao.auto.SysRoleMenuMapper;
import com.ut.scf.dao.auto.SysTypeMapper;
import com.ut.scf.dao.sys.IRoleDao;
import com.ut.scf.pojo.auto.SysRole;
// import com.ut.scf.pojo.SysRole;
import com.ut.scf.pojo.auto.SysRoleExample;
import com.ut.scf.pojo.auto.SysRoleInterface;
import com.ut.scf.pojo.auto.SysRoleInterfaceExample;
import com.ut.scf.pojo.auto.SysRoleMenu;
import com.ut.scf.pojo.auto.SysRoleMenuExample;
import com.ut.scf.reqbean.sys.RoleAddReqBean;
import com.ut.scf.reqbean.sys.RoleUpdateReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.sys.RoleInfoRespBean;

@Service
public class RoleService {

	private static final Logger log = LoggerFactory.getLogger(RoleService.class);

	@Resource
	private IRoleDao roleDao;

	@Resource
	private SysRoleInterfaceMapper sysRoleInterfaceMapper;

	@Resource
	private SysRoleMapper sysRoleMapper;

	@Resource
	private SysRoleMenuMapper sysRoleMenuMapper;

	@Resource
	private SysTypeMapper sysTypeMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean addRole(RoleAddReqBean reqBean) {
		BaseRespBean respBean = new BaseRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		// 查询角色名是否重复
		// 修改为自动生产的sql
		SysRoleExample sysRoleExample = new SysRoleExample();
		com.ut.scf.pojo.auto.SysRoleExample.Criteria criteria = sysRoleExample.createCriteria();
		criteria.andRoleNameEqualTo(paramMap.get("roleName") + "");
		if (paramMap.get("corpId") != null) {
			criteria.andCorpIdEqualTo(paramMap.get("corpId") + "");
		}
		if (sysRoleMapper.countByExample(sysRoleExample) > 0) {
			respBean.setResult(ErrorCodeEnum.ROLE_NAME_EXIST);
			return respBean;
		}

		// 插入角色信息
		String roleId = ScfUUID.generate();
		paramMap.put("roleId", roleId);
		// 转换为自动生成的sql
		com.ut.scf.pojo.auto.SysRole sysRole = new com.ut.scf.pojo.auto.SysRole();
		BeanUtil.mapToBean(paramMap, sysRole);
		sysRole.setCreateTime(new Date());
		sysRole.setStatus(1);
		int insertRoleNum = sysRoleMapper.insert(sysRole);
		log.debug("insertRoleNum : {}", insertRoleNum);
		if (insertRoleNum <= 0) {
			throw new BizException(ErrorCodeEnum.ADD_FAILED);
		}

		// 添加角色菜单关系

		if (reqBean.getMenuIdList() != null || !reqBean.getMenuIdList().isEmpty()) {
			List<SysRoleMenu> roleMenuList = new ArrayList<SysRoleMenu>();			
			String [] menuIdArr= reqBean.getMenuIdList().split(";");
			List<String> menuIdList = java.util.Arrays.asList(menuIdArr);
			
			for (String menuId : menuIdList) {
				if (StringUtils.isNotBlank(menuId)) {
					SysRoleMenu sysRoleMenu = new SysRoleMenu();
					sysRoleMenu.setMenuId(menuId);
					sysRoleMenu.setRecUid(ScfUUID.generate());
					sysRoleMenu.setRoleId(roleId);
					sysRoleMenu.setCreateTime(new Date());

					roleMenuList.add(sysRoleMenu);

				}
			}

			if (!roleMenuList.isEmpty()) {
				// 修改为自动生产的Dao
				int insertRoleMenuNum = 0;
				for (int i = 0; i < roleMenuList.size(); i++) {

					insertRoleMenuNum = sysRoleMenuMapper.insert(roleMenuList.get(i));
				}
				log.debug("insertRoleMenuNum : {}", insertRoleMenuNum);
				if (insertRoleMenuNum <= 0) {
					throw new BizException(ErrorCodeEnum.ADD_FAILED);
				}
			}
		}

		// 角色与接口的关系
		if (CollectionUtils.isNotEmpty(reqBean.getInterfaceIdList())) {
			Date now = new Date();
			for (String infId : reqBean.getInterfaceIdList()) {
				SysRoleInterface sri = new SysRoleInterface();
				sri.setRecUid(ScfUUID.generate());
				sri.setRoleId(roleId);
				sri.setInterfaceId(infId);
				sri.setCreateTime(now);
				sysRoleInterfaceMapper.insert(sri);
			}
		}
		respBean.putData("roleId", roleId);
		return respBean;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean deleteRole(String roleId, int roleTypeSession) {
		BaseRespBean respBean = new BaseRespBean();

		// 不能删除系统管理员
		if (ScfBizConsts.ROLE_ID_ROOT.equals(roleId)) {
			respBean.setResult(ErrorCodeEnum.SYS_ROLE_NO_PERMISSION);
			return respBean;
		}
		// sql 自动生产修改
		com.ut.scf.pojo.auto.SysRole sysRole = sysRoleMapper.selectByPrimaryKey(roleId);
		if (sysRole == null) {
			respBean.setResult(ErrorCodeEnum.ROLE_NOT_EXIST);
			return respBean;
		}

		if (roleTypeSession != ScfBizConsts.ROLE_TYPE_PLAT && sysRole.getCorpId() == null) {
			respBean.setResult(ErrorCodeEnum.SYS_ROLE_NO_PERMISSION);
			return respBean;
		}

		// 更新角色status为0
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("roleId", roleId);
		paramMap.put("status", ScfBizConsts.STATUS_DELETE);
		com.ut.scf.pojo.auto.SysRole sysRole2 = new com.ut.scf.pojo.auto.SysRole();
		BeanUtil.mapToBean(paramMap, sysRole2);
		int updateNum = sysRoleMapper.updateByPrimaryKeySelective(sysRole2);
		log.debug("update role count {}", updateNum);
		if (updateNum <= 0) {
			throw new BizException(ErrorCodeEnum.DELETE_FAILED);
		}

		// 删除角色菜单关系
		int deleteRoleMenuNum = sysRoleMapper.deleteByPrimaryKey(roleId);
		log.debug("deleteRoleMenuNum {}", deleteRoleMenuNum);
		if (updateNum < 0) {
			throw new BizException(ErrorCodeEnum.DELETE_FAILED);
		}

		// 删除角色与接口的关系
		SysRoleInterfaceExample sriExam = new SysRoleInterfaceExample();
		sriExam.createCriteria().andRoleIdEqualTo(roleId);
		sysRoleInterfaceMapper.deleteByExample(sriExam);
		respBean.setResultData(roleId);
		return respBean;
	}

	public RoleInfoRespBean getBy(String roleId) {
		RoleInfoRespBean resp = new RoleInfoRespBean();
		SysRole role = sysRoleMapper.selectByPrimaryKey(roleId);
		BeanUtil.BeanToBean(resp, role);

		// 查询角色的菜单
		List<String> menuIdList = Lists.newArrayList();
		SysRoleMenuExample srmExam = new SysRoleMenuExample();
		srmExam.createCriteria().andRoleIdEqualTo(roleId);
		List<SysRoleMenu> menuList = sysRoleMenuMapper.selectByExample(srmExam);
		StringBuffer sb = new StringBuffer();
		for (SysRoleMenu rm : menuList) {
			menuIdList.add(rm.getMenuId());
		}
		for (int i = 0; i < menuIdList.size(); i++) {        
			sb.append(menuIdList.get(i)).append(";");    
		}  
				
		resp.setMenuIdList(sb.toString().substring(0,sb.toString().length()-1));
        
		// 查询角色的接口列表
		List<String> infIdList = Lists.newArrayList();
		SysRoleInterfaceExample sriExam = new SysRoleInterfaceExample();
		sriExam.createCriteria().andRoleIdEqualTo(roleId);
		List<SysRoleInterface> infList = sysRoleInterfaceMapper.selectByExample(sriExam);
		for (SysRoleInterface ri : infList) {
			infIdList.add(ri.getInterfaceId());
		}
		resp.setInterfaceIdList(infIdList);
		return resp;
	}

	@Transactional(readOnly = true)
	public List<Map<String, Object>> getRoleList(Map<String, Object> params) {
		return roleDao.selectRoleList(params);
	}

	@Transactional(readOnly = true)
	public List<Map<String, Object>> getRoleList(Map<String, Object> params, PageInfoBean page) {
		return roleDao.selectRoleList(params, page);
	}

	/**
	 * 根据所属企业类型查询角色
	 */

	@Transactional(readOnly = true)
	public List<Map<String, Object>> getRoleListByCorpId(String corpId) {
		return roleDao.selectRoleListByCorpId(corpId);
	}

	@Transactional(readOnly = true)
	public List<Map<String, Object>> getRoleTypeList(int roleType) {
		return roleDao.selectRoleTypeList(roleType);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean updateRole(RoleUpdateReqBean reqBean, int roleTypeSession) {
		BaseRespBean respBean = new BaseRespBean();
		SysRole sysRole = roleDao.selectRoleById(reqBean.getRoleId());
		if (sysRole == null) {
			respBean.setResult(ErrorCodeEnum.ROLE_NOT_EXIST);
			return respBean;
		}

		if (roleTypeSession != ScfBizConsts.ROLE_TYPE_PLAT && sysRole.getCorpId() == null) {
			respBean.setResult(ErrorCodeEnum.SYS_ROLE_NO_PERMISSION);
			return respBean;
		}

		// 查询角色名是否重复，需要排除自己的角色名
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		if (reqBean.getRoleName() != null && !reqBean.getRoleName().equals(sysRole.getRoleName())) {
			SysRoleExample sysRoleExample = new SysRoleExample();
			com.ut.scf.pojo.auto.SysRoleExample.Criteria criteria = sysRoleExample.createCriteria();
			com.ut.scf.pojo.auto.SysRoleExample.Criteria criteria2 = sysRoleExample.createCriteria();
			criteria.andRoleNameEqualTo(paramMap.get("roleName") + "");
			if (paramMap.get("corpId") != null) {
				criteria.andCorpIdEqualTo(paramMap.get("corpId") + "");
				criteria2.andCorpIdIsNull();
			}
			sysRoleExample.or(criteria2);
			paramMap.put("corpId", sysRole.getCorpId());
			if (sysRoleMapper.countByExample(sysRoleExample) > 0) {
				respBean.setResult(ErrorCodeEnum.ROLE_NAME_EXIST);
				return respBean;
			}
		}

		// 修改角色信息
		if (reqBean.getRoleName() != null || reqBean.getNote() != null) {
			com.ut.scf.pojo.auto.SysRole sysRole2 = new com.ut.scf.pojo.auto.SysRole();

			BeanUtil.mapToBean(paramMap, sysRole2);
			int updateRoleNum = sysRoleMapper.updateByPrimaryKeySelective(sysRole2);
			log.debug("updateRoleNum : {}", updateRoleNum);
			if (updateRoleNum <= 0) {
				throw new BizException(ErrorCodeEnum.UPDATE_FAILED);
			}
		}

		// 修改角色菜单关系
		if (reqBean.getMenuIdList() != null) {
			// 先删除
			SysRoleMenuExample sysRoleMenuExample = new SysRoleMenuExample();
			com.ut.scf.pojo.auto.SysRoleMenuExample.Criteria criteria = sysRoleMenuExample.createCriteria();
			criteria.andRoleIdEqualTo(reqBean.getRoleId());
			int deleteRoleMenuNum = sysRoleMenuMapper.deleteByExample(sysRoleMenuExample);
			log.debug("deleteRoleMenuNum : {}", deleteRoleMenuNum);
			if (deleteRoleMenuNum < 0) {
				throw new BizException(ErrorCodeEnum.UPDATE_FAILED);
			}

			// 后添加
			if (!reqBean.getMenuIdList().isEmpty()) {
				List<SysRoleMenu> roleMenuList = new ArrayList<SysRoleMenu>();
				String [] menuIdArr= reqBean.getMenuIdList().split(";");
				List<String> menuIdList = java.util.Arrays.asList(menuIdArr);
				
				for (String menuId : menuIdList) {
					if (StringUtils.isNotBlank(menuId)) {
						SysRoleMenu sysRoleMenu = new SysRoleMenu();
						sysRoleMenu.setMenuId(menuId);
						sysRoleMenu.setRecUid(ScfUUID.generate());
						sysRoleMenu.setRoleId(reqBean.getRoleId());
						sysRoleMenu.setCreateTime(new Date());
						roleMenuList.add(sysRoleMenu);
					}
				}

				if (!roleMenuList.isEmpty()) {
					int insertRoleMenuNum = 0;
					for (int i = 0; i < roleMenuList.size(); i++) {

						insertRoleMenuNum = sysRoleMenuMapper.insert(roleMenuList.get(i));
					}
					log.debug("insertRoleMenuNum : {}", insertRoleMenuNum);
					if (insertRoleMenuNum <= 0) {
						throw new BizException(ErrorCodeEnum.ADD_FAILED);
					}
				}
			}
		}

		// 角色与接口的关系
		if (CollectionUtils.isNotEmpty(reqBean.getInterfaceIdList())) {
			SysRoleInterfaceExample sriExam = new SysRoleInterfaceExample();
			sriExam.createCriteria().andRoleIdEqualTo(reqBean.getRoleId());
			sysRoleInterfaceMapper.deleteByExample(sriExam);

			Date now = new Date();
			for (String infId : reqBean.getInterfaceIdList()) {
				SysRoleInterface sri = new SysRoleInterface();
				sri.setRecUid(ScfUUID.generate());
				sri.setRoleId(reqBean.getRoleId());
				sri.setInterfaceId(infId);
				sri.setCreateTime(now);
				sysRoleInterfaceMapper.insert(sri);
			}
		}
		respBean.setResultData(reqBean.getRoleId());
		return respBean;
	}

}
