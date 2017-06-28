package com.ut.scf.web.controller.sys;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import com.ut.scf.core.util.ScfCacheDictUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.sys.DictListReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.service.sys.DictMapService;
import com.ut.scf.web.controller.BaseJsonController;

/**
 * 数据字典相关的控制类
 * 
 * @author zhangyx
 */
@Controller
@RequestMapping("/dict")
public class SysDictController extends BaseJsonController {

	@Resource
	private DictMapService dictService;

	/**
	 * 查询缓存字典列表
	 * 
	 * @return 字典列表
	 * @throws IOException
	 */
	@RequestMapping(value = "listAll")
	public @ResponseBody BaseRespBean dictAllList() throws IOException {
		log.debug("[listAll] start .. ");
		BaseRespBean respBean = new BaseRespBean();
		Map<String, Object> map = ScfCacheDictUtil.getDictMapList();
		respBean.setResultData(map);
		log.debug("[listAll] end .. return=" + respBean);
		return respBean;
	}

	/**
	 * 查询数据库字典列表
	 * 
	 * @param reqBean
	 * @param bindingResult
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "list")
	public @ResponseBody BaseRespBean dictList(@Valid @RequestBody DictListReqBean reqBean) throws IOException {
		log.debug("[list] start .. params=" + reqBean);
		PageListRespBean respBean = new PageListRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		if (reqBean.getIsPage() == 1) {
			PageInfoBean page = reqBean.getPage();
			List<Map<String, Object>> dataList = dictService.getDictMapList(paramMap, page);
			respBean.putDataList(dataList, page);
		} else {
			List<Map<String, Object>> dataList = dictService.getDictMapList(paramMap);
			respBean.setResultData(dataList);
		}
		log.debug("[list] end .. return=" + respBean);
		return respBean;
	}
}
