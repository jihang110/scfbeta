package com.ut.scf.web.controller.sys;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.pojo.auto.UserCommonWebsite;
import com.ut.scf.reqbean.sys.CommonWebListReqBean;
import com.ut.scf.reqbean.sys.UserCommonWebsiteReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.service.sys.CommonWebService;
import com.ut.scf.web.controller.BaseJsonController;

/**
 * 常用链接的控制类
 * 
 * @author zhangyx
 */
@Controller
@RequestMapping("/commonWeb")
public class CommonWebController extends BaseJsonController {

	private static final Logger log = LoggerFactory.getLogger(CommonWebController.class);

	@Autowired
	private CommonWebService commonWebService;

	@RequestMapping(value = "/add")
	public @ResponseBody BaseRespBean addCommonWeb(@Valid @RequestBody UserCommonWebsiteReqBean reqBean, BindingResult bindingResult)
	        throws IOException {
		log.debug("[add] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();
		if (bindingResult.hasErrors()) {
			log.warn("bindingResult has error");
			respBean.setResult(ErrorCodeEnum.PARAM_VALID_ERROR);
			respBean.setResultErrorMap(bindingResult);
			return respBean;
		}
		String recUid = commonWebService.add(reqBean);
		respBean.putData("recUid", recUid);
		log.debug("[add] end .. return=" + respBean);
		return respBean;

	}

	@RequestMapping(value = "/delete")
	public @ResponseBody BaseRespBean deleteCommonWeb(@Valid @RequestBody UserCommonWebsiteReqBean reqBean, BindingResult bindingResult)
	        throws IOException {
		log.debug("[delete] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();
		if (bindingResult.hasErrors()) {
			log.warn("bindingResult has error");
			respBean.setResult(ErrorCodeEnum.PARAM_VALID_ERROR);
			respBean.setResultErrorMap(bindingResult);
			return respBean;
		}
		commonWebService.delete(reqBean.getRecUid());
		log.debug("[delete] end .. return=" + respBean);
		return respBean;

	}

	@RequestMapping(value = "/list")
	public @ResponseBody BaseRespBean list(CommonWebListReqBean reqBean) throws IOException {
		log.debug("[list] start .. params=" + reqBean);
		PageListRespBean respBean = new PageListRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		if (reqBean.getIsPage() == 1) {
			PageInfoBean page = reqBean.getPage();
			List<UserCommonWebsite> dataList = commonWebService.getList(paramMap, page);
			respBean.putDataList(dataList, page);
		} else {
			List<UserCommonWebsite> dataList = commonWebService.getList(paramMap);
			respBean.setResultData(dataList);
		}
		log.debug("[list] end .. return=" + respBean);
		return respBean;
	}

	@RequestMapping(value = "/mod")
	public @ResponseBody BaseRespBean updateCommonWeb(@Valid @RequestBody UserCommonWebsiteReqBean reqBean, BindingResult bindingResult)
	        throws IOException {
		log.debug("[mod] start .. params=" + reqBean);
		BaseRespBean respBean = new BaseRespBean();

		if (bindingResult.hasErrors()) {
			log.warn("bindingResult has error");
			respBean.setResult(ErrorCodeEnum.PARAM_VALID_ERROR);
			respBean.setResultErrorMap(bindingResult);
			return respBean;
		}

		String recUid = commonWebService.update(reqBean);
		respBean.putData("recUid", recUid);
		log.debug("[mod] end .. return=" + respBean);
		return respBean;

	}
}
