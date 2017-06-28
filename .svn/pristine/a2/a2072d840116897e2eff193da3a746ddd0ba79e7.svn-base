package com.ut.scf.web.controller.sys;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.pojo.auto.SysFuncInterface;
import com.ut.scf.reqbean.sys.SysFuncInterfaceReqBean;
import com.ut.scf.reqbean.sys.SysFuncInterfaceSearchReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.respbean.sys.SysFuncInterfaceRespBean;
import com.ut.scf.service.sys.SysFuncInterfaceService;
import com.ut.scf.web.controller.BaseJsonController;

/**
 * 系统接口功能CRUD
 * 
 * @author shenying
 *
 */
@Controller
@RequestMapping("/interface")
public class SysFuncInterfaceController extends BaseJsonController {

	@Autowired
	private SysFuncInterfaceService sysFuncInterfaceService;

	@RequestMapping(value = "/list")
	@ResponseBody
	public BaseRespBean query(@RequestBody @Valid SysFuncInterfaceSearchReqBean reqBean) {
		if (reqBean.getIsPage().equals("1")) {
			PageListRespBean resp = new PageListRespBean();
			Map<String, Object> params = BeanUtil.beanToMap(reqBean);
			PageInfoBean page = reqBean.getPage();
			List<SysFuncInterface> dataList = sysFuncInterfaceService.getList(params, page);
			resp.putDataList(dataList, page);
			return resp;
		} else {
			DataListRespBean resp = new DataListRespBean();
			Map<String, Object> params = BeanUtil.beanToMap(reqBean);
			List<SysFuncInterface> dataList = sysFuncInterfaceService.getList(params);
			resp.putDataList(dataList);
			return resp;
		}
	}

	@RequestMapping(value = "/get")
	@ResponseBody
	public BaseRespBean get(@RequestBody SysFuncInterfaceSearchReqBean reqBean) {
		BaseRespBean resp = new BaseRespBean();
		SysFuncInterfaceRespBean result = sysFuncInterfaceService.get(reqBean.getInterfaceId());
		resp.setResultData(result);
		return resp;
	}

	@RequestMapping(value = "/add")
	@ResponseBody
	public BaseRespBean add(@RequestBody @Valid SysFuncInterfaceReqBean reqBean) {
		BaseRespBean resp = new BaseRespBean();
		String id = sysFuncInterfaceService.add(reqBean);
		resp.putData("id", id);
		return resp;
	}

	@RequestMapping(value = "/mod")
	@ResponseBody
	public BaseRespBean modify(@RequestBody @Valid SysFuncInterfaceReqBean reqBean) {
		BaseRespBean resp = new BaseRespBean();
		String id = sysFuncInterfaceService.modify(reqBean);
		resp.putData("id", id);
		return resp;
	}

	@RequestMapping(value = "/delete")
	@ResponseBody
	public BaseRespBean delete(@RequestBody @Valid SysFuncInterfaceReqBean reqBean) {
		BaseRespBean resp = new BaseRespBean();
		sysFuncInterfaceService.delete(reqBean.getInterfaceId());
		return resp;
	}

}
