package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.LimitOccupy;
import com.ut.scf.pojo.auto.LimitOccupyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LimitOccupyMapper {
    /**
     *
     * @mbggenerated 2017-06-23
     */
    int countByExample(LimitOccupyExample example);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    int deleteByExample(LimitOccupyExample example);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    int deleteByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    int insert(LimitOccupy record);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    int insertSelective(LimitOccupy record);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    List<LimitOccupy> selectByExample(LimitOccupyExample example);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    LimitOccupy selectByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    int updateByExampleSelective(@Param("record") LimitOccupy record, @Param("example") LimitOccupyExample example);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    int updateByExample(@Param("record") LimitOccupy record, @Param("example") LimitOccupyExample example);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    int updateByPrimaryKeySelective(LimitOccupy record);

    /**
     *
     * @mbggenerated 2017-06-23
     */
    int updateByPrimaryKey(LimitOccupy record);
}