package com.ut.scf.web.controller.factor;

import java.util.Map;

import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.reqbean.factor.InvcConfirmReqBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.factor.CounterPartyReqBean;
import com.ut.scf.reqbean.factor.InvoiceReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.factor.InvcInfoService;
import com.ut.scf.service.factor.InvcConfirmBpmProcessService;
import com.ut.scf.sys.util.ScfCacheDictUtil;
import com.ut.scf.web.controller.bpm.BaseBpmController;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/factor/invRegConfig")
public class InvcConfirmController extends BaseBpmController<InvcConfirmReqBean> {

    @Autowired
    private InvcConfirmBpmProcessService invcConfirmBpmProcessService;

    @Autowired
    private InvcInfoService invcInfoService;

    @Override
    protected BpmProcessService<InvcConfirmReqBean> getBpmProcessService() {
        return invcConfirmBpmProcessService;
    }

    @RequestMapping("/counter")
    public @ResponseBody
    BaseRespBean getCounterPartyList(@RequestBody CounterPartyReqBean reqBean, HttpSession session) {
        DataListRespBean respBean = new DataListRespBean();
        Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
        paramMap.put("custId", session.getAttribute(ScfConsts.SESSION_CORP_ID));
        paramMap.put("invStatus", ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已登记"));
        respBean.putDataList(invcConfirmBpmProcessService.getCounterPartyList(paramMap));
        return respBean;
    }

    @RequestMapping("/invoice")
    public @ResponseBody
    BaseRespBean getInvoiceList(@RequestBody InvoiceReqBean reqBean) {
        DataListRespBean respBean = new DataListRespBean();
        reqBean.setInvStatus(ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已登记"));
        respBean.putDataList(invcInfoService.getListByBuy(reqBean));
        return respBean;
    }
}
