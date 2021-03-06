package com.ut.scf.web.controller.sys;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.dict.ScfBizConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.dao.sys.IDeptDao;
import com.ut.scf.dao.sys.IRoleDao;
import com.ut.scf.reqbean.sys.DictListReqBean;
import com.ut.scf.reqbean.sys.RoleListReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.service.sys.DictMapService;
import com.ut.scf.service.sys.RoleService;
import com.ut.scf.sys.util.ScfCacheDictUtil;
import com.ut.scf.web.controller.BaseJsonController;

/**
 * 数据字典相关的控制类
 * 
 * @author zhangyx
 */
@Controller
@RequestMapping("/dict")
public class SysDictController extends BaseJsonController {

	@Resource
	private DictMapService dictService;

	@Resource
	private IRoleDao roleDao;
	
	@Resource
	private IDeptDao deptDao;
	
	/**
	 * 查询缓存字典列表
	 * 
	 * @return 字典列表
	 * @throws IOException
	 */
	@RequestMapping(value = "listAll")
	public @ResponseBody BaseRespBean dictAllList() throws IOException {
		log.debug("[listAll] start .. ");
		BaseRespBean respBean = new BaseRespBean();
		Map<String, Object> map = ScfCacheDictUtil.getDictMapList();
		
		/**
		 * begin
		 */
		//加载角色信息到数据字典
		RoleListReqBean roleBean = new RoleListReqBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(roleBean);
		paramMap.put("roleType",ScfBizConsts.ROLE_TYPE_PLAT);
		List<Map<String, Object>> list = roleDao.selectRoleList2(paramMap);
		Map<String, Object> roleMap = new HashMap<String, Object>();
		short status = 1;
		roleMap.put("status", status);
		roleMap.put("typeId", "ROLE_NAME");
		
		for (int i = 0; i < list.size(); i++) {
			Map map1 = (Map)list.get(i);
			roleMap.put("key", (String)map1.get("roleId"));
			roleMap.put("value", (String)map1.get("roleName"));
			map.putAll(roleMap);
		}
		
		//加载部门信息到数据字典
		Map<String, Object> paramMap1 = new HashMap<String, Object>();
		List<Map<String, Object>> list1 = deptDao.getDeptPageList(paramMap1);
		Map<String, Object> deptMap = new HashMap<String, Object>();
		deptMap.put("status", status);
		deptMap.put("typeId", "DEPT_NAME");
		
		for (int i = 0; i < list1.size(); i++) {
			Map map2= (Map)list1.get(i);
			deptMap.put("key", (String)map2.get("DEPTID"));
			deptMap.put("value", (String)map2.get("DEPTNAME"));
			map.putAll(deptMap);
		}
		/**
		 * end
		 */
		respBean.setResultData(map);
		log.debug("[listAll] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 查询数据库字典列表
	 * 
	 * @param reqBean
	 * @param bindingResult
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "list")
	public @ResponseBody BaseRespBean dictList(@Valid @RequestBody DictListReqBean reqBean) throws IOException {
		log.debug("[list] start .. params=" + reqBean);
		PageListRespBean respBean = new PageListRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		if (reqBean.getIsPage() == 1) {
			PageInfoBean page = reqBean.getPage();
			List<Map<String, Object>> dataList = dictService.getDictMapList(paramMap, page);
			respBean.putDataList(dataList, page);
		} else {
			List<Map<String, Object>> dataList = dictService.getDictMapList(paramMap);
			respBean.setResultData(dataList);
		}
		log.debug("[list] end .. return=" + respBean);
		return respBean;
	}
}
