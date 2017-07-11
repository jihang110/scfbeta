package com.ut.scf.service.pubmanage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.CustRelaMapper;
import com.ut.scf.dao.pubmanage.ICustRelaDao;
import com.ut.scf.pojo.auto.CustRela;
import com.ut.scf.pojo.auto.CustRelaExample;
import com.ut.scf.reqbean.pubmanage.CorpToCust;
import com.ut.scf.reqbean.pubmanage.CustRelaListReqBean;
import com.ut.scf.reqbean.pubmanage.CustRelaReqBean;

/**
 * 关联买卖方service类
 * 
 * @author zhangyx@starutian.com
 */
@Service("custRelaService")
public class CustRelaService {

	@Autowired
	private ICustRelaDao custRelaDao;

	@Autowired
	private CustRelaMapper custRelaMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public String update(CustRelaReqBean corpAddReqBean) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("custId", corpAddReqBean.getCustId());

		// delete
		List<String> idList = custRelaDao.getRelaedCusts(paramMap); // 查询已签约的交易对手(卖方ID)
		CustRelaExample exam = new CustRelaExample();
		CustRelaExample.Criteria crit = exam.createCriteria();
		crit.andCustIdEqualTo(paramMap.get("custId").toString());
		if (idList.size() > 0) {
			crit.andCounterPartyIdNotIn(idList);// 不可删除与其已签约卖方（协议有效）
		}
		custRelaMapper.deleteByExample(exam);

		// insert
		for (CustRelaListReqBean cust : corpAddReqBean.getSellerList()) {
			boolean toInsert = true;
			// 过滤掉已签约的不再插入
			for (String sellerId : idList) {
				if (cust.getCustId().equals(sellerId)) {
					toInsert = false;
					break;
				}
			}
			if (toInsert) {
				CustRela record = new CustRela();
				DozerMapper.copy(corpAddReqBean, record);
				record.setRecUid(ScfUUID.generate());
				record.setCounterPartyId(cust.getCustId());
				custRelaMapper.insert(record);
			}
		}
		return corpAddReqBean.getRecUid();
	}

	@Transactional(readOnly = true)
	public List<CorpToCust> list(Map<String, Object> paramMap) {
		return custRelaDao.getList(paramMap);
	}

	@Transactional(readOnly = true)
	public List<CorpToCust> getCustList(Map<String, Object> paramMap) {
		return custRelaDao.getCustList(paramMap);
	}

	@Transactional(readOnly = true)
	public List<CustRela> getSellerList(Map<String, Object> paramMap) {
		List<CustRela> list = null;
		if (null != paramMap.get("custId")) {
			paramMap.put("custId", paramMap.get("custId"));
			list = custRelaDao.getCountList(paramMap);
		} else {
			list = custRelaDao.getCountList(paramMap);
		}
		return list;
	}
}
