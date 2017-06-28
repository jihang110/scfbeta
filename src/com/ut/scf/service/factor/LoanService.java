package com.ut.scf.service.factor;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.core.util.ScfBizUtil;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.CntrctMapper;
import com.ut.scf.dao.auto.InterestsMapper;
import com.ut.scf.dao.auto.InvcInfoMapper;
import com.ut.scf.dao.auto.LimitOccupyMapper;
import com.ut.scf.dao.auto.LoanDetailMapper;
import com.ut.scf.dao.auto.LoanMapper;
import com.ut.scf.pojo.auto.Cntrct;
import com.ut.scf.pojo.auto.Interests;
import com.ut.scf.pojo.auto.InvcInfo;
import com.ut.scf.pojo.auto.Loan;
import com.ut.scf.pojo.auto.LoanDetail;
import com.ut.scf.reqbean.factor.LoanDetailReqBean;
import com.ut.scf.reqbean.factor.LoanReqBean;
import com.ut.scf.service.pubmanage.LimitService;

@Service
public class LoanService {

	@Autowired
	private LoanMapper loanMapper;

	@Autowired
	private LoanDetailMapper loanDetailMapper;

	@Autowired
	private InvcInfoMapper invcInfoMapper;

	@Autowired
	private LimitOccupyMapper limitOccupyMapper;

	@Autowired
	private LimitService limitService;

	@Autowired
	private InterestsMapper interestsMapper;

	@Autowired
	private CntrctMapper cntrctMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public String save(LoanReqBean loanReqBean) {
		String loadId = ScfUUID.generate();
		Loan loan = new Loan();
		DozerMapper.copy(loanReqBean, loan);
		loan.setRecUid(loadId);
		loan.setLoanDt(ScfBizUtil.getBusiDate());
		loanMapper.insert(loan);

		// 取得卖方协议记录，判断融资申请的利息承担方是买方时，则承担方ID为卖方协议记录的交易对手ID，否则为卖方协议的客户ID
		Cntrct cnt = cntrctMapper.selectByPrimaryKey(loan.getCntId());
		String bearerId = loan.getAssumeIntTp().equals("1") ? cnt.getCounterPartyId() : cnt.getCustId();

		List<LoanDetailReqBean> details = loanReqBean.getDetailList();
		for (LoanDetailReqBean detailBean : details) {
			LoanDetail detail = new LoanDetail();
			DozerMapper.copy(detailBean, detail);
			detail.setRecUid(ScfUUID.generate());
			detail.setRelaId(loadId);
			detail.setInvLoanSts("1");// 0待放款,1已放款
			loanDetailMapper.insert(detail);

			// 更新发票状态为“已融资”
			InvcInfo invc = new InvcInfo();
			invc.setRecUid(detailBean.getInvcId());
			invc.setInvStatus("4");
			invcInfoMapper.updateByPrimaryKeySelective(invc);

			// 创建利息表记录
			Interests ints = new Interests();
			ints.setRecUid(ScfUUID.generate());
			ints.setLoanDetailId(detail.getRecUid());
			ints.setInvcId(detailBean.getInvcId());
			ints.setTtlIntAmt(new BigDecimal(0));
			ints.setBearerId(bearerId);
			ints.setLastIntDt(loan.getLoanDt());
			ints.setBusiDt(ScfBizUtil.getBusiDate());
			interestsMapper.insert(ints);
		}

		// 更新额度占用表记录状态为已占用
		limitService.updateToOccpyStatus(loanReqBean.getLimitRecUid());
		return loadId;
	}
}
