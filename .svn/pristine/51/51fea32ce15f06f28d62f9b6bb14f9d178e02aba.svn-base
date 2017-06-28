package com.ut.scf.service.sys;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.DictMapMapper;
import com.ut.scf.dao.sys.IDictMapDao;
import com.ut.scf.pojo.auto.DictMap;
import com.ut.scf.pojo.auto.DictMapExample;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.PageListRespBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class DictMapService {

	private static final Logger log = LoggerFactory.getLogger(DictMapService.class);

	@Resource
	private IDictMapDao dictMapDao;

	@Resource
	private DictMapMapper dictMapMapper;

	public BaseRespBean deleteDictMap(String id) {
		BaseRespBean respBean = new BaseRespBean();
		int deleteNum = dictMapMapper.deleteByPrimaryKey(id);
		log.debug("delete DictMap num {}", deleteNum);
		if (deleteNum <= 0) {
			respBean.setResult(ErrorCodeEnum.DELETE_FAILED);
			return respBean;
		}
		return respBean;
	}

	/**
	 * 获取所有字典 系统启动
	 * 
	 * @return
	 */
	@Transactional(readOnly = true)
	public List<Map<String, String>> getAllDictMapList() {
		return dictMapDao.getAllDictMapList();
	}

	@Transactional(readOnly = true)
	public List<Map<String, Object>> getDictMapList(Map<String, Object> paramMap) {
		return dictMapDao.getDictMapList(paramMap);
	}

	@Transactional(readOnly = true)
	public List<Map<String, Object>> getDictMapList(Map<String, Object> paramMap, PageInfoBean page) {
		return dictMapDao.getDictMapList(paramMap, page);
	}

	@Transactional(readOnly = true)
	public BaseRespBean getDictMapPageList(DictMapExample dictMapExample, PageInfoBean page) {
		List<DictMap> list = dictMapMapper.selectByExample(dictMapExample, page);
		PageListRespBean respBean = new PageListRespBean();
		respBean.putDataList(list, page);
		return respBean;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean insertDictMap(DictMap record) {
		BaseRespBean respBean = new BaseRespBean();
		record.setId(ScfUUID.generate());
		int insertNum = dictMapMapper.insert(record);
		log.debug("insert DictMap num {}", insertNum);
		if (insertNum <= 0) {
			respBean.setResult(ErrorCodeEnum.ADD_FAILED);
			return respBean;
		}
		return respBean;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean updateDictMap(DictMap record) {
		BaseRespBean respBean = new BaseRespBean();
		int updateNum = dictMapMapper.updateByPrimaryKeySelective(record);
		log.debug("update DictMap num {}", updateNum);
		if (updateNum <= 0) {
			respBean.setResult(ErrorCodeEnum.UPDATE_FAILED);
			return respBean;
		}
		return respBean;
	}

}
