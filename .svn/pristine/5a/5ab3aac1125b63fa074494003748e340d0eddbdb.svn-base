package com.ut.scf.dao.factor;

import com.ut.scf.pojo.auto.Fee;
import com.ut.scf.pojo.auto.FeeFlow;
import com.ut.scf.pojo.auto.InterestFlow;
import com.ut.scf.pojo.auto.Interests;
import com.ut.scf.pojo.factor.InterestExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IInterestDao {
    /**
     * 根据参数查询付款企业的未结算信息
     *
     * @param paramMap 查询条件
     *            key: "counterPartyNm" 企业名称
     *            key: "orgnNo" 企业组织机构代码
     * @return 付款企业的未结算信息
     */
    List<InterestExt> getCorpNotSettlement(Map<String, Object> paramMap);

    /**
     * 根据企业ID查询利息流水
     * @param corpId 企业ID
     * @return 利息流水
     */
    List<InterestFlow> getInterestBy(@Param("corpId") String corpId);

    /**
     * 根据企业ID查询费用流水
     * @param corpId 企业ID
     * @return 费用流水
     */
    List<FeeFlow> getFeeBy(@Param("corpId") String corpId);
}
