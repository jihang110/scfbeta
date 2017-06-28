package com.ut.scf.web.controller.domesticsellerfactor;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.factor.CounterPartyReqBean;
import com.ut.scf.reqbean.factor.InvoiceReqBean;
import com.ut.scf.reqbean.factor.PaymentReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.factor.PaymentBpmProcessService;
import com.ut.scf.service.factor.PaymentService;
import com.ut.scf.web.controller.bpm.BaseBpmController;

/**
 * 付款申请的控制类
 * 
 * @author zhangyx@starutian.com
 */
@Controller
@RequestMapping("/factor/payment")
public class PaymentBpmController extends BaseBpmController<PaymentReqBean> {

	@Autowired
	private PaymentBpmProcessService paymentBpmService;

	@Autowired
	private PaymentService paymentService;

	/**
	 * 查询
	 * 
	 * @param httpSession
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/list")
	public @ResponseBody BaseRespBean list(HttpSession httpSession, @Valid @RequestBody PaymentReqBean reqBean) throws IOException {
		log.debug("[list] start .. params=" + reqBean);
		PageListRespBean respBean = new PageListRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		List<Map<String, Object>> list = paymentService.list(paramMap);
		respBean.setResultData(list);
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
	public @ResponseBody BaseRespBean relaAdd(HttpSession httpSession, @Valid @RequestBody PaymentReqBean reqBean) throws IOException {
		log.debug("[add] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();
		// 获取用户信息
		String userIdSession = (String) httpSession.getAttribute(ScfConsts.SESSION_USER_ID);
		log.debug("userIdSession: {}", userIdSession);

		reqBean.setCreateUser(userIdSession);
		reqBean.setCreateTime(new Date());
		reqBean.setStatus((short) 1);
		String recUid = paymentService.add(reqBean);
		respBean.putData("recUid", recUid);

		log.debug("[add] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 删除
	 * 
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/delete")
	public @ResponseBody BaseRespBean relaDelete(@Valid @RequestBody PaymentReqBean reqBean) throws IOException {
		log.debug("[delete] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();
		log.debug("[delete] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 修改
	 * 
	 * @param reqBean
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/mod")
	public @ResponseBody BaseRespBean relaUpdate(@Valid @RequestBody PaymentReqBean reqBean) throws IOException {
		log.debug("[mod] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();

		log.debug("[mod] end .. return=" + respBean);
		return respBean;
	}

	@Override
	protected BpmProcessService<PaymentReqBean> getBpmProcessService() {
		return paymentBpmService;
	}

	protected PaymentBpmProcessService getCrudService() {
		return paymentBpmService;
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
		respBean.putDataList(paymentService.getCounterPartyList(paramMap));
		return respBean;
	}

	/**
	 * 获取发票
	 * 
	 * @param reqBean
	 * @return
	 */
	@RequestMapping("/invoice")
	public @ResponseBody BaseRespBean getInvoiceList(@RequestBody InvoiceReqBean reqBean) {
		DataListRespBean respBean = new DataListRespBean();
		respBean.putDataList(paymentService.getList(reqBean));
		return respBean;
	}
}
