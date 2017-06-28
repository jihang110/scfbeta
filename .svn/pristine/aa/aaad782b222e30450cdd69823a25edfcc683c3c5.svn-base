package com.ut.scf.web.controller.sys;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.sys.CorpAddReqBean;
import com.ut.scf.reqbean.sys.CorpDeleteReqBean;
import com.ut.scf.reqbean.sys.CorpListReqBean;
import com.ut.scf.reqbean.sys.CorpUpdateReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.respbean.sys.CorpAddRespBean;
import com.ut.scf.service.sys.CorpService;
import com.ut.scf.web.controller.BaseJsonController;

/**
 * 企业操作相关的控制类
 * 
 * @author zyx
 */
@Controller
@RequestMapping("/corp")
public class CorpController extends BaseJsonController {

	@Resource
	private CorpService corpService;

	/**
	 * 新增企业信息
	 * 
	 * @param httpSession
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/add")
	public @ResponseBody BaseRespBean corpAdd(HttpSession httpSession, @Valid @RequestBody CorpAddReqBean reqBean) throws IOException {
		log.debug("[add] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();
		// 获取用户信息
		String corpIdSession = (String) httpSession.getAttribute(ScfConsts.SESSION_CORP_ID);
		log.debug("corpIdSession: {}", corpIdSession);
		String userIdSession = (String) httpSession.getAttribute(ScfConsts.SESSION_USER_ID);
		log.debug("userIdSession: {}", userIdSession);
		String roleIdSession = (String) httpSession.getAttribute(ScfConsts.SESSION_ROLE_ID);
		log.debug("roleIdSession: {}", roleIdSession);
		int roleTypeSession = (int) httpSession.getAttribute(ScfConsts.SESSION_ROLE_TYPE);
		log.debug("roleTypeSession: {}", roleTypeSession);

		CorpAddRespBean respCorpBean = corpService.addCorpInfo(reqBean);
		respBean.putData("corpId", respCorpBean.getCorpId());
		log.debug("[add] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 删除企业信息
	 * 
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/delete")
	public @ResponseBody BaseRespBean corpDelete(@Valid @RequestBody CorpDeleteReqBean reqBean) throws IOException {
		log.debug("[delete] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();
		respBean = this.corpService.deleteCorp(reqBean);
		log.debug("[delete] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 修改企业
	 * 
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/mod")
	public @ResponseBody BaseRespBean corpUpdate(@Valid @RequestBody CorpUpdateReqBean reqBean) throws IOException {
		log.debug("[mod] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();

		CorpAddRespBean updateBean = this.corpService.updateCorp(reqBean);
		respBean.putData("corpId", updateBean.getCorpId());
		log.debug("[mod] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 查询企业列表
	 * 
	 * @param httpSession
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/list")
	public @ResponseBody BaseRespBean list(HttpSession httpSession, @Valid @RequestBody CorpListReqBean reqBean) throws IOException {
		log.debug("[list] start .. params=" + reqBean);
		PageListRespBean respBean = new PageListRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		if (reqBean.getIsPage() == 1) {
			PageInfoBean page = reqBean.getPage();
			List<Map<String, Object>> dataList = corpService.corpList(paramMap, page);
			respBean.putDataList(dataList, page);
		} else {
			List<Map<String, Object>> dataList = corpService.corpList(paramMap);
			respBean.setResultData(dataList);
		}
		log.debug("[list] end .. return=" + respBean);
		return respBean;
	}

}
