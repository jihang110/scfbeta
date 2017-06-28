package com.ut.scf.pojo.factor;

import java.math.BigDecimal;

public class InterestExt {
    /**
     * 付款企业名称
     */
    private String payerNm;

    /**
     * 付款企业ID
     */
    private String payerId;

    /**
     * 组织机构代号
     */
    private String orgNo;

    /**
     * 结算金额
     */
    private BigDecimal settlementTotalAmt;

    /**
     * 结算类型
     */
    private String settlementTp;

    public String getPayerNm() {
        return payerNm;
    }

    public void setPayerNm(String payerNm) {
        this.payerNm = payerNm;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public BigDecimal getSettlementTotalAmt() {
        return settlementTotalAmt;
    }

    public void setSettlementTotalAmt(BigDecimal settlementTotalAmt) {
        this.settlementTotalAmt = settlementTotalAmt;
    }

    public String getSettlementTp() {
        return settlementTp;
    }

    public void setSettlementTp(String settlementTp) {
        this.settlementTp = settlementTp;
    }
}
