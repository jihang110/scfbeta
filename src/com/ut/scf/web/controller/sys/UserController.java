package com.ut.scf.web.controller.sys;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.BaseReqBean;
import com.ut.scf.reqbean.sys.BizLogListReqBean;
import com.ut.scf.reqbean.sys.SysConfigByKeyReqBean;
import com.ut.scf.reqbean.sys.UserAddReqBean;
import com.ut.scf.reqbean.sys.UserDeleteReqBean;
import com.ut.scf.reqbean.sys.UserInfoReqBean;
import com.ut.scf.reqbean.sys.UserModPwdReqBean;
import com.ut.scf.reqbean.sys.UserSearchPageReqBean;
import com.ut.scf.reqbean.sys.UserUpdateReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.sys.UserInfoRespBean;
import com.ut.scf.respbean.sys.UserLoginRespBean;
import com.ut.scf.respbean.sys.inner.Menu;
import com.ut.scf.service.sys.UserOperService;
import com.ut.scf.web.controller.BaseJsonController;

@Controller
@RequestMapping("/user")
public class UserController extends BaseJsonController {

	@Resource
	private UserOperService userOperService;

	@RequestMapping(value = "/add")
	public @ResponseBody BaseRespBean addUser(@Valid @RequestBody UserAddReqBean addUserBean) {
		BaseRespBean respBean = new BaseRespBean();
		try {
			String userId = this.userOperService.insertUser(addUserBean);
			respBean.putData("userId", userId);
		}
		catch (Exception e) {
			if (e instanceof org.springframework.dao.DuplicateKeyException) {
				log.error("insert SYS_USER_DEPT_ROLE error", e);
				respBean.setResult(ErrorCodeEnum.USER_DEPT_ROLE_EXIST);
			} else {
				throw e;
			}
		}
		return respBean;
	}

	@RequestMapping(value = "/bizLogList")
	public @ResponseBody BaseRespBean bizLogList(@Valid @RequestBody BizLogListReqBean reqBean ) {
		return this.userOperService.getBizLogList(reqBean);
	}

	@RequestMapping(value = "/checkSession", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	public @ResponseBody BaseRespBean checkSession(HttpSession httpSession) {
		BaseRespBean respBean = new BaseRespBean();
		return respBean;
	}

	@RequestMapping(value = "/delete")
	public @ResponseBody BaseRespBean delUser(@Valid @RequestBody UserDeleteReqBean delUserBean) {
		BaseRespBean respBean = new BaseRespBean();
		int result = this.userOperService.deleteUser(delUserBean.getUserId());
		respBean.putData("userId", delUserBean.getUserId());
		if (result < 1) {
			respBean.setResult(ErrorCodeEnum.UPDATE_FAILED);
		}
		return respBean;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getSession", method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json;charset=UTF-8" })
	public @ResponseBody BaseRespBean getSession(HttpSession httpSession, @RequestBody BaseReqBean reqBean) {
		BaseRespBean respBean = new BaseRespBean();
		UserLoginRespBean loginBean = new UserLoginRespBean();
		loginBean.setUserId((String) httpSession.getAttribute(ScfConsts.SESSION_USER_ID));
		loginBean.setUsername((String) httpSession.getAttribute(ScfConsts.SESSION_USERNAME));
		loginBean.setRoleId((String) httpSession.getAttribute(ScfConsts.SESSION_ROLE_ID));
		loginBean.setRoleName((String) httpSession.getAttribute(ScfConsts.SESSION_ROLE_NAME));
		loginBean.setRoleType((int) httpSession.getAttribute(ScfConsts.SESSION_ROLE_TYPE));
		loginBean.setCorpId((String) httpSession.getAttribute(ScfConsts.SESSION_CORP_ID));
		loginBean.setDeptId((String) httpSession.getAttribute(ScfConsts.SESSION_DEPT_ID));
		loginBean.setMenuList((List<Menu>) httpSession.getAttribute(ScfConsts.SESSION_MENU_LIST));
		respBean.setResultData(loginBean);
		return respBean;
	}

	@RequestMapping(value = "/get")
	@ResponseBody
	public BaseRespBean getUser(@RequestBody @Valid UserInfoReqBean user) {
		BaseRespBean respBean = new BaseRespBean();
		UserInfoRespBean userBean = userOperService.getBy(user.getUserId());
		respBean.setResultData(userBean);
		return respBean;
	}

	@RequestMapping(value = "/hasMenuList")
	public @ResponseBody BaseRespBean hasMenuList(HttpSession httpSession, @Valid @RequestBody UserSearchPageReqBean searchPage) {
		// 获取系统类型
		int roleTypeSession = (int) httpSession.getAttribute("roleType");
		log.debug("roleTypeSession: {}", roleTypeSession);
		searchPage.setRoleType(roleTypeSession);
		BaseRespBean respBean = this.userOperService.hasMenuUserList(searchPage);
		return respBean;
	}

	@RequestMapping(value = "/list")
	public @ResponseBody BaseRespBean list(HttpSession httpSession, @Valid @RequestBody UserSearchPageReqBean searchPage) {
		// 获取系统类型
		int roleTypeSession = (int) httpSession.getAttribute("roleType");
		log.debug("roleTypeSession: {}", roleTypeSession);
		if (searchPage.getRoleType() <= 0) {
			log.debug("roleTypeSession: {}", roleTypeSession);
			searchPage.setRoleType(roleTypeSession);
		}
		// 获取系统类型
		/*
		 * if(roleTypeSession == 2) {
		 * if(searchPage.getRoleType()==5||searchPage.getRoleType()==4){ } }
		 */

		BaseRespBean respBean = this.userOperService.userList(searchPage);
		return respBean;
	}

	@RequestMapping(value = "/mod")
	public @ResponseBody BaseRespBean modUser(@Valid @RequestBody UserUpdateReqBean userUpdataBean) {
		BaseRespBean respBean = new BaseRespBean();
		try {
			String userId = this.userOperService.updateUser(userUpdataBean);
			respBean.putData("userId", userId);
		}
		catch (Exception e) {
			if (e instanceof org.springframework.dao.DuplicateKeyException) {
				log.error("update SYS_USER_DEPT_ROLE error", e);
				respBean.setResult(ErrorCodeEnum.USER_DEPT_ROLE_EXIST);
			} else {
				throw e;
			}
		}
		return respBean;
	}

	@RequestMapping(value = "/resetPassword")
	public @ResponseBody BaseRespBean resetPassword(@Valid @RequestBody UserModPwdReqBean usrModPwdBean, HttpSession httpSession) {
		BaseRespBean respBean = new BaseRespBean();
		String userId = httpSession.getAttribute(ScfConsts.SESSION_USER_ID).toString();
		usrModPwdBean.setUserId(userId);
		int result = this.userOperService.resetPwd(usrModPwdBean);
		if (result < 1) {
			respBean.setResult(ErrorCodeEnum.UPDATE_FAILED);
		}
		respBean.putData("userId", usrModPwdBean.getUserId());
		return respBean;
	}

	@RequestMapping(value = "/configKey", method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json;charset=UTF-8" })
	public @ResponseBody BaseRespBean selectconfigByKey(HttpSession httpSession, @Valid @RequestBody SysConfigByKeyReqBean reqBean,
	        BindingResult bindingResult) throws IOException {
		BaseRespBean respBean = new BaseRespBean();
		if (bindingResult.hasErrors()) {
			log.warn("bindingResult has error");
			respBean.setResult(ErrorCodeEnum.PARAM_VALID_ERROR);
			respBean.setResultErrorMap(bindingResult);
			return respBean;
		}
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		respBean = this.userOperService.getSysConfigByKey(paramMap);

		return respBean;
	}

	@RequestMapping(value = "/updatePassword")
	public @ResponseBody BaseRespBean updatePassword(@Valid @RequestBody UserModPwdReqBean usrModPwdBean, HttpSession httpSession) {
		BaseRespBean respBean = new BaseRespBean();
		String userId = httpSession.getAttribute(ScfConsts.SESSION_USER_ID).toString();
		usrModPwdBean.setUserId(userId);
		int result = this.userOperService.updatePwd(usrModPwdBean);
		if (result < 1) {
			respBean.setResult(ErrorCodeEnum.UPDATE_FAILED);
		}
		respBean.putData("userId", usrModPwdBean.getUserId());
		return respBean;
	}

}
