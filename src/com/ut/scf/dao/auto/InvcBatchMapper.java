package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.InvcBatch;
import com.ut.scf.pojo.auto.InvcBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvcBatchMapper {
    /**
     *
     * @mbggenerated 2017-06-15
     */
    int countByExample(InvcBatchExample example);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    int deleteByExample(InvcBatchExample example);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    int deleteByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    int insert(InvcBatch record);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    int insertSelective(InvcBatch record);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    List<InvcBatch> selectByExample(InvcBatchExample example);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    InvcBatch selectByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    int updateByExampleSelective(@Param("record") InvcBatch record, @Param("example") InvcBatchExample example);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    int updateByExample(@Param("record") InvcBatch record, @Param("example") InvcBatchExample example);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    int updateByPrimaryKeySelective(InvcBatch record);

    /**
     *
     * @mbggenerated 2017-06-15
     */
    int updateByPrimaryKey(InvcBatch record);
}