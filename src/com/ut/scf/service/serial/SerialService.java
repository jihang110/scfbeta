package com.ut.scf.service.serial;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.exception.BizException;
import com.ut.scf.dao.serial.SelectTable;
import com.ut.scf.dao.serial.SerialNumMapper;
import com.ut.scf.pojo.serial.SerialNum;
import com.ut.scf.pojo.serial.SerialNumExample;
import com.ut.scf.pojo.serial.SerialNumExample.Criteria;
import com.ut.scf.pojo.serial.UserTables;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.PageListRespBean;

@Service("serialService")
public class SerialService {

	private static final Logger log = LoggerFactory.getLogger(SerialService.class);

	@Resource
	private DataSource oracle;

	@Resource
	private SelectTable selectTable;

	@Resource
	private SerialNumMapper serialNumMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean addSerial(Map<String, Object> paramMap) {

		BaseRespBean respBean = new BaseRespBean();

		SerialNum serialNum = new SerialNum();
		String serialNm = (String) paramMap.get("serialNm");
		serialNum.setSerialNm(serialNm);
		serialNum.setStatus("1");
		serialNum.setCreateTime((Date)paramMap.get("createTime"));
		serialNum.setCreateUser((String)paramMap.get("createUser"));
		serialNum.setModOne((String)paramMap.get("modOne"));
		serialNum.setModTwo((String)paramMap.get("modTwo"));
		serialNum.setSeparator((String)paramMap.get("separator"));
		serialNum.setSerialRule((String)paramMap.get("serialRule"));

		SerialNumExample serialNumExample = new SerialNumExample();
		Criteria criteria = serialNumExample.createCriteria();
		criteria.andStatusEqualTo("1");
		criteria.andSerialNmEqualTo(serialNm);

		Connection connection = null;
		Statement stmt = null;
		try {
			connection = oracle.getConnection();
			stmt = connection.createStatement();

			if (serialNumMapper.countByExample(serialNumExample) > 0) {
				respBean.setResult(ErrorCodeEnum.SERIAL_NUM_EXIST);
				return respBean;
			}

			int insertSerialNum = serialNumMapper.insert(serialNum);
			log.debug("insertSerialNum : {}", insertSerialNum);
			if (insertSerialNum <= 0) {
				throw new BizException(ErrorCodeEnum.ADD_FAILED);
			}
			// 创建sequence,sequence名为：表名+'_SEQ'
			String sql_seq = "CREATE SEQUENCE " + paramMap.get("serialNm") + "_SEQ" + " INCREMENT BY 1 -- 每次加几个 " + "  START WITH 1 -- 从1开始计数 "
			        + " NOMAXvalue -- 不设置最大值" + " NOCYCLE -- 一直累加，不循环 " + " CACHE 10";

			stmt.executeUpdate(sql_seq);

		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			try {
				if (stmt != null) {
					connection.close();
				}
			}
			catch (SQLException se) {
			}
			try {
				if (connection != null) {
					connection.close();
				}
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return respBean;
	}

	@Transactional(readOnly = true)
	public List<UserTables> getAllTable(Map<String, Object> paramMap) {
		return selectTable.getAllTable(paramMap);
	}

	@Transactional(readOnly = true)
	public BaseRespBean getSerialList(Map<String, Object> paramMap, PageInfoBean page) {

		SerialNumExample serialNumExample = new SerialNumExample();
		Criteria criteria = serialNumExample.createCriteria();
		criteria.andStatusEqualTo("1");
		if (paramMap.get("serialId") != null && paramMap.get("serialId") != "") {
			criteria.andSerialNmLike("CONCAT(CONCAT('%', " + paramMap.get("serialId") + "),'%')");
		}

		List<SerialNum> list = serialNumMapper.selectByExample(serialNumExample);
		
		PageListRespBean pageListBean = new PageListRespBean();
		pageListBean.putDataList(list, page);
		return pageListBean;

	}
	
	public String setSerial(String serialNm,String org) {

		SerialNumExample serialNumExample = new SerialNumExample();
		Criteria criteria = serialNumExample.createCriteria();
		criteria.andSerialNmEqualTo(serialNm);

		List<SerialNum> list = serialNumMapper.selectByExample(serialNumExample);
		if(list == null){
			throw new BizException(ErrorCodeEnum.SERIAL_NOT_EXIST);
		}
		SerialNum  serialNum  = new SerialNum();
		String serialRule = "";
		String modOne = "";
		String modTwo = "";
		Date dt=new Date();
	    SimpleDateFormat matter=new SimpleDateFormat("yyyyMMdd");
	    String date = matter.format(dt);
		for(int i=0;i<list.size();i++)    {   
			serialNum  =  list.get(i);  
			modOne = serialNum.getModOne();
			modTwo = serialNum.getModTwo();
			serialRule = serialNum.getSerialRule();
		}   
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
	        connection = oracle.getConnection();
	        stmt = connection.createStatement();
	        String sql = "select "+serialNm+"_SEQ"+".nextval"+" from dual";
	        rs = stmt.executeQuery(sql);
	        int nextval = 0;
	        String ref = "";
	        while(rs.next()){
	        	nextval = rs.getInt("NEXTVAL");
	        }
	        if(nextval < 10){
	        	ref =  "000"+nextval;
	        }else if(nextval < 100 && nextval > 9){
	        	ref =  "00"+nextval;
	        }else if(nextval < 1000 && nextval > 99){
	        	ref =  "0"+nextval;
	        }else if(nextval > 999){
	        	ref = nextval+"";
	        }
	        if(serialRule != null || serialRule != ""){
	        	if(serialRule.indexOf("$ORG$") != -1){
	        		serialRule = serialRule.replace("$ORG$", org);
	        	}
	        	if(serialRule.indexOf("$TRX$") != -1){
	        		serialRule = serialRule.replace("$TRX$", modTwo);
	        	}
	        	if(serialRule.indexOf("$MOD$") != -1){
	        		serialRule = serialRule.replace("$MOD$", modOne);
	        	}
	        	if(serialRule.indexOf("$YYYYMMDD$") != -1){
	        		serialRule = serialRule.replace("$YYYYMMDD$", date);
	        	}
	        	if(serialRule.indexOf("[####]") != -1){
	        		serialRule = serialRule.replace("[####]", ref);
	        	}
			}
        }
        catch (SQLException e) {
	        e.printStackTrace();
        }finally {
			try {
				if (stmt != null) {
					connection.close();
				}
			}
			catch (SQLException se) {
			}
			try {
				if (connection != null) {
					connection.close();
				}
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			}	
			catch (SQLException se) {
					se.printStackTrace();
			}
		}
		
		return serialRule;

	}

}
