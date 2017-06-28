package com.ut.scf.web.controller.pubmanage;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.pojo.auto.CustRela;
import com.ut.scf.reqbean.pubmanage.CorpToCust;
import com.ut.scf.reqbean.pubmanage.CustRelaReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.pubmanage.CustRelaBpmProcessService;
import com.ut.scf.service.pubmanage.CustRelaService;
import com.ut.scf.web.controller.bpm.BaseBpmController;

/**
 * 公共管理-关联买卖方
 * 
 * @author zhangyx
 */
@Controller
@RequestMapping("/pub/custRela")
public class CustRelaBpmController extends BaseBpmController<CustRelaReqBean> {

	@Resource(name = "custRelaBpmService")
	private BpmProcessService<CustRelaReqBean> custRelaBpmService;

	@Autowired
	private CustRelaService custRelaService;

	@RequestMapping(value = "/add")
	@ResponseBody
	public BaseRespBean add(HttpSession httpSession, @RequestBody @Valid CustRelaReqBean reqBean) {
		log.debug("[add] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();

		// 获取用户信息
		String userIdSession = (String) httpSession.getAttribute(ScfConsts.SESSION_USER_ID);
		log.debug("userIdSession: {}", userIdSession);

		reqBean.setCreateUser(userIdSession);
		reqBean.setCreateTime(new Date());
		reqBean.setStatus((short) 1);
		String recUid = custRelaService.update(reqBean);
		respBean.putData("recUid", recUid);
		log.debug("[add] end .. return=" + respBean);
		return respBean;
	}

	@RequestMapping(value = "/delete")
	@ResponseBody
	public BaseRespBean delete(@RequestBody @Valid CustRelaReqBean reqBean) {
		log.debug("[delete] start .. params=" + reqBean);
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		BaseRespBean respBean = new BaseRespBean();
		log.debug("[delete] end .. return=" + respBean);
		return respBean;
	}

	@Override
	protected BpmProcessService<CustRelaReqBean> getBpmProcessService() {
		return custRelaBpmService;
	}

	protected CustRelaBpmProcessService getCrudService() {
		return (CustRelaBpmProcessService) custRelaBpmService;
	}

	@RequestMapping(value = "/mod")
	@ResponseBody
	public BaseRespBean modify(@RequestBody @Valid CustRelaReqBean reqBean) {
		log.debug("[mod] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();
		// TODO
		log.debug("[mod] end .. return=" + respBean);
		return respBean;
	}

	@RequestMapping(value = "/list")
	@ResponseBody
	public BaseRespBean queryList(@RequestBody @Valid CustRelaReqBean reqBean) {
		log.debug("[list] start .. params=" + reqBean);
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		paramMap.put("custId", reqBean.getCustId());
		List<CorpToCust> list = custRelaService.list(paramMap);
		DataListRespBean respBean = new DataListRespBean();
		respBean.putDataList(list);
		log.debug("[list] end .. return=" + respBean);
		return respBean;
	}

	@RequestMapping(value = "/custList")
	@ResponseBody
	public BaseRespBean queryCustList(@RequestBody @Valid CustRelaReqBean reqBean) {
		log.debug("[list] start .. params=" + reqBean);
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		paramMap.put("custId", reqBean.getCustId());
		List<CorpToCust> list = custRelaService.getCustList(paramMap);
		DataListRespBean respBean = new DataListRespBean();
		respBean.putDataList(list);
		log.debug("[list] end .. return=" + respBean);
		return respBean;
	}

	@RequestMapping(value = "/sellerList")
	@ResponseBody
	public BaseRespBean getSellerList(@RequestBody @Valid CustRelaReqBean reqBean) {
		log.debug("[list] start .. params=" + reqBean);
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		paramMap.put("custId", reqBean.getCustId());
		List<CustRela> list = custRelaService.getSellerList(paramMap);
		DataListRespBean respBean = new DataListRespBean();
		respBean.putDataList(list);
		log.debug("[list] end .. return=" + respBean);
		return respBean;
	}
}
