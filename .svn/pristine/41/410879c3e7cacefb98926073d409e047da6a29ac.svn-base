package com.ut.scf.web.controller.serial;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.pojo.serial.UserTables;
import com.ut.scf.reqbean.serial.SerialAddReqBean;
import com.ut.scf.reqbean.serial.SerialListReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.service.serial.SerialService;
import com.ut.scf.web.controller.BaseJsonController;

/**
 * 流水号控制
 * 
 * @author wukai
 */
@Controller
@RequestMapping("/serial")
public class SerialController extends BaseJsonController {

	@Resource
	private SerialService serialService;

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json;charset=UTF-8" })
	public @ResponseBody BaseRespBean addSerial(HttpSession httpSession, @Valid @RequestBody SerialAddReqBean reqBean) {

		BaseRespBean respBean = new BaseRespBean();
		reqBean.setCreateUser((String)httpSession.getAttribute("userId"));
		reqBean.setCreateTime(new Date());
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		respBean = this.serialService.addSerial(paramMap);
		return respBean;

	}

	@RequestMapping(value = "/tablename")
	public @ResponseBody BaseRespBean getAllTables(@RequestBody UserTables reqBean) {

		DataListRespBean respBean = new DataListRespBean();
		if(reqBean.getSerialNm() != null){
			reqBean.setSerialNm(reqBean.getSerialNm().toUpperCase());
		}
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		respBean.putDataList(serialService.getAllTable(paramMap));
		return respBean;

	}

	@RequestMapping(value = "/list")
	public @ResponseBody BaseRespBean getSerialList(HttpSession httpSession, @Valid @RequestBody SerialListReqBean reqBean) 
	{

		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);

		PageInfoBean page = reqBean.getPage();
		return this.serialService.getSerialList(paramMap, page);

	}

}
