package com.ut.scf.web.controller.domesticsellerfactor;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.reqbean.factor.BuyerCntrctReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.factor.BuyerCntrctBpmProcessService;
import com.ut.scf.service.serial.SerialService;
import com.ut.scf.web.controller.bpm.BaseBpmController;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月15日 下午4:54:00
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * 
 * @author wuk@starutian.com
 * @version 1.0.0
 */
@Controller
@RequestMapping("/pub/buyercntrct")
public class BuyerCntrctBpmController extends BaseBpmController<BuyerCntrctReqBean> {

	@Resource(name = "buyerCntrctBpmProcessService")
	private BpmProcessService<BuyerCntrctReqBean> buyerCntrctBpmProcessService;

	@Override
	protected BpmProcessService<BuyerCntrctReqBean> getBpmProcessService() {

		return buyerCntrctBpmProcessService;
	}

	protected BuyerCntrctBpmProcessService getCrudService() {
		return (BuyerCntrctBpmProcessService) buyerCntrctBpmProcessService;
	}
	
	@Resource
	private SerialService serialService;

	@RequestMapping(value = "/add")
	@ResponseBody
	public BaseRespBean add(@RequestBody @Valid BuyerCntrctReqBean reqBean, HttpSession httpSession) {
		BaseRespBean resp = new BaseRespBean();
		reqBean.setRecUid(serialService.setSerial("CNTRCT",(String)httpSession.getAttribute("deptId")));
		String id = getCrudService().add(reqBean);
		resp.putData("id", id);
		return resp;
	}

}
