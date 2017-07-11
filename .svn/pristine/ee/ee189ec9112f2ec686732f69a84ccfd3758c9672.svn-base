package com.ut.scf.service.bpm.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ut.scf.service.bpm.BpmTrxSerialNumService;
import com.ut.scf.service.serial.SerialService;
import com.ut.scf.sys.bpm.TrxSerialNumRule;

@Service
public class BpmTrxSerialNumServiceImpl implements BpmTrxSerialNumService {

	@Autowired
	private SerialService serialService;

	@Override
	public String createTrxSerialNum(TrxSerialNumRule rule) {
		return serialService.setSerial(rule.getRuleFlag());
	}

}
