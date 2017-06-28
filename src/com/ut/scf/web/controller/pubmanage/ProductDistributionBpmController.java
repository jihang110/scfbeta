package com.ut.scf.web.controller.pubmanage;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.pubmanage.ProductDistributionBean;
import com.ut.scf.reqbean.pubmanage.ProductDistributionReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.pubmanage.ProductDistributionService;
import com.ut.scf.web.controller.bpm.BaseBpmController;

/**
 * 产品分配
 * 
 * @author shenying
 *
 */
@Controller
@RequestMapping("/pub/prdtdist")
public class ProductDistributionBpmController extends BaseBpmController<ProductDistributionReqBean> {

	@Resource(name = "productDistributionBpmProcessService")
	private BpmProcessService<ProductDistributionReqBean> productDistributionBpmProcessService;

	@Autowired
	private ProductDistributionService productDistributionService;
	
	@Override
	protected BpmProcessService<ProductDistributionReqBean> getBpmProcessService() {
		return productDistributionBpmProcessService;
	}
	
	protected ProductDistributionService getCrudService() {
		return (ProductDistributionService) productDistributionService;
	}
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public BaseRespBean query(@RequestBody @Valid ProductDistributionBean reqBean) {
			DataListRespBean resp = new DataListRespBean();
			Map<String, Object> params = BeanUtil.beanToMap(reqBean);
			List<Map<String, Object>> dataList = getCrudService().getList(params);
			resp.putDataList(dataList);
			return resp;
		}

}
