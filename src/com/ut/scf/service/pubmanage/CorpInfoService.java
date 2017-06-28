package com.ut.scf.service.pubmanage;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.CorpInfoMapper;
import com.ut.scf.dao.auto.CustAcMapper;
import com.ut.scf.dao.auto.LimitsMapper;
import com.ut.scf.dao.factor.ICntrctDao;
import com.ut.scf.dao.pubmanage.ICorpInfoDao;
import com.ut.scf.pojo.auto.CorpInfo;
import com.ut.scf.pojo.auto.CorpInfoExample;
import com.ut.scf.pojo.auto.CustAc;
import com.ut.scf.pojo.auto.CustAcExample;
import com.ut.scf.pojo.auto.Limits;
import com.ut.scf.reqbean.pubmanage.CorpInfoReqBean;
import com.ut.scf.reqbean.pubmanage.CorpToCust;
import com.ut.scf.reqbean.pubmanage.CustAcBean;

/**
 * 客户管理
 * 
 * @author shenying
 *
 */
@Service("corpInfoService")
public class CorpInfoService {

	@Autowired
	private CorpInfoMapper corpInfoMapper;

	@Autowired
	private ICorpInfoDao corpInfoDao;

	@Autowired
	private CustAcMapper custAcMapper;

	@Autowired
	private LimitsMapper limitsMapper;

	@Autowired
	private ICntrctDao cntrctDao;

	@Transactional(readOnly = true)
	public List<CorpInfo> getList(Map<String, Object> params, PageInfoBean page) {
		return corpInfoDao.getList(params, page);
	}

	@Transactional(readOnly = true)
	public List<CorpInfo> getList(Map<String, Object> params) {
		return corpInfoDao.getList(params);
	}

	@Transactional(readOnly = true)
	public List<CorpToCust> getCustList(Map<String, Object> params, PageInfoBean page) {
		return corpInfoDao.getCustList(params, page);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public String add(CorpInfoReqBean corpInfoReqBean) {
		CorpInfo corp = new CorpInfo();
		DozerMapper.copy(corpInfoReqBean, corp);
		corp.setCorpId(ScfUUID.generate());
		corpInfoMapper.insert(corp);

		saveAcctList(corp, corpInfoReqBean.getAcctList());

		// 保存客户授信额度
		Limits limit = new Limits();
		limit.setRecUid(ScfUUID.generate());
		limit.setCorpId(corp.getCorpId());
		limit.setLmtTp("1");// 额度类型：1.授信额度
		limit.setLmtSts("0");// 额度状态：0.有效
		limit.setLmtUsingTp("0");// 额度使用类型：0.循环额度
		limit.setLmtAmt(corp.getLmtAmt());
		limitsMapper.insert(limit);
		return corp.getCorpId();
	}

	private void saveAcctList(CorpInfo corp, List<CustAcBean> acctList) {
		for (CustAcBean acct : acctList) {
			CustAc ac = new CustAc();
			DozerMapper.copy(acct, ac);
			ac.setCustId(corp.getCorpId());
			ac.setRecUid(ScfUUID.generate());
			custAcMapper.insert(ac);
		}
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public String update(CorpInfoReqBean corpInfoReqBean) {
		CorpInfo corp = new CorpInfo();
		DozerMapper.copy(corpInfoReqBean, corp);
		corpInfoMapper.updateByPrimaryKeySelective(corp);

		// 先删后插
		CustAcExample exam = new CustAcExample();
		CustAcExample.Criteria crit = exam.createCriteria();
		crit.andCustIdEqualTo(corp.getCorpId());
		custAcMapper.deleteByExample(exam);

		saveAcctList(corp, corpInfoReqBean.getAcctList());
		return corp.getCorpId();
	}

	public void delete(String corpId) {
		corpInfoMapper.deleteByPrimaryKey(corpId);
	}

	@Transactional(readOnly = true)
	public CorpInfoReqBean get(String corpId) {
		CorpInfo corp = corpInfoMapper.selectByPrimaryKey(corpId);
		CorpInfoReqBean resp = new CorpInfoReqBean();
		DozerMapper.copy(corp, resp);

		List<CustAcBean> acctList = Lists.newArrayList();
		CustAcExample exam = new CustAcExample();
		CustAcExample.Criteria crit = exam.createCriteria();
		crit.andCustIdEqualTo(corp.getCorpId());
		List<CustAc> acList = custAcMapper.selectByExample(exam);
		for (CustAc ac : acList) {
			CustAcBean acBean = new CustAcBean();
			DozerMapper.copy(ac, acBean);
			acctList.add(acBean);
		}
		resp.setAcctList(acctList);
		return resp;
	}

	@Transactional(readOnly = true)
	public int countByCorpName(CorpInfoReqBean ciBean) {
		CorpInfoExample exam = new CorpInfoExample();
		com.ut.scf.pojo.auto.CorpInfoExample.Criteria crit = exam.createCriteria();
		crit.andCorpNameEqualTo(ciBean.getCorpName());
		return corpInfoMapper.countByExample(exam);
	}

	@Transactional(readOnly = true)
	public int countAcctIdUsed(String acctId) {
		return cntrctDao.countAcctIdUsed(acctId);
	}
}
