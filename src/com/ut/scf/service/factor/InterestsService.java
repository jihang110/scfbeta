package com.ut.scf.service.factor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.util.ScfBizUtil;
import com.ut.scf.core.util.ScfDateUtil;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.InterestFlowMapper;
import com.ut.scf.dao.auto.InterestsMapper;
import com.ut.scf.dao.auto.LoanDetailMapper;
import com.ut.scf.dao.auto.LoanMapper;
import com.ut.scf.pojo.auto.InterestFlow;
import com.ut.scf.pojo.auto.Interests;
import com.ut.scf.pojo.auto.InterestsExample;
import com.ut.scf.pojo.auto.Loan;
import com.ut.scf.pojo.auto.LoanDetail;

/**
 * 计息处理
 * 
 * @author shenying
 *
 */
@Service
public class InterestsService {

	// private final Logger log =
	// LoggerFactory.getLogger(InterestsService.class);

	@Autowired
	private LoanMapper loanMapper;

	@Autowired
	private LoanDetailMapper loanDetailMapper;

	@Autowired
	private InterestsMapper interestsMapper;

	@Autowired
	private InterestFlowMapper interestFLowMapper;

	@Transactional(readOnly = true)
	public List<Interests> getInterests(Date intDate) {
		// 查询利息表上次计息日小于业务日期的利息记录
		InterestsExample exam = new InterestsExample();
		InterestsExample.Criteria ctri = exam.createCriteria();
		ctri.andLastIntDtLessThan(intDate);
		List<Interests> intList = interestsMapper.selectByExample(exam);
		return intList;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void doProcess(Date intDate, Interests ints) throws Exception {
		final BigDecimal D360 = new BigDecimal(360);

		// 按融资明细ID找到融资明细记录和融资申请记录
		LoanDetail loanDetail = loanDetailMapper.selectByPrimaryKey(ints.getLoanDetailId());
		Loan loan = loanMapper.selectByPrimaryKey(loanDetail.getRelaId());

		// 计息本次利息金额 = 融资金额*利率*（当前业务日期 - 上一计息日）/360
		int diffDate = ScfDateUtil.getDays(ints.getLastIntDt(), intDate);
		BigDecimal curIntAmt = loanDetail.getInvLoanAmt().multiply(loan.getLoanRt()).multiply(new BigDecimal(diffDate))
				.divide(D360,4, BigDecimal.ROUND_HALF_UP);

		// 保存利息流水记录
		InterestFlow intflow = new InterestFlow();
		intflow.setRecUid(ScfUUID.generate());
		intflow.setIntUid(ints.getRecUid());
		intflow.setIntAmt(curIntAmt);
		intflow.setIntPayFlg("0");// 利息收取标志：0.应收未收
		intflow.setBusiDt(ScfBizUtil.getBusiDate());
		interestFLowMapper.insert(intflow);

		// 更新利息表利息总金额及上个计息日
		BigDecimal ttlAmt = ints.getTtlIntAmt().add(curIntAmt);
		Interests intsUpt = new Interests();
		intsUpt.setTtlIntAmt(ttlAmt);
		intsUpt.setLastIntDt(intDate);

		InterestsExample uptExam = new InterestsExample();
		InterestsExample.Criteria uptCrti = uptExam.createCriteria();
		uptCrti.andRecUidEqualTo(ints.getRecUid());
		interestsMapper.updateByExampleSelective(intsUpt, uptExam);
	}

}
