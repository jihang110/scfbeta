package com.ut.scf.service.sys;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.DictTypeMapper;
import com.ut.scf.pojo.auto.DictType;
import com.ut.scf.pojo.auto.DictTypeExample;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.PageRespBean;

@Service
public class DictTypeService {

	private static final Logger log = LoggerFactory.getLogger(DictTypeService.class);

	@Resource
	private DictTypeMapper dictTypeMapper;

	
	public BaseRespBean deleteDictType(String id) {
		BaseRespBean respBean = new BaseRespBean();
		int deleteNum = dictTypeMapper.deleteByPrimaryKey(id);
		log.debug("delete dictType num {}", deleteNum);
		if (deleteNum <= 0) {
			respBean.setResult(ErrorCodeEnum.DELETE_FAILED);
			return respBean;
		}
		return respBean;
	}

	
	@Transactional(readOnly = true)
	public BaseRespBean getDictTypeList(DictTypeExample dictTypeExample, PageInfoBean page) {
		List<DictType> list = dictTypeMapper.selectByExample(dictTypeExample);
		PageRespBean respBean = new PageRespBean();
		respBean.setPages(page.getTotalPage());
		respBean.setRecords(page.getTotalRecord());
		respBean.setDataList(list);
		return respBean;
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean insertDictType(DictType record) {
		BaseRespBean respBean = new BaseRespBean();
		record.setTypeId(ScfUUID.generate());
		int insertNum = dictTypeMapper.insert(record);
		log.debug("insert dictType num {}", insertNum);
		if (insertNum <= 0) {
			respBean.setResult(ErrorCodeEnum.ADD_FAILED);
			return respBean;
		}
		return respBean;
	}

	
	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean updateDictType(DictType record) {
		BaseRespBean respBean = new BaseRespBean();
		int updateNum = dictTypeMapper.updateByPrimaryKeySelective(record);
		log.debug("update dictType num {}", updateNum);
		if (updateNum <= 0) {
			respBean.setResult(ErrorCodeEnum.UPDATE_FAILED);
			return respBean;
		}
		return respBean;
	}

}
