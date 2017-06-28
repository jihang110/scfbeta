package com.ut.scf.web.controller.pubmanage;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.pojo.auto.CorpInfo;
import com.ut.scf.reqbean.pubmanage.CorpInfoReqBean;
import com.ut.scf.reqbean.pubmanage.CorpInfoSearchReqBean;
import com.ut.scf.reqbean.pubmanage.CorpToCust;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.pubmanage.CorpInfoService;
import com.ut.scf.web.controller.bpm.BaseBpmController;

/**
 * 公共管理-客户管理
 * 
 * @author shenying
 *
 */
@Controller
@RequestMapping("/pub/corp")
public class CorpInfoBpmController extends BaseBpmController<CorpInfoReqBean> {

	@Resource(name = "corpInfoBpmProcessService")
	private BpmProcessService<CorpInfoReqBean> corpInfoBpmProcessService;

	@Autowired
	private CorpInfoService corpInfoService;

	@Override
	protected BpmProcessService<CorpInfoReqBean> getBpmProcessService() {
		return corpInfoBpmProcessService;
	}

	@RequestMapping(value = "/list")
	@ResponseBody
	public BaseRespBean query(@RequestBody @Valid CorpInfoSearchReqBean reqBean) {
		if (reqBean.getIsPage().equals("1")) {
			PageListRespBean resp = new PageListRespBean();
			Map<String, Object> params = BeanUtil.beanToMap(reqBean);
			PageInfoBean page = reqBean.getPage();
			List<CorpInfo> dataList = corpInfoService.getList(params, page);
			resp.putDataList(dataList, page);
			return resp;
		} else {
			DataListRespBean resp = new DataListRespBean();
			Map<String, Object> params = BeanUtil.beanToMap(reqBean);
			List<CorpInfo> dataList = corpInfoService.getList(params);
			resp.putDataList(dataList);
			return resp;
		}
	}

	@RequestMapping(value = "/get")
	@ResponseBody
	public BaseRespBean get(@RequestBody CorpInfoReqBean reqBean) {
		BaseRespBean resp = new BaseRespBean();
		CorpInfoReqBean result = corpInfoService.get(reqBean.getCorpId());
		resp.setResultData(result);
		return resp;
	}

	@RequestMapping(value = "/add")
	@ResponseBody
	public BaseRespBean add(@RequestBody @Valid CorpInfoReqBean reqBean) {
		reqBean.setCreateUser((String) getSessionAttribute(ScfConsts.SESSION_USER_ID));
		reqBean.setCreateTime(new Date());
		String id = corpInfoService.add(reqBean);
		BaseRespBean resp = new BaseRespBean();
		resp.putData("id", id);
		return resp;
	}

	@RequestMapping(value = "/mod")
	@ResponseBody
	public BaseRespBean modify(@RequestBody @Valid CorpInfoReqBean reqBean) {
		BaseRespBean resp = new BaseRespBean();
		String id = corpInfoService.update(reqBean);
		resp.putData("id", id);
		return resp;
	}

	@RequestMapping(value = "/delete")
	@ResponseBody
	public BaseRespBean delete(@RequestBody @Valid CorpInfoReqBean reqBean) {
		BaseRespBean resp = new BaseRespBean();
		corpInfoService.delete(reqBean.getCorpId());
		return resp;
	}

	@RequestMapping(value = "/lookupList")
	@ResponseBody
	public BaseRespBean queryLookupList(@RequestBody @Valid CorpInfoSearchReqBean reqBean) {
		PageListRespBean resp = new PageListRespBean();
		Map<String, Object> params = BeanUtil.beanToMap(reqBean);
		params.put("corpType", "BUYER");
		
		PageInfoBean page = reqBean.getPage();
		List<CorpInfo> dataList = corpInfoService.getList(params, page);
		resp.putDataList(dataList, page);
		return resp;
	}

	@RequestMapping(value = "/custList")
	@ResponseBody
	public BaseRespBean queryCustList(@RequestBody @Valid CorpInfoSearchReqBean reqBean) {
		PageListRespBean resp = new PageListRespBean();
		Map<String, Object> params = BeanUtil.beanToMap(reqBean);
		PageInfoBean page = reqBean.getPage();
		List<CorpToCust> dataList = corpInfoService.getCustList(params, page);
		resp.putDataList(dataList, page);
		return resp;
	}

	@RequestMapping(value = "/acctUsed")
	@ResponseBody
	public BaseRespBean countAcctUsed(@RequestParam String acctId) {
		BaseRespBean resp = new BaseRespBean();
		int cnt = corpInfoService.countAcctIdUsed(acctId);
		resp.putData("used", cnt > 0 ? "1" : "0");
		return resp;
	}
}
