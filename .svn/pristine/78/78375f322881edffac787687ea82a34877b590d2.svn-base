package com.ut.scf.service.sys;

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
import com.ut.scf.core.dict.ScfBizConsts;
import com.ut.scf.core.dict.ScfCacheDict;
import com.ut.scf.core.exception.BizException;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.core.util.ScfSerialNum;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.CorpDeptMapper;
import com.ut.scf.dao.auto.CorpInfoMapper;
import com.ut.scf.dao.sys.ICorpDao;
import com.ut.scf.dao.sys.IDeptDao;
import com.ut.scf.pojo.auto.CorpDeptExample;
import com.ut.scf.pojo.auto.CorpInfo;
import com.ut.scf.pojo.auto.CorpInfoExample;
import com.ut.scf.pojo.auto.CorpInfoExample.Criteria;
import com.ut.scf.reqbean.sys.CorpAddReqBean;
import com.ut.scf.reqbean.sys.CorpDeleteReqBean;
import com.ut.scf.reqbean.sys.CorpUpdateReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.sys.CorpAddRespBean;

/**
 * 企业相关service类
 * 
 * @author zyx
 */
@Service
public class CorpService {

	private static final Logger log = LoggerFactory.getLogger(CorpService.class);

	@Resource
	private ICorpDao corpDao;

	@Resource
	private CorpDeptMapper corpDeptMapper;

	@Resource
	private CorpInfoMapper corpInfoMapper;

	@Resource
	private IDeptDao deptDao;

	@Transactional(propagation = Propagation.REQUIRED)
	public CorpAddRespBean addCorpInfo(CorpAddReqBean corpAddReqBean) {
		CorpAddRespBean respBean = new CorpAddRespBean();

		Map<String, Object> paramMap = BeanUtil.beanToMap(corpAddReqBean);

		// 企业名称不能重复。
		CorpInfoExample corpInfoExample = new CorpInfoExample();
		Criteria criteria = corpInfoExample.createCriteria();
		criteria.andStatusEqualTo((short) 1);
		criteria.andCorpNameEqualTo((String) paramMap.get("corpName"));
		if (paramMap.get("corpId") != null) {
			criteria.andCorpIdEqualTo((String) paramMap.get("corpId"));
		}
		if (paramMap.get("sysType") != null) {
			criteria.andSysTypeEqualTo((String) paramMap.get("sysType"));
		}
		if (corpInfoMapper.countByExample(corpInfoExample) > 0) {
			respBean.setResult(ErrorCodeEnum.CORP_NAME_EXIST);
			return respBean;
		}
		// 机构组织代码不能重复
		CorpInfoExample corpInfoExample2 = new CorpInfoExample();
		Criteria criteria2 = corpInfoExample2.createCriteria();
		criteria2.andStatusEqualTo((short) 1);
		//criteria2.andOrgnNumEqualTo((String) paramMap.get("orgnNum"));
		if (paramMap.get("corpId") != null) {
			criteria2.andCorpIdEqualTo((String) paramMap.get("corpId"));
		}
		if (corpInfoMapper.countByExample(corpInfoExample2) > 0) {
			respBean.setResult(ErrorCodeEnum.ORGN_NUM_EXIST);
			return respBean;
		}

		// 生成主键Id
		CorpInfo corpInfo = new CorpInfo();
		BeanUtil.BeanToBean(corpInfo, corpAddReqBean);
		String corpId = ScfUUID.generate();
		corpInfo.setCorpId(corpId);
		//corpInfo.setAppNum(ScfSerialNum.generate(ScfBizConsts.REG_SUPPLIER_ID_PREFIX));

		int insertNum = corpInfoMapper.insert(corpInfo);

		log.debug("insert corpInfo num {}", insertNum);
		if (insertNum < 1) {
			throw new BizException(ErrorCodeEnum.ADD_FAILED);
		}

		respBean.setCorpId(corpId);
		return respBean;
	}

	public List<Map<String, Object>> corpList(Map<String, Object> paramMap) {
		List<Map<String, Object>> list = corpDao.getCorpInfoList(paramMap);
		log.debug("corp list : {}", list);
		return list;
	}

	public List<Map<String, Object>> corpList(Map<String, Object> paramMap, PageInfoBean page) {
		List<Map<String, Object>> list = corpDao.getCorpInfoList(paramMap, page);
		log.debug("corp list : {}", list);
		log.debug("corp list page : {}", page);
		return list;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean deleteCorp(CorpDeleteReqBean reqBean) {
		BaseRespBean respBean = new BaseRespBean();

		String corpId = reqBean.getCorpId();
		// 有子部门，企业是不能删除的。
		CorpDeptExample corpDeptExample = new CorpDeptExample();
		com.ut.scf.pojo.auto.CorpDeptExample.Criteria cri = corpDeptExample.createCriteria();
		cri.andStatusEqualTo((short) 1);
		cri.andCorpIdEqualTo(corpId);
		if (corpDeptMapper.countByExample(corpDeptExample) > 0) {
			respBean.setResult(ErrorCodeEnum.HAS_SUB_DEPT);
			return respBean;
		}
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		paramMap.put("status", ScfBizConsts.STATUS_DELETE);
		CorpInfo corpInfo = new CorpInfo();
		BeanUtil.BeanToBean(reqBean, corpInfo);
		int updateNum = corpInfoMapper.updateByPrimaryKeySelective(corpInfo);
		log.debug("delete corpInfo num {}", updateNum);
		if (updateNum <= 0) {
			respBean.setResult(ErrorCodeEnum.DELETE_FAILED);
			return respBean;
		}
		if (updateNum > 0 && null != ScfCacheDict.relaCorpIdMap.get(corpId) && ScfCacheDict.relaCorpIdMap.get(corpId) != "") {
			ScfCacheDict.relaCorpIdMap.remove(corpId);
		}
		return respBean;
	}

	@Transactional(readOnly = true)
	public List<Map<String, String>> getAllRelaCorp() {
		return corpDao.selectAllRelaCorp();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public CorpAddRespBean updateCorp(CorpUpdateReqBean reqBean) {
		CorpAddRespBean respBean = new CorpAddRespBean();
		// 企业名称不能重复。
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		CorpInfoExample corpInfoExample = new CorpInfoExample();
		Criteria criteria = corpInfoExample.createCriteria();
		criteria.andStatusEqualTo((short) 1);
		criteria.andCorpNameEqualTo((String) paramMap.get("corpName"));
		if (paramMap.get("corpId") != null) {
			criteria.andCorpIdEqualTo((String) paramMap.get("corpId"));
		}
		if (paramMap.get("sysType") != null) {
			criteria.andSysTypeEqualTo((String) paramMap.get("sysType"));
		}
		if (corpInfoMapper.countByExample(corpInfoExample) > 0) {
			respBean.setResult(ErrorCodeEnum.CORP_NAME_EXIST);
			return respBean;
		}
		// 机构组织代码不能重复
		CorpInfoExample corpInfoExample2 = new CorpInfoExample();
		Criteria criteria2 = corpInfoExample2.createCriteria();
		criteria2.andStatusEqualTo((short) 1);
		//criteria2.andOrgnNumEqualTo((String) paramMap.get("orgnNum"));
		if (paramMap.get("corpId") != null) {
			criteria2.andCorpIdEqualTo((String) paramMap.get("corpId"));
		}
		if (corpInfoMapper.countByExample(corpInfoExample2) > 0) {
			respBean.setResult(ErrorCodeEnum.ORGN_NUM_EXIST);
			return respBean;
		}

		CorpInfo corpInfo = new CorpInfo();
		BeanUtil.BeanToBean(reqBean, corpInfo);
		int updateNum = corpInfoMapper.updateByPrimaryKeySelective(corpInfo);

		log.debug("update corpInfo num {}", updateNum);
		if (updateNum <= 0) {
			respBean.setResult(ErrorCodeEnum.UPDATE_FAILED);
			return respBean;
		}
		respBean.setCorpId(corpInfo.getCorpId());
		return respBean;
	}

}
