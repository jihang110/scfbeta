package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.PaymentDetail;
import com.ut.scf.pojo.auto.PaymentDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentDetailMapper {
    /**
     *
     * @mbggenerated 2017-06-16
     */
    int countByExample(PaymentDetailExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int deleteByExample(PaymentDetailExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int deleteByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int insert(PaymentDetail record);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int insertSelective(PaymentDetail record);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    List<PaymentDetail> selectByExample(PaymentDetailExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    PaymentDetail selectByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int updateByExampleSelective(@Param("record") PaymentDetail record, @Param("example") PaymentDetailExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int updateByExample(@Param("record") PaymentDetail record, @Param("example") PaymentDetailExample example);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int updateByPrimaryKeySelective(PaymentDetail record);

    /**
     *
     * @mbggenerated 2017-06-16
     */
    int updateByPrimaryKey(PaymentDetail record);
}