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
import com.ut.scf.dao.auto.UserCommonWebsiteMapper;
import com.ut.scf.dao.sys.ICommonWebDao;
import com.ut.scf.pojo.auto.UserCommonWebsite;
import com.ut.scf.reqbean.sys.UserCommonWebsiteReqBean;

/**
 * @author zhangyx
 */
@Service
public class CommonWebService {

	@Autowired
	private ICommonWebDao commonWebDao;

	@Autowired
	private UserCommonWebsiteMapper userCommonWebsiteMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public String add(UserCommonWebsiteReqBean reqBean) {
		UserCommonWebsite ucws = new UserCommonWebsite();
		DozerMapper.copy(reqBean, ucws);
		ucws.setRecUid(ScfUUID.generate());
		ucws.setCreateTime(new Date());
		userCommonWebsiteMapper.insert(ucws);
		return ucws.getRecUid();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(String recUid) {
		userCommonWebsiteMapper.deleteByPrimaryKey(recUid);
	}

	@Transactional(readOnly = true)
	public List<UserCommonWebsite> getList(Map<String, Object> paramMap) {
		return commonWebDao.selectCommonWebList(paramMap);
	}

	@Transactional(readOnly = true)
	public List<UserCommonWebsite> getList(Map<String, Object> paramMap, PageInfoBean page) {
		return commonWebDao.selectCommonWebList(paramMap, page);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public String update(UserCommonWebsiteReqBean reqBean) {
		UserCommonWebsite ucws = new UserCommonWebsite();
		DozerMapper.copy(reqBean, ucws);
		userCommonWebsiteMapper.updateByPrimaryKey(ucws);
		return ucws.getRecUid();
	}

}
