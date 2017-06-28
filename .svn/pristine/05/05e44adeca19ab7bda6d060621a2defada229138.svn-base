package com.ut.scf.service.factor;

import com.ut.scf.core.bpm.BpmProcessContext;
import com.ut.scf.core.util.DozerMapper;
import com.ut.scf.core.util.ScfCacheDictUtil;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.auto.InvcBatchMapper;
import com.ut.scf.dao.auto.InvcInfoMapper;
import com.ut.scf.pojo.auto.InvcBatch;
import com.ut.scf.pojo.auto.InvcInfo;
import com.ut.scf.reqbean.factor.InvcInfoReqBean;
import com.ut.scf.reqbean.factor.InvcTransferReqBean;
import com.ut.scf.service.bpm.BpmProcessService;
import com.ut.scf.service.bpm.impl.BaseBpmProcessServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service("invcTransferService")
public class InvcTransferBpmProcessService extends BaseBpmProcessServiceImpl<InvcTransferReqBean> implements BpmProcessService<InvcTransferReqBean> {

    private static final String INVC_TRANSFER_BPM = "FactorInvcTransBpm";

    @Autowired
    private InvcBatchMapper batchMapper;

    @Autowired
    private InvcInfoMapper infoMapper;

    @Override
    public String getProcessDefinitionKey() {
        return INVC_TRANSFER_BPM;
    }

    @Override
    protected void doAuditAfter(BpmProcessContext<InvcTransferReqBean> context) {
        super.doAuditAfter(context);
        if (isProcessInstanceEnded(context)) {
            InvcTransferReqBean reqBean = getFormData(context);
            InvcBatch batch = new InvcBatch();
            DozerMapper.copy(reqBean, batch);
            String id = ScfUUID.generate();
            batch.setRecUid(id);
            batch.setBatchTp(ScfCacheDictUtil.getDictMapValue("INVC_BATCH_TYPE", "转让"));
            // 可转让总金额
            batch.setInvcTransTotalAmt(reqBean.getSumInvAmt());
            batchMapper.insertSelective(batch);
            for (InvcInfoReqBean infoReqBean : reqBean.getInvList()) {
                InvcInfo info = new InvcInfo();
                DozerMapper.copy(infoReqBean, info);
                info.setTransBtcId(id);
                info.setInvStatus(ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已确认已转让"));
                if (StringUtils.isNotBlank(reqBean.getIsCharge()) && "1".equals(reqBean.getIsCharge())) {
                    info.setIsCharge(ScfCacheDictUtil.getDictMapValue("CHARGE", "已收费"));
                }
                // TODO insert 费用表
                infoMapper.updateByPrimaryKeySelective(info);
            }
        }
    }
}
