package com.ut.scf.service.factor;

import com.ut.scf.dao.auto.InvcInfoMapper;
import com.ut.scf.dao.factor.IInvcInfoDao;
import com.ut.scf.pojo.auto.InvcInfo;
import com.ut.scf.pojo.auto.InvcInfoExample;
import com.ut.scf.pojo.factor.InvoiceExt;
import com.ut.scf.reqbean.factor.InvoiceReqBean;
import com.ut.scf.respbean.factor.CancIntFeeDetailRespBean;
import com.ut.scf.respbean.factor.InvcInfoRespBean;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class InvcInfoService {

	@Autowired
	private IInvcInfoDao invcInfoDao;

	@Autowired
	private InvcInfoMapper invcInfoMapper;

	/**
	 * 通过合同编号等查询参数
	 * 获取发票编号、合同号、到期日等发票信息
	 *
	 * @param bean 查询参数
	 *                 key: "cntrctNo" 合同编号
	 *                 key: "invStatus" 发票状态
	 *                 key: "invStatusList" 发票状态List<String>
	 * @return 发票信息
	 */
	@Transactional(readOnly = true)
	public List<InvcInfo> getList(InvoiceReqBean bean) {
		InvcInfoExample example = new InvcInfoExample();
		InvcInfoExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(bean.getCntrctNo()))
			criteria.andCntrctNoEqualTo(bean.getCntrctNo());
		if (StringUtils.isNotBlank(bean.getInvStatus()))
			criteria.andInvStatusEqualTo(bean.getInvStatus());
		if (CollectionUtils.isNotEmpty(bean.getInvStatusList()))
			criteria.andInvStatusIn(bean.getInvStatusList());
		return invcInfoMapper.selectByExample(example);
	}

	/**
	 * 通过交易对手名称/组织机构代码等查询参数
	 * 获取交易对手信息、协议编号/id、产品名称、发票金额等
	 *
	 * @param params 查询参数
	 *                 key: "counterPartyNm" 交易对手名称
	 *                 key: "orgnNo" 交易对手组织机构代码
	 *                 key: "invStatus" 发票状态
	 *                 key: "invStatusMore" 发票状态List<String>
	 * @return 交易信息
	 */
	@Transactional(readOnly = true)
	public List<InvoiceExt> getCounterPartyList(Map<String, Object> params) {
		return invcInfoDao.getCounterPartyList(params);
	}

	// 按协议和发票状态查询发票列表
	@Transactional(readOnly = true)
	public List<InvcInfoRespBean> getInvcListBy(String cntId, String invStatus) {
		return invcInfoDao.getInvcListBy(cntId, invStatus);
	}

    /**
     * 根据企业ID和发票状态查询发票列表
     * @param corpId 企业ID
     * @param type 结算类型
     * @param invStatus 发票状态
     * @return 发票列表
     */
	@Transactional(readOnly = true)
	public List<CancIntFeeDetailRespBean> getInvcListByCorpId(String corpId, String type, String invStatus) {
		return invcInfoDao.getInvcListByCorpId(corpId, type, invStatus);
	}
}
