package com.ut.scf.service.pubmanage;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.ProductDistributionMapper;
import com.ut.scf.dao.factor.IProductDisDao;
import com.ut.scf.pojo.auto.ProductDistribution;
import com.ut.scf.reqbean.pubmanage.ProductDistributionBean;
import com.ut.scf.reqbean.pubmanage.ProductDistributionReqBean;

@Service
public class ProductDistributionService {

	@Autowired
	private ProductDistributionMapper productDistributionMapper;
	@Autowired
	private IProductDisDao productDisDao;

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void add(ProductDistributionReqBean reqbean) {
		List<ProductDistributionBean> prdDistList = reqbean.getPrdDistList();
		for (ProductDistributionBean pdbean : prdDistList) {
			ProductDistribution pd = new ProductDistribution();
			DozerMapper.copy(pdbean, pd);
			pd.setRecUid(ScfUUID.generate());
			pd.setCustId(reqbean.getCorpId());
			pd.setReleLmtAmt(reqbean.getReleLmtAmt());
			productDistributionMapper.insert(pd);
		}
	}
	
	@Transactional(readOnly = true)
	public List<Map<String, Object>> getList(Map<String, Object> params) {
//		ProductDistributionExample example = new ProductDistributionExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andStatusEqualTo((short)1);
//		
//		List<ProductDistribution> list = productDistributionMapper.selectByExample(example);
		List<Map<String, Object>> list = productDisDao.getProdustDisList(params);
		return list;
	}
}
