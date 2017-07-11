package com.ut.scf.web.controller.factor;

import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.reqbean.factor.CounterPartyReqBean;
import com.ut.scf.reqbean.factor.InvcTransferReqBean;
import com.ut.scf.reqbean.factor.InvoiceReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.factor.InvcInfoService;
import com.ut.scf.service.factor.InvcTransferBpmProcessService;
import com.ut.scf.sys.util.ScfCacheDictUtil;
import com.ut.scf.web.controller.bpm.BaseBpmController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/factor/invTrans")
public class InvcTransferBpmController extends BaseBpmController<InvcTransferReqBean> {

    @Autowired @Qualifier("invcTransferService")
    private InvcTransferBpmProcessService invcTransferService;

    @Autowired
    private InvcInfoService invcInfoService;

    @Override
    protected BpmProcessService<InvcTransferReqBean> getBpmProcessService() {
        return invcTransferService;
    }

    @RequestMapping("/counter")
    public @ResponseBody
    BaseRespBean getCounterPartyList(@RequestBody CounterPartyReqBean reqBean, HttpSession session) {
        DataListRespBean respBean = new DataListRespBean();
        Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
        paramMap.put("custId", session.getAttribute(ScfConsts.SESSION_CORP_ID));
        paramMap.put("invStatus", ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已确认"));
        respBean.putDataList(invcTransferService.getCounterPartyList(paramMap));
        return respBean;
    }

    @RequestMapping("/invoice")
    public @ResponseBody
    BaseRespBean getInvoiceList(@RequestBody InvoiceReqBean reqBean) {
        DataListRespBean respBean = new DataListRespBean();
        reqBean.setInvStatus(ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已确认"));
        respBean.putDataList(invcInfoService.getList(reqBean));
        return respBean;
    }
}
