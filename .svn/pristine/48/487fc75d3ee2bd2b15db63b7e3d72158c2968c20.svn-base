package com.ut.scf.web.controller.domesticsellerfactor;

import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.core.util.ScfCacheDictUtil;
import com.ut.scf.reqbean.factor.CancIntFeeReqBean;
import com.ut.scf.reqbean.factor.CounterPartyReqBean;
import com.ut.scf.reqbean.factor.InvoiceReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.factor.CancIntFeeBpmProcessService;
import com.ut.scf.service.factor.CancIntFeeService;
import com.ut.scf.service.factor.InvcInfoService;
import com.ut.scf.web.controller.bpm.BaseBpmController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 勾销息费的控制类
 * 
 * @author zhangyx@starutian.com
 */
@Controller
@RequestMapping("/factor/cancIntFee")
public class CancIntFeeBpmController extends BaseBpmController<CancIntFeeReqBean> {

	@Autowired @Qualifier("cancIntFeeBpmService")
	private CancIntFeeBpmProcessService cancIntFeeBpmService;

	@Autowired
	private CancIntFeeService cancIntFeeService;

	@Autowired
	private InvcInfoService invcInfoService;

    @Override
    protected BpmProcessService<CancIntFeeReqBean> getBpmProcessService() {
        return cancIntFeeBpmService;
    }

    /**
     * 获取交易对手信息
     */
    @RequestMapping("/counter")
	public @ResponseBody BaseRespBean getCounterPartyList(@RequestBody CounterPartyReqBean reqBean) {
        DataListRespBean respBean = new DataListRespBean();
        Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
        respBean.putDataList(cancIntFeeService.getCounterPartyList(paramMap));
        return respBean;
    }

	/**
	 * 获取发票
	 */
	@RequestMapping("/invoice")
	public @ResponseBody BaseRespBean getInvoiceList(@RequestBody InvoiceReqBean reqBean) {
		DataListRespBean respBean = new DataListRespBean();
		respBean.putDataList(invcInfoService.getInvcListByCorpId(reqBean.getCorpId(), reqBean.getSettlementTp(),
                ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已全额付款")));
		return respBean;
	}
}
