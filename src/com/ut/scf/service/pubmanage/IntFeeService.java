package com.ut.scf.service.pubmanage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.exception.BizException;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.dao.auto.IntFeeMapper;
import com.ut.scf.dao.pubmanage.IIntFeeDao;
import com.ut.scf.pojo.auto.IntFee;
import com.ut.scf.pojo.auto.IntFeeExample;
import com.ut.scf.pojo.auto.IntFeeExample.Criteria;
import com.ut.scf.reqbean.pubmanage.IntFeeAddReqBean;
import com.ut.scf.reqbean.pubmanage.IntFeeReqBean;
import com.ut.scf.reqbean.pubmanage.IntFeeUpdateReqBean;
import com.ut.scf.respbean.BaseRespBean;


/**
 * 息费管理service. <br>
 * 增删改查的实现方法.
 * <p>
 * Copyright: Copyright (c) 2017年6月14日 下午7:37:11
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
@Service
public class IntFeeService {

	private static final Logger log = LoggerFactory.getLogger(IntFeeService.class);

	@Resource
	private IntFeeMapper intFeeMapper;
	
	@Resource
	private IIntFeeDao iIntFeeDao;

	@Transactional(readOnly = true)
	public List<IntFeeReqBean> getIntFeeList(Map<String, Object> paramMap, PageInfoBean page) {

		List<IntFeeReqBean> list = iIntFeeDao.getList(paramMap);
		return list;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean addIntFee(IntFeeAddReqBean reqBean) {
		BaseRespBean respBean = new BaseRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);

		IntFee IntFee = new IntFee();
		BeanUtil.mapToBean(paramMap, IntFee);
		IntFeeExample example = new IntFeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andProductIdEqualTo((String)paramMap.get("productId"));
		int selectIntByProduct = intFeeMapper.countByExample(example);
		if (selectIntByProduct > 0) {
			respBean.setResult(ErrorCodeEnum.INTFEE_OF_PRODUCT_EXIST);
			return respBean;
		}
		int insertIntFee = intFeeMapper.insert(IntFee);
		log.debug("insertIntFee : {}", insertIntFee);
		if (insertIntFee <= 0) {
			throw new BizException(ErrorCodeEnum.ADD_FAILED);
		}

		return respBean;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean updateIntFee(IntFeeUpdateReqBean reqBean) {

		BaseRespBean respBean = new BaseRespBean();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("recUid", reqBean.getRecUid());
		paramMap.put("productId", reqBean.getProductId());
		paramMap.put("deductIntWay", reqBean.getDeductFeeWay());
		paramMap.put("chargeDay", reqBean.getChargeDay());
		paramMap.put("intRate", reqBean.getIntRate());
		paramMap.put("deductFeeWay", reqBean.getDeductFeeWay());
		paramMap.put("feeRate", reqBean.getFeeRate());
		
		IntFee IntFee = new IntFee();
		BeanUtil.mapToBean(paramMap, IntFee);
		int updateIntFee = intFeeMapper.updateByPrimaryKeySelective(IntFee);
		log.debug("update role count {}", updateIntFee);
		if (updateIntFee <= 0) {
			throw new BizException(ErrorCodeEnum.DELETE_FAILED);
		}
		return respBean;
	}
	
	public IntFeeReqBean get(String recUid) {
		IntFeeReqBean intFee = iIntFeeDao.getListById(recUid);
		IntFeeReqBean resp = new IntFeeReqBean();
		DozerMapper.copy(intFee, resp);
		return resp;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean deleteIntFee(String recUid) {

		BaseRespBean respBean = new BaseRespBean();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("recUid", recUid);
		paramMap.put("status", (short)0);
		IntFee IntFee = new IntFee();
		BeanUtil.mapToBean(paramMap, IntFee);
		int updateIntFee = intFeeMapper.updateByPrimaryKeySelective(IntFee);
		log.debug("update role count {}", updateIntFee);
		if (updateIntFee <= 0) {
			throw new BizException(ErrorCodeEnum.DELETE_FAILED);
		}
		return respBean;
	}
}
