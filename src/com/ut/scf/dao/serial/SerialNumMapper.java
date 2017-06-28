package com.ut.scf.dao.serial;

import com.ut.scf.pojo.serial.SerialNum;
import com.ut.scf.pojo.serial.SerialNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SerialNumMapper {
    /**
     *
     * @mbggenerated 2017-06-26
     */
    int countByExample(SerialNumExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int deleteByExample(SerialNumExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int deleteByPrimaryKey(String serialId);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int insert(SerialNum record);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int insertSelective(SerialNum record);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    List<SerialNum> selectByExample(SerialNumExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    SerialNum selectByPrimaryKey(String serialId);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByExampleSelective(@Param("record") SerialNum record, @Param("example") SerialNumExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByExample(@Param("record") SerialNum record, @Param("example") SerialNumExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByPrimaryKeySelective(SerialNum record);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByPrimaryKey(SerialNum record);
}