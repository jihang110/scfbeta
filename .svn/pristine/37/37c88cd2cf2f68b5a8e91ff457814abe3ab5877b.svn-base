package com.ut.scf.service.factor;

import java.util.List;
import java.util.Map;

import com.ut.scf.dao.auto.FeeFlowMapper;
import com.ut.scf.dao.auto.InterestFlowMapper;
import com.ut.scf.dao.factor.IInterestDao;
import com.ut.scf.pojo.auto.Fee;
import com.ut.scf.pojo.auto.FeeFlow;
import com.ut.scf.pojo.auto.InterestFlow;
import com.ut.scf.pojo.factor.InterestExt;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.InterestDetailMapper;
import com.ut.scf.dao.auto.InterestMapper;
import com.ut.scf.dao.auto.InvcInfoMapper;
import com.ut.scf.pojo.auto.Interest;
import com.ut.scf.pojo.auto.InterestDetail;
import com.ut.scf.pojo.auto.InvcInfo;
import com.ut.scf.pojo.auto.InvcInfoExample;
import com.ut.scf.pojo.factor.InvoiceExt;
import com.ut.scf.reqbean.factor.CancIntFeeDetailReqBean;
import com.ut.scf.reqbean.factor.CancIntFeeReqBean;
import com.ut.scf.reqbean.factor.InvoiceReqBean;

/**
 * 勾销息费service类
 * 
 * @author zhangyx@starutian.com
 */
@Service("cancIntFeeService")
public class CancIntFeeService {

	@Autowired
	private InterestMapper interestMapper;

	@Autowired
	private InterestDetailMapper interestDetailMapper;

	@Autowired
	private IInterestDao interestDao;

	@Autowired
	private FeeFlowMapper feeFlowMapper;

	@Autowired
	private InterestFlowMapper interestFlowMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public String add(CancIntFeeReqBean reqBean) {
		Interest interest = new Interest();
		DozerMapper.copy(reqBean, interest);
		interest.setRecUid(ScfUUID.generate());
		interestMapper.insert(interest);
		boolean flag = reqBean.getSettlementTp().equals("1");
		for (CancIntFeeDetailReqBean detailBean : reqBean.getInvcsList()) {
			InterestDetail detail = new InterestDetail();
			DozerMapper.copy(detailBean, detail);
			detail.setRecUid(ScfUUID.generate());
			detail.setRelaId(interest.getRecUid());
			detail.setBillSts("已结算");
			detail.setIntPaySts(flag ? null : "应收已收");
			detail.setCostPaySts(flag ? "应收已收" : null);
			interestDetailMapper.insert(detail);
			// 更新利息流水或费用流水
            if (flag) {
                List<FeeFlow> list = interestDao.getFeeBy(detailBean.getCounterPartyId());
                for (FeeFlow flow : list) {
                    flow.setFeePayFlg("1");
                    feeFlowMapper.updateByPrimaryKeySelective(flow);
                }
            } else {
                List<InterestFlow> list = interestDao.getInterestBy(detailBean.getCounterPartyId());
                for (InterestFlow flow : list) {
                    flow.setIntPayFlg("1");
                    interestFlowMapper.updateByPrimaryKeySelective(flow);
                }
            }
		}
		return reqBean.getRecUid();
	}

	/**
	 * 通过付款人名称/组织机构代码 获取交易对手信息、待结算总额、结算类型
	 *
	 * @param params 查询参数
     *                  key: "counterPartyNm" 交易对手名称
     *                  key: "orgnNo" 交易对手组织机构代码
	 * @return 交易信息
	 */
	@Transactional(readOnly = true)
	public List<InterestExt> getCounterPartyList(Map<String, Object> params) {
		return interestDao.getCorpNotSettlement(params);
	}
}
