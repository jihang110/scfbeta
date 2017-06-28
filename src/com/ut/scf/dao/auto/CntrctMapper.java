package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.Cntrct;
import com.ut.scf.pojo.auto.CntrctExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CntrctMapper {
    /**
     *
     * @mbggenerated 2017-06-21
     */
    int countByExample(CntrctExample example);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int deleteByExample(CntrctExample example);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int deleteByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int insert(Cntrct record);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int insertSelective(Cntrct record);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    List<Cntrct> selectByExampleWithBLOBs(CntrctExample example);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    List<Cntrct> selectByExample(CntrctExample example);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    Cntrct selectByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int updateByExampleSelective(@Param("record") Cntrct record, @Param("example") CntrctExample example);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int updateByExampleWithBLOBs(@Param("record") Cntrct record, @Param("example") CntrctExample example);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int updateByExample(@Param("record") Cntrct record, @Param("example") CntrctExample example);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int updateByPrimaryKeySelective(Cntrct record);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int updateByPrimaryKeyWithBLOBs(Cntrct record);

    /**
     *
     * @mbggenerated 2017-06-21
     */
    int updateByPrimaryKey(Cntrct record);
}