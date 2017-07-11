package com.ut.scf.sys.bpm;

/**
 * 交易流水号生成规则
 * 
 * @author shenying
 *
 */
public class TrxSerialNumRule {

	// 生成规则标记
	private String ruleFlag;

	public TrxSerialNumRule() {
		super();
	}

	public TrxSerialNumRule(String ruleFlag) {
		super();
		this.ruleFlag = ruleFlag;
	}

	public String getRuleFlag() {
		return ruleFlag;
	}

	public void setRuleFlag(String ruleFlag) {
		this.ruleFlag = ruleFlag;
	}

}
