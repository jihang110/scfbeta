package com.ut.scf.service.factor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ut.scf.core.bpm.BpmProcessContext;
import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.core.util.ScfCacheDictUtil;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.InvcBatchMapper;
import com.ut.scf.dao.auto.InvcInfoMapper;
import com.ut.scf.dao.factor.IInvcInfoDao;
import com.ut.scf.pojo.auto.InvcBatch;
import com.ut.scf.pojo.auto.InvcInfo;
import com.ut.scf.reqbean.factor.InvcInfoReqBean;
import com.ut.scf.reqbean.factor.InvcRegReqBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.bpm.impl.BaseBpmProcessServiceImpl;

/**
 *
 */
@Service("invcRegConfigBpmProcessService")
public class InvcRegConfigBpmProcessService extends BaseBpmProcessServiceImpl<InvcRegReqBean> implements BpmProcessService<InvcRegReqBean> {

    private static final String INVC_REGCONFIG_BPM = "FactorInvcRegConfigBpm";

    @Autowired
    private InvcBatchMapper invcBatchMapper;

    @Autowired
    private InvcInfoMapper infoMapper;

    @Autowired
    private IInvcInfoDao invcInfoDao;

    @Override
	protected void doAuditAfter(BpmProcessContext<InvcRegReqBean> context) {
		super.doAuditAfter(context);
		// 流程结束保存正式业务数据
		if (isProcessInstanceEnded(context)) {
			InvcRegReqBean invcRegReqBean = getFormData(context);
			InvcBatch batch = new InvcBatch();
	        DozerMapper.copy(invcRegReqBean, batch);
	        String id = ScfUUID.generate();
	        batch.setRecUid(id);
	        batch.setBatchTp(ScfCacheDictUtil.getDictMapValue("INVC_BATCH_TYPE", "确认"));
	        // 本次确认总金额
	        batch.setInvcConfirmAmt(invcRegReqBean.getInvcConfirmAmt());
	        invcBatchMapper.insertSelective(batch);
	        for (InvcInfoReqBean infoReqBean : invcRegReqBean.getInvcsList()) {
	            InvcInfo info = new InvcInfo();
	            DozerMapper.copy(infoReqBean, info);
	            info.setTransBtcId(id);
	            info.setInvStatus(ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已确认"));
	            
	            infoMapper.updateByPrimaryKeySelective(info);
	        }
		}
	}
    
    @Override
    public String getProcessDefinitionKey() {
        return INVC_REGCONFIG_BPM;
    }
}
