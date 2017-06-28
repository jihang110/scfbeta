package com.ut.scf.web.controller.domesticsellerfactor;

import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.factor.CounterPartyReqBean;
import com.ut.scf.reqbean.factor.InvcRegReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.factor.InvcInfoService;
import com.ut.scf.service.factor.InvcRegBpmProcessService;
import com.ut.scf.service.factor.InvcRegService;
import com.ut.scf.web.controller.bpm.BaseBpmController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/**
 * 发票登记的控制类
 * 
 * @author zhangyx@starutian.com
 */
@Controller
@RequestMapping("/factor/invcReg")
public class InvcRegController extends BaseBpmController<InvcRegReqBean> {

	@Autowired
	@Qualifier("invcRegBpmService")
	private InvcRegBpmProcessService invcRegBpmService;

	@Autowired
	private InvcInfoService invcInfoService;

	@Autowired
	private InvcRegService invcRegService;

	/**
	 * 查询
	 * 
	 * @param httpSession
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/list")
	public @ResponseBody BaseRespBean list(HttpSession httpSession, @Valid @RequestBody InvcRegReqBean reqBean) throws IOException {
		log.debug("[list] start .. params=" + reqBean);
		PageListRespBean respBean = new PageListRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);

		paramMap.put("regBtcId", reqBean.getRecUid());
		log.debug("[list] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 新增
	 * 
	 * @param httpSession
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/add")
	public @ResponseBody BaseRespBean relaAdd(HttpSession httpSession, @Valid @RequestBody InvcRegReqBean reqBean) throws IOException {
		log.debug("[add] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();
		// 获取用户信息
		String userIdSession = (String) httpSession.getAttribute(ScfConsts.SESSION_USER_ID);
		log.debug("userIdSession: {}", userIdSession);

		reqBean.setCreateUser(userIdSession);
		reqBean.setCreateTime(new Date());
		reqBean.setStatus((short) 1);
		String recUid = invcRegService.add(reqBean);

		respBean.putData("recUid", recUid);
		log.debug("[add] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 删除关联关系
	 * 
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/delete")
	public @ResponseBody BaseRespBean relaDelete(@Valid @RequestBody InvcRegReqBean reqBean) throws IOException {
		log.debug("[delete] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();
		log.debug("[delete] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 修改关联关系
	 * 
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/mod")
	public @ResponseBody BaseRespBean relaUpdate(@Valid @RequestBody InvcRegReqBean reqBean) throws IOException {
		log.debug("[mod] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();

		log.debug("[mod] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 获取交易对手信息
	 * 
	 * @param reqBean
	 * @return
	 */
	@RequestMapping("/counter")
	public @ResponseBody BaseRespBean getCounterPartyList(@RequestBody CounterPartyReqBean reqBean) {
		DataListRespBean respBean = new DataListRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		respBean.putDataList(invcInfoService.getCounterPartyList(paramMap));
		return respBean;
	}

	@Override
	protected BpmProcessService<InvcRegReqBean> getBpmProcessService() {
		return invcRegBpmService;
	}

	protected InvcRegBpmProcessService getCrudService() {
		return invcRegBpmService;
	}
}
