package com.ut.scf.web.controller.domesticsellerfactor;

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
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.factor.CustAcFeeDeductReqBean;
import com.ut.scf.reqbean.factor.CustAcIntDeductReqBean;
import com.ut.scf.reqbean.factor.CustAcIouReqBean;
import com.ut.scf.reqbean.factor.CustAcPayReqBean;
import com.ut.scf.reqbean.factor.CustAcReceReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.service.factor.CustAcService;
import com.ut.scf.web.controller.BaseJsonController;


/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月20日 下午2:33:00
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
@Controller
@RequestMapping("/factor/custac")
public class CustAcController extends BaseJsonController{

	@Resource
	private CustAcService custAcService;
	
	@RequestMapping(value = "/list")
	public @ResponseBody BaseRespBean getPayList(HttpSession httpSession,
			@Valid @RequestBody CustAcPayReqBean reqBean) {

		PageListRespBean resp = new PageListRespBean();
		Map<String, Object> params = BeanUtil.beanToMap(reqBean);
		PageInfoBean page = reqBean.getPage();
		List<CustAcPayReqBean> dataList = custAcService.getPayList(params, page);
		resp.putDataList(dataList, page);
		return resp;

	}
	@RequestMapping(value = "/receList")
	public @ResponseBody BaseRespBean getReceList(HttpSession httpSession,
			@Valid @RequestBody CustAcReceReqBean reqBean) {
		
		PageListRespBean resp = new PageListRespBean();
		Map<String, Object> params = BeanUtil.beanToMap(reqBean);
		PageInfoBean page = reqBean.getPage();
		List<CustAcReceReqBean> dataList = custAcService.getReceList(params, page);
		resp.putDataList(dataList, page);
		return resp;
		
	}
	@RequestMapping(value = "/iouList")
	public @ResponseBody BaseRespBean getIouList(HttpSession httpSession,
			@Valid @RequestBody CustAcIouReqBean reqBean) {
		
		PageListRespBean resp = new PageListRespBean();
		Map<String, Object> params = BeanUtil.beanToMap(reqBean);
		PageInfoBean page = reqBean.getPage();
		List<CustAcIouReqBean> dataList = custAcService.getIouList(params, page);
		resp.putDataList(dataList, page);
		return resp;
		
	}
	@RequestMapping(value = "/intDeductList")
	public @ResponseBody BaseRespBean getIntDeductList(HttpSession httpSession,
			@Valid @RequestBody CustAcIntDeductReqBean reqBean) {
		
		PageListRespBean resp = new PageListRespBean();
		Map<String, Object> params = BeanUtil.beanToMap(reqBean);
		PageInfoBean page = reqBean.getPage();
		List<CustAcIntDeductReqBean> dataList = custAcService.getIntDeductList(params, page);
		resp.putDataList(dataList, page);
		return resp;
		
	}
	@RequestMapping(value = "/feeDeductList")
	public @ResponseBody BaseRespBean getFeeDeductList(HttpSession httpSession,
			@Valid @RequestBody CustAcFeeDeductReqBean reqBean) {
		
		PageListRespBean resp = new PageListRespBean();
		Map<String, Object> params = BeanUtil.beanToMap(reqBean);
		PageInfoBean page = reqBean.getPage();
		List<CustAcFeeDeductReqBean> dataList = custAcService.getFeeDeductList(params, page);
		resp.putDataList(dataList, page);
		return resp;
		
	}
}
