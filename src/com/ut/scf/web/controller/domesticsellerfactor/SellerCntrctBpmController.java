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
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.PageReqBean;
import com.ut.scf.reqbean.factor.CntRecomReqBean;
import com.ut.scf.reqbean.factor.SellerCntrctReqBean;
import com.ut.scf.reqbean.factor.SellerCntrctSearchReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.respbean.factor.SellerCntRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.factor.SellerCntrctBpmProcessService;
import com.ut.scf.service.serial.SerialService;
import com.ut.scf.web.controller.bpm.BaseBpmController;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月16日 下午2:44:24
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * 
 * @author wuk@starutian.com
 * @version 1.0.0
 */
@Controller
@RequestMapping("/pub/sellercntrct")
public class SellerCntrctBpmController extends BaseBpmController<SellerCntrctReqBean> {

	@Resource(name = "sellerCntrctBpmProcessService")
	private BpmProcessService<SellerCntrctReqBean> sellerCntrctBpmProcessService;

	@Override
	protected BpmProcessService<SellerCntrctReqBean> getBpmProcessService() {
		return sellerCntrctBpmProcessService;
	}

	protected SellerCntrctBpmProcessService getCrudService() {
		return (SellerCntrctBpmProcessService) sellerCntrctBpmProcessService;
	}

	@Resource
	private SerialService serialService;
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public BaseRespBean query(@RequestBody @Valid SellerCntrctSearchReqBean reqBean) {
		if (reqBean.getIsPage().equals("1")) {
			PageListRespBean resp = new PageListRespBean();
			Map<String, Object> params = BeanUtil.beanToMap(reqBean);
			PageInfoBean page = reqBean.getPage();
			List<CntRecomReqBean> dataList = getCrudService().getList(params, page);
			resp.putDataList(dataList, page);
			return resp;
		} else {
			DataListRespBean resp = new DataListRespBean();
			Map<String, Object> params = BeanUtil.beanToMap(reqBean);
			List<CntRecomReqBean> dataList = getCrudService().getList(params);
			resp.putDataList(dataList);
			return resp;
		}
	}

	@RequestMapping(value = "/get")
	@ResponseBody
	public BaseRespBean get(@RequestBody SellerCntrctReqBean reqBean) {
		BaseRespBean resp = new BaseRespBean();
		SellerCntrctReqBean result = getCrudService().get(reqBean.getRecUid());
		resp.setResultData(result);
		return resp;
	}

	@RequestMapping(value = "/add")
	@ResponseBody
	public BaseRespBean add(@RequestBody @Valid SellerCntrctReqBean reqBean, HttpSession httpSession) {
		BaseRespBean resp = new BaseRespBean();	
		reqBean.setRecUid(serialService.setSerial("CNTRCT",(String)httpSession.getAttribute("deptId")));
		String id = getCrudService().add(reqBean);
		resp.putData("id", id);
		return resp;
	}

	@RequestMapping(value = "/sellerCntLookupList")
	@ResponseBody
	public BaseRespBean querySellerCntLookupList(@RequestBody @Valid PageReqBean reqBean) {
		PageListRespBean resp = new PageListRespBean();
		PageInfoBean page = reqBean.getPage();
		String corpId = (String) getSessionAttribute(ScfConsts.SESSION_CORP_ID);
		List<SellerCntRespBean> dataList = ((SellerCntrctBpmProcessService) sellerCntrctBpmProcessService)
				.getSellerCntList(corpId, page);
		resp.putDataList(dataList, page);
		return resp;
	}
}
