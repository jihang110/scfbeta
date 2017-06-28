package com.ut.scf.service.sys;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.SysFuncInterfaceMapper;
import com.ut.scf.dao.sys.ISysFuncInterfaceDao;
import com.ut.scf.pojo.auto.SysFuncInterface;
import com.ut.scf.reqbean.sys.SysFuncInterfaceReqBean;
import com.ut.scf.respbean.sys.SysFuncInterfaceRespBean;

/**
 * 接口表CRUD
 * 
 * @author shenying
 *
 */
@Service
public class SysFuncInterfaceService {

	@Autowired
	private SysFuncInterfaceMapper sysFuncInterfaceMapper;

	@Autowired
	private ISysFuncInterfaceDao sysFuncInterfaceDao;

	/**
	 * 分页查询
	 * 
	 * @param params
	 * @param page
	 * @return
	 */
	@Transactional(readOnly = true)
	public List<SysFuncInterface> getList(Map<String, Object> params, PageInfoBean page) {
		return sysFuncInterfaceDao.getList(params, page);
	}

	@Transactional(readOnly = true)
	public List<SysFuncInterface> getList(Map<String, Object> params) {
		return sysFuncInterfaceDao.getList(params);
	}

	@Transactional(readOnly = true)
	public SysFuncInterfaceRespBean get(String id) {
		SysFuncInterfaceRespBean sfiResultBean = new SysFuncInterfaceRespBean();
		SysFuncInterface sfi = sysFuncInterfaceMapper.selectByPrimaryKey(id);
		DozerMapper.copy(sfi, sfiResultBean);
		return sfiResultBean;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public String add(SysFuncInterfaceReqBean sfiBean) {
		SysFuncInterface sfi = new SysFuncInterface();
		DozerMapper.copy(sfiBean, sfi);
		sfi.setInterfaceId(ScfUUID.generate());
		sfi.setCreateTime(new Date());
		sysFuncInterfaceMapper.insert(sfi);
		return sfi.getInterfaceId();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public String modify(SysFuncInterfaceReqBean sfiBean) {
		SysFuncInterface sfi = new SysFuncInterface();
		DozerMapper.copy(sfiBean, sfi);
		sysFuncInterfaceMapper.updateByPrimaryKeySelective(sfi);
		return sfi.getInterfaceId();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(String id) {
		sysFuncInterfaceMapper.deleteByPrimaryKey(id);
	}

}
