package com.ut.scf.service.pubmanage;

import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ut.scf.reqbean.pubmanage.ProductDistributionReqBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.bpm.impl.BaseBpmProcessServiceImpl;
import com.ut.scf.sys.bpm.BpmProcessContext;

@Service("productDistributionBpmProcessService")
public class ProductDistributionBpmProcessService extends BaseBpmProcessServiceImpl<ProductDistributionReqBean>
		implements BpmProcessService<ProductDistributionReqBean> {

	private static final String PRODUCTDISTRIBUTION_BPM = "PubProductDistributionBpm";

	@Autowired
	private ProductDistributionService productDistributionService;

	@Override
	public String getProcessDefinitionKey() {
		return PRODUCTDISTRIBUTION_BPM;
	}

	@Override
	protected void doAuditAfter(BpmProcessContext<ProductDistributionReqBean> context) {
		super.doAuditAfter(context);
		// TODO 流程结束保存正式业务数据
		if (context.isProcessEnd()) {
			ProductDistributionReqBean reqbean = getFormData(context);
			productDistributionService.add(reqbean);
		}
	}

	@Override
	protected String getProcessInstanceName(ProcessDefinition processDefinition, ProcessInstance processInstance,
			ProductDistributionReqBean formData) {
		return "客户" + formData.getCorpName() + "的" + processDefinition.getName();
	}

}
