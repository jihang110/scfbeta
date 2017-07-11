package com.ut.scf.service.factor;

import com.ut.scf.dao.auto.CntrctMapper;
import com.ut.scf.dao.factor.IInvcConfirmDao;
import com.ut.scf.pojo.auto.Cntrct;
import com.ut.scf.pojo.auto.CntrctExample;
import com.ut.scf.pojo.factor.InvoiceExt;
import com.ut.scf.reqbean.factor.InvcConfirmReqBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ut.scf.core.util.DozerMapper;
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
import com.ut.scf.sys.bpm.BpmProcessContext;
import com.ut.scf.sys.util.ScfCacheDictUtil;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Service("invcConfirmBpmProcessService")
public class InvcConfirmBpmProcessService extends BaseBpmProcessServiceImpl<InvcConfirmReqBean> implements BpmProcessService<InvcConfirmReqBean> {

    private static final String INVC_REGCONFIG_BPM = "FactorInvcRegConfigBpm";

    @Autowired
    private InvcBatchMapper invcBatchMapper;

    @Autowired
    private InvcInfoMapper infoMapper;

    @Autowired
    private IInvcConfirmDao invcConfirmDao;

	@Autowired
	private CntrctMapper cntrctMapper;

    @Override
	protected void doAuditAfter(BpmProcessContext<InvcConfirmReqBean> context) {
		super.doAuditAfter(context);
		// 流程结束保存正式业务数据
		if (isProcessInstanceEnded(context)) {
			InvcConfirmReqBean reqBean = getFormData(context);
			InvcBatch batch = new InvcBatch();
			DozerMapper.copy(reqBean, batch);
	        String id = ScfUUID.generate();
	        batch.setRecUid(id);
	        batch.setBatchTp(ScfCacheDictUtil.getDictMapValue("INVC_BATCH_TYPE", "确认"));
	        // 本次确认总金额
	        batch.setInvcConfirmAmt(reqBean.getInvcConfirmAmt());
	        invcBatchMapper.insertSelective(batch);
	        for (InvcInfoReqBean infoReqBean : reqBean.getInvcsList()) {
	            InvcInfo info = new InvcInfo();
	            DozerMapper.copy(infoReqBean, info);
	            info.setCnfBtcId(id);
	            info.setCntrctNo(null);// 合同号不变
	            info.setCntNo(null);// 协议编号不变
	            info.setInvStatus(ScfCacheDictUtil.getDictMapValue("INVC_STATUS", "已确认"));
	            
	            infoMapper.updateByPrimaryKeySelective(info);
	        }
		}
	}
    
    @Override
    public String getProcessDefinitionKey() {
        return INVC_REGCONFIG_BPM;
    }

	/**
	 * 通过交易对手名称/组织机构代码等查询参数
	 * 获取交易对手信息、协议编号/id、产品名称、发票金额等
	 *
	 * @param params 查询参数
	 *                 key: "counterPartyNm" 交易对手名称
	 *                 key: "orgnNo" 交易对手组织机构代码
	 *                 key: "invStatus" 发票状态
	 *                 key: "invStatusMore" 发票状态List<String>
	 * @return 交易信息
	 */
	@Transactional(readOnly = true)
	public List<InvoiceExt> getCounterPartyList(Map<String, Object> params) {
		return invcConfirmDao.getCounterPartyList(params);
	}
}
