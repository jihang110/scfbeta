package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.CustAc;
import com.ut.scf.pojo.auto.CustAcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustAcMapper {
    /**
     *
     * @mbggenerated 2017-06-16
     */
    int countByExample(CustAcExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int deleteByExample(CustAcExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int deleteByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int insert(CustAc record);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int insertSelective(CustAc record);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    List<CustAc> selectByExample(CustAcExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    CustAc selectByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int updateByExampleSelective(@Param("record") CustAc record, @Param("example") CustAcExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int updateByExample(@Param("record") CustAc record, @Param("example") CustAcExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int updateByPrimaryKeySelective(CustAc record);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int updateByPrimaryKey(CustAc record);
}