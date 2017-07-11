package com.ut.scf.web.controller.factor;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ut.scf.reqbean.factor.LoanReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.respbean.factor.InvcInfoRespBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.factor.InvcInfoService;
import com.ut.scf.web.controller.bpm.BaseBpmController;

@Controller
@RequestMapping("/factor/loan")
public class LoanBpmController extends BaseBpmController<LoanReqBean> {

	@Resource(name = "loanBpmService")
	private BpmProcessService<LoanReqBean> loanBpmService;

	@Autowired
	private InvcInfoService invcInfoService;

	@Override
	protected BpmProcessService<LoanReqBean> getBpmProcessService() {
		return loanBpmService;
	}

	@RequestMapping(value = "/invlist")
	@ResponseBody
	public BaseRespBean query(@RequestParam String cntId) {
		DataListRespBean resp = new DataListRespBean();
		//TODO modify 已确认已转让 to invc status enum
		List<InvcInfoRespBean> invlist = invcInfoService.getInvcListBy(cntId, "3");
		resp.putDataList(invlist);
		return resp;
	}
}
