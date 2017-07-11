package com.ut.scf.service.bpm;

import com.ut.scf.sys.bpm.TrxSerialNumRule;

/**
 * 流程交易流水号创建服务
 * 
 * @author shenying
 *
 */
public interface BpmTrxSerialNumService {

	public static final String DefaultSerialNum = "DefaultSerialNum";

	String createTrxSerialNum(TrxSerialNumRule rule);
}
