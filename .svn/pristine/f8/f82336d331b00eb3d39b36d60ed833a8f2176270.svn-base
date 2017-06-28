package com.ut.scf.service.pubmanage;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.dao.auto.LimitsMapper;
import com.ut.scf.dao.factor.ILimitsDao;
import com.ut.scf.pojo.auto.Limits;
import com.ut.scf.pojo.auto.LimitsExample;

@Service
public class LimitService {

	@Autowired
	private LimitsMapper limitsMapper;

	@Autowired
	private ILimitsDao limitsDao;

	public List<Limits> getParentLimitBy(String lmtId) {
		return limitsDao.getParentLimitBy(lmtId);
	}

	public Limits getLimitBy(String corpId, String cntId, String lmtType) {
		LimitsExample exam = new LimitsExample();
		LimitsExample.Criteria ctri = exam.createCriteria();
		ctri.andCorpIdEqualTo(corpId);
		ctri.andCntIdEqualTo(cntId);
		ctri.andLmtTpEqualTo(lmtType);// 额度类型：1.授信额度2.产品额度3.关联额度
		ctri.andLmtStsEqualTo("0");// 额度状态：0.有效
		List<Limits> lmtList = limitsMapper.selectByExample(exam);
		return CollectionUtils.isNotEmpty(lmtList) ? lmtList.get(0) : null;
	}

	/**
	 * 按关联额度记录ID把占用状态从预占用更新到已占用，逐级向上更新产品额度和授信额度的占用状态
	 * 
	 * @param lmtId
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateToOccpyStatus(String lmtId) {
		//状态:0预占用->1占用
		limitsDao.updateOccStsByAssLmt(lmtId, "0", "1");
	}
}
