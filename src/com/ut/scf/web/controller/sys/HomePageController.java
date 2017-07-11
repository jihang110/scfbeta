package com.ut.scf.web.controller.sys;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import javax.validation.Valid;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.pojo.auto.CorpDept;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.sys.CorpDeptRespBean;
import com.ut.scf.service.bpm.BpmCommonService;
import com.ut.scf.service.sys.IUserDeptRoleStrategyService;
import com.ut.scf.service.sys.IUserDeptRoleStrategyServiceFactory;
import com.ut.scf.service.sys.SysConfigService;
import com.ut.scf.web.controller.BaseJsonController;

/**
 * 首页接口
 * 
 * @author shenying
 *
 */
@Controller
@RequestMapping("/main")
public class HomePageController extends BaseJsonController {

	@Autowired
	private SysConfigService sysConfigService;

	@Autowired
	private BpmCommonService bpmCommonService;

	/**
	 * 首页抬头用户信息
	 * 
	 * @return
	 */
	@RequestMapping("/info")
	@ResponseBody
	public BaseRespBean getMainInfo() {
		BaseRespBean resp = new BaseRespBean();

		// 基本信息
		Map<String, String> user = Maps.newHashMap();
		user.put("userId", (String) getSessionAttribute(ScfConsts.SESSION_USER_ID));
		user.put("name", (String) getSessionAttribute(ScfConsts.SESSION_USERNAME));
		user.put("role", (String) getSessionAttribute(ScfConsts.SESSION_ROLE_NAME));
		user.put("roleId", (String) getSessionAttribute(ScfConsts.SESSION_ROLE_ID));
		user.put("dept", (String) getSessionAttribute(ScfConsts.SESSION_DEPT_NAME));
		user.put("deptID", (String) getSessionAttribute(ScfConsts.SESSION_DEPT_ID));
		resp.putData("user", user);

		// 所属部门列表
		IUserDeptRoleStrategyService userDeptRoleStrategyService = IUserDeptRoleStrategyServiceFactory.getBy();
		List<CorpDept> deptList = userDeptRoleStrategyService
				.getDeptListBy((String) getSessionAttribute(ScfConsts.SESSION_USER_ID));
		String mainDeptId = (String) getSessionAttribute(ScfConsts.SESSION_DEPT_ID);
		List<CorpDeptRespBean> list = Lists.newArrayList();
		for (CorpDept corpDept : deptList) {
			CorpDeptRespBean bean = new CorpDeptRespBean();
			DozerMapper.copy(corpDept, bean);
			bean.setIsMain(bean.getDeptId().equals(mainDeptId) ? "Y" : "N");
			list.add(bean);
		}
		resp.putData("deptList", list);

		Random r = new Random(System.currentTimeMillis());
		String d = DateFormatUtils.format(new Date(), "yyyy年M月d日 HH:mm:ss EE", Locale.CHINESE);
		int bound = 100;

		Map<String, String> login = Maps.newHashMap();
		login.put("lastTimeTxt", d);
		login.put("curTimeTxt", d);
		login.put("pswdExpireDays", Integer.toString(r.nextInt(bound)));
		resp.putData("login", login);

		resp.putData("noticeNum", r.nextInt(bound));
		resp.putData("announcementNum", r.nextInt(bound));
		resp.putData("warningNum", r.nextInt(bound));
		resp.putData("archiveNum", r.nextInt(bound));

		String userId = (String) getSessionAttribute(ScfConsts.SESSION_USER_ID);
		resp.putData("todoNum", bpmCommonService.countTodoTask(userId));
		resp.putData("doneNum", bpmCommonService.countDoneTask(userId));
		return resp;
	}

	/**
	 * 保存用户偏好设置
	 * 
	 * @param cfg
	 * @return
	 */
	@RequestMapping("/savePrefer")
	@ResponseBody
	public BaseRespBean saveUserPreference(@RequestBody @Valid Map<String, String> cfg) {
		String userId = (String) getSessionAttribute(ScfConsts.SESSION_USER_ID);
		BaseRespBean resp = new BaseRespBean();
		sysConfigService.saveUserPreference(cfg, userId);
		return resp;
	}

	/**
	 * 取用户偏好设置
	 * 
	 * @param key
	 * @return
	 */
	@RequestMapping("/getPrefer")
	@ResponseBody
	public BaseRespBean getUserPreference(@RequestParam String key) {
		String userId = (String) getSessionAttribute(ScfConsts.SESSION_USER_ID);
		BaseRespBean resp = new BaseRespBean();
		String prefer = sysConfigService.getUserPreference(key, userId);
		resp.setResultData(prefer);
		return resp;
	}

}
