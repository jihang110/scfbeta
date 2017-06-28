package com.ut.scf.web.controller.domesticsellerfactor;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.core.util.ScfCacheDictUtil;
import com.ut.scf.reqbean.factor.CounterPartyReqBean;
import com.ut.scf.reqbean.factor.InvcRegReqBean;
import com.ut.scf.reqbean.factor.InvoiceReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.factor.InvcInfoService;
import com.ut.scf.service.factor.InvcRegConfigBpmProcessService;
import com.ut.scf.web.controller.bpm.BaseBpmController;

@Controller
@RequestMapping("/factor/invRegConfig")
public class InvcRegConfigController extends BaseBpmController<InvcRegReqBean> {

    @Autowired
    private InvcRegConfigBpmProcessService invcRegConfigBpmProcessService;

    @Autowired
    private InvcInfoService invcInfoService;

    @Override
    protected BpmProcessService<InvcRegReqBean> getBpmProcessService() {
        return invcRegConfigBpmProcessService;
    }
    
    protected InvcRegConfigBpmProcessService getCrudService() {
		return (InvcRegConfigBpmProcessService) invcRegConfigBpmProcessService;
	}

    @RequestMapping("/counter")
    public @ResponseBody
    BaseRespBean getCounterPartyList(@RequestBody CounterPartyReqBean reqBean) {
        DataListRespBean respBean = new DataListRespBean();
        Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
        paramMap.put("invStatus", ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已登记"));
        respBean.putDataList(invcInfoService.getCounterPartyList(paramMap));
        return respBean;
    }

    @RequestMapping("/invoice")
    public @ResponseBody
    BaseRespBean getInvoiceList(@RequestBody InvoiceReqBean reqBean) {
        DataListRespBean respBean = new DataListRespBean();
        reqBean.setInvStatus(ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已登记"));
        respBean.putDataList(invcInfoService.getList(reqBean));
        return respBean;
    }
}
