package com.ut.scf.service.factor;

import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.InvcBatchMapper;
import com.ut.scf.dao.auto.InvcInfoMapper;
import com.ut.scf.dao.factor.IInvcInfoDao;
import com.ut.scf.pojo.auto.InvcBatch;
import com.ut.scf.pojo.auto.InvcInfo;
import com.ut.scf.pojo.auto.InvcInfoExample;
import com.ut.scf.reqbean.factor.InvcInfoReqBean;
import com.ut.scf.reqbean.factor.InvcRegReqBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 发票登记service类
 * 
 * @author zhangyx@starutian.com
 */
@Service("invcRegService")
public class InvcRegService {

	@Autowired
	private InvcBatchMapper invcBatchMapper;

	@Autowired
    private IInvcInfoDao invcRegDao;

	@Autowired
	private InvcInfoMapper invcInfoMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public String add(InvcRegReqBean reqBean) {
		InvcBatch invcBatch = new InvcBatch();
		DozerMapper.copy(reqBean, invcBatch);
		invcBatch.setRecUid(ScfUUID.generate());
		invcBatchMapper.insert(invcBatch);
		for (InvcInfoReqBean invc : reqBean.getInvcsList()) {
            InvcInfoExample example = new InvcInfoExample();
            example.createCriteria().andStatusEqualTo((short) 1).andInvcNoEqualTo(invc.getInvcNo());
			if (invcInfoMapper.countByExample(example) < 1) {
				InvcInfo invcInfo = new InvcInfo();
				DozerMapper.copy(invc, invcInfo);
				invcInfo.setRecUid(ScfUUID.generate());
				invcInfo.setRegBtcId(invcBatch.getRecUid());
				invcInfo.setCntNo(reqBean.getCntNo());
				invcInfo.setInvStatus("1");
				invcInfoMapper.insert(invcInfo);
			}
		}
		return reqBean.getRecUid();
	}

	@Transactional(readOnly = true)
	public List<Map<String, Object>> list(Map<String, Object> paramMap) {
		List<Map<String, Object>> List = invcRegDao.getList(paramMap);
		return List;
	}

}
