package com.ut.scf.service.pubmanage;

import java.sql.Clob;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.rowset.serial.SerialException;

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
import com.ut.scf.dao.auto.ProductMapper;
import com.ut.scf.pojo.auto.Product;
import com.ut.scf.pojo.auto.ProductExample;
import com.ut.scf.pojo.auto.ProductExample.Criteria;
import com.ut.scf.reqbean.pubmanage.ProductAddReqBean;
import com.ut.scf.reqbean.pubmanage.ProductUpdateReqBean;
import com.ut.scf.respbean.BaseRespBean;

/**
 * 产品定义service. <br>
 * 增删改查的实现方法.
 * <p>
 * Copyright: Copyright (c) 2017年6月14日 下午1:36:13
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * 
 * @author wuk@starutian.com
 * @version 1.0.0
 */
@Service
public class ProductService {

	private static final Logger log = LoggerFactory.getLogger(ProductService.class);

	@Resource
	private ProductMapper productMapper;

	@Transactional(readOnly = true)
	public List<Product> getProductList(Map<String, Object> paramMap, PageInfoBean page) {

		ProductExample productExample = new ProductExample();
		Criteria criteria = productExample.createCriteria();
		criteria.andStatusEqualTo((short)1);
		if(paramMap.get("productNm") != null){
			criteria.andProductNmLike("%"+paramMap.get("productNm")+"%");
		}
		List<Product> list = productMapper.selectByExample(productExample);
		return list;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean addProduct(ProductAddReqBean reqBean) {
		BaseRespBean respBean = new BaseRespBean();
		Map<String, Object> paramMap = BeanUtil.beanToMap(reqBean);
		// 查询产品名称是个否重复
		ProductExample productExample = new ProductExample();
		Criteria criteria = productExample.createCriteria();
		criteria.andProductNmEqualTo(reqBean.getProductNm());
		if (productMapper.countByExample(productExample) > 0) {
			respBean.setResult(ErrorCodeEnum.PRODUCT_NM_EXIST);
			return respBean;
		}

		Product product = new Product();
		BeanUtil.mapToBean(paramMap, product);
		product.setProductSts("1");

		int insertProduct = productMapper.insert(product);
		log.debug("insertProduct : {}", insertProduct);
		if (insertProduct <= 0) {
			throw new BizException(ErrorCodeEnum.ADD_FAILED);
		}

		return respBean;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean updateProduct(ProductUpdateReqBean reqBean) throws SerialException, SQLException {

		BaseRespBean respBean = new BaseRespBean();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("recUid", reqBean.getRecUid());
		paramMap.put("productNm", reqBean.getProductNm());
		paramMap.put("productSts", reqBean.getProductSts());
		paramMap.put("pictureText", reqBean.getPictureText());
		paramMap.put("updateUser", reqBean.getUpdateUser());
		paramMap.put("updateTime", new Date());
		String productDescript = reqBean.getProductDescript();
		Clob clob=new javax.sql.rowset.serial.SerialClob(productDescript.toCharArray());  
		paramMap.put("productDescript", clob);
		
		Product product = new Product();
		BeanUtil.mapToBean(paramMap, product);
		int updateProduct = productMapper.updateByPrimaryKeySelective(product);
		log.debug("update role count {}", updateProduct);
		if (updateProduct <= 0) {
			throw new BizException(ErrorCodeEnum.DELETE_FAILED);
		}
		return respBean;
	}
	
	public Product get(String recUid) {
		Product product = productMapper.selectByPrimaryKey(recUid);
		Product resp = new Product();
		DozerMapper.copy(product, resp);
		return resp;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean deleteProduct(String recUid) {

		BaseRespBean respBean = new BaseRespBean();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("recUid", recUid);
		paramMap.put("status", (short)0);
		Product product = new Product();
		BeanUtil.mapToBean(paramMap, product);
		int updateProduct = productMapper.updateByPrimaryKeySelective(product);
		log.debug("update role count {}", updateProduct);
		if (updateProduct <= 0) {
			throw new BizException(ErrorCodeEnum.DELETE_FAILED);
		}
		return respBean;
	}
}
