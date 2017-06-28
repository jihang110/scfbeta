// 应用页面路由定义
eb.app.Router.add({
    'developing': {url: 'demo/developing.html'},

    // 流程待办列表
    'workflowTodoList': {title: '流程待办列表', cfg: 'business/sys/cfg/workflowTodoList.json'},
    'workflowCommentForm': {title: '审批意见', url: 'business/sys/workflowCommentForm.html'},

    // 流程审批界面（路由名称约定：workflowTodoList-流程定义key）
    'workflowTodoList-PubCorpinfoBpm': {title: '客户信息申请', cfg: 'business/pub/corp/cfg/corpAudit.json', url: '/pub/corp/bpm/showAndClaim'},
    'workflowTodoList-PubCntrctBpm': {title: '买方协议信息申请', cfg: 'business/pub/cntrct/cfg/buyerCntrctAudit.json', url: '/pub/buyercntrct/bpm/showAndClaim'},
    'workflowTodoList-PubSellerCntrctBpm': {title: '卖方协议信息申请', cfg: 'business/pub/cntrct/cfg/sellerCntrctAudit.json', url: '/pub/sellercntrct/bpm/showAndClaim'},
    'workflowTodoList-PubProductDistributionBpm': {title: '产品分配申请', cfg: 'business/pub/prdtdist/cfg/prdtdistAudit.json', url: '/pub/prdtdist/bpm/showAndClaim'},
    'workflowTodoList-PubCustRelaBpm': {title: '关联买卖方申请', cfg: 'business/pub/custRela/cfg/custRelaAudit.json', url: '/pub/custRela/bpm/showAndClaim'},
    'workflowTodoList-FactorLoanBpm': {title: '融资申请', cfg: 'business/factor/loan/cfg/loanAudit.json', url: '/factor/loan/bpm/showAndClaim'},
    'workflowTodoList-FactorInvcRegBpm': {title: '发票登记', cfg: 'business/factor/invcReg/cfg/invcRegAudit.json', url: '/factor/invcReg/bpm/showAndClaim'},
    'workflowTodoList-FactorInvcRegConfigBpm': {title: '发票登记确认', cfg: 'business/factor/invRegConfig/cfg/invRegConfigAudit.json', url: '/factor/invRegConfig/bpm/showAndClaim'},
    'workflowTodoList-FactorInvcTransBpm': {title: '发票转让', cfg: 'business/factor/invTrans/cfg/invTransAudit.json', url: '/factor/invTrans/bpm/showAndClaim'},
    'workflowTodoList-FactorPaymentBpm': {title: '付款申请', cfg: 'business/factor/payment/cfg/paymentAudit.json', url: '/factor/payment/bpm/showAndClaim'},
    'workflowTodoList-FactorCancIntBpm': {title: '勾销息费', cfg: 'business/factor/cancIntFee/cfg/cancIntFeeAudit.json', url: '/factor/cancIntFee/bpm/showAndClaim'},
    
    // 系统配置 - 系统接口管理
    'interfaceList': {title: '系统接口管理', cfg: 'business/sys/cfg/interfaceList.json'},
    'interfaceList-add': {title: '新增', cfg: 'business/sys/cfg/interfaceForm.json'},
    'interfaceList-edit': {title: '编辑', cfg: 'business/sys/cfg/interfaceForm.json', 'url': '/interface/get'},

    // 公共管理 - 客户管理
    'corpList': {title: '客户管理', cfg: 'business/pub/corp/cfg/corpList.json'},
    'corpList-add': {title: '新增', cfg: 'business/pub/corp/cfg/corpForm.json'},
    'corpList-edit': {title: '编辑', cfg: 'business/pub/corp/cfg/corpForm.json', 'url': '/pub/corp/get'},
    'corpAcctDetailForm': {title: '新增', cfg: 'business/pub/corp/cfg/acctForm.json'},
    'corpLookupList': {title: '查找客户', cfg: 'business/pub/corp/cfg/corpLookupList.json'},
    'corpCustList': {title: '客户管理', cfg: 'business/pub/corp/cfg/corpCustList.json'},

 
    // 公共管理 - 产品定义
    'productList': {title: '产品定义', cfg: 'business/pub/product/cfg/productList.json'},
    'productList-add': {title: '新增', cfg: 'business/pub/product/cfg/productForm.json'},
    'productList-edit': {title: '编辑', cfg: 'business/pub/product/cfg/productEdit.json', 'url': '/pub/product/get'},
    'productLookupList': {title: '产品定义', cfg: 'business/pub/product/cfg/productLookupList.json'},
 
    // 公共管理 - 息费管理
    'intfeeList': {title: '息费管理', cfg: 'business/pub/intfee/cfg/intfeeList.json'},
    'intfeeList-add': {title: '配置', cfg: 'business/pub/intfee/cfg/intfeeForm.json'},
    'intfeeList-edit': {title: '修改', cfg: 'business/pub/intfee/cfg/intfeeEdit.json', 'url': '/pub/intfee/get'},

     // 公共管理 - 产品分配
    'prdtdistForm': {title: '产品分配', cfg: 'business/pub/prdtdist/cfg/prdtdistForm.json'},
    'prdtdistDetailForm': {title: '新增', cfg: 'business/pub/prdtdist/cfg/prdtForm.json'},
    
    // 公共管理 - 关联买卖方
    'custRelaForm': {title: '关联买卖方', cfg: 'business/pub/custRela/cfg/custRelaForm.json'},
    'custRelaBuyerDetailForm': {title: '获取买方信息', cfg: 'business/pub/custRela/cfg/buyerForm.json'},
    'custRelaSellerDetailForm': {title: '获取卖方信息', cfg: 'business/pub/custRela/cfg/sellerForm.json'},
    
    // 应收类 - 发票登记
    'invcRegForm': {title: '发票登记', cfg: 'business/factor/invcReg/cfg/invcRegForm.json'},
    'invcRegCustForm': {title: '获取交易对手信息', cfg: 'business/factor/invcReg/cfg/counterPartyForm.json'},
    'invcRegAddForm': {title: '新增', cfg: 'business/factor/invcReg/cfg/invcRegAddForm.json'},
    
    
    // 应收类 - 签约
    'buyerCntrctList': {title: '录入', cfg: 'business/pub/cntrct/cfg/buyerCntrctForm.json'},
    'buyerCntrctList-edit': {title: '推荐', cfg: 'business/pub/cntrct/cfg/recommForm.json'},
    'prdtdistList': {title: '查询产品', cfg: 'business/pub/cntrct/cfg/prdtdistList.json'},
    'custAcPayList': {title: '查询付款账号', cfg: 'business/factor/custac/cfg/custAcPayList.json'},
    'custAcReceList': {title: '查询回款账号', cfg: 'business/factor/custac/cfg/custAcReceList.json'},
    'custAcIouList': {title: '查询放款账号', cfg: 'business/factor/custac/cfg/custAcIouList.json'},
    'custAcIntDeductList': {title: '查询利息扣收账号', cfg: 'business/factor/custac/cfg/custAcIntDeductList.json'},
    'custAcFeeDeductList': {title: '查询费用扣收账号', cfg: 'business/factor/custac/cfg/custAcFeeDeductList.json'},
    'sellerCntrctList': {title: '卖方协议录入', cfg: 'business/pub/cntrct/cfg/sellerCntrctList.json'},
    'sellerCntrctList-edit': {title: '签约', cfg: 'business/pub/cntrct/cfg/sellerCntrctForm.json','url': '/pub/sellercntrct/get'},

    // 应收类 - 发票确认
    'invRegConfigForm': {title: '发票确认', cfg: 'business/factor/invRegConfig/cfg/invRegConfigForm.json'},
    'counterPartyList': {title: '获取交易对手信息', cfg: 'business/factor/invRegConfig/cfg/counterPartyList.json'},
  
    // 应收类 - 发票转让
    'invTransForm': {title: '发票转让', cfg: 'business/factor/invTrans/cfg/invTransForm.json'},
    'counterPartyLookupList': {title: '获取交易对手信息', cfg: 'business/factor/invTrans/cfg/counterPartyForm.json'},

    //应收类 - 融资申请
    'loanForm': {title: '融资申请', cfg: 'business/factor/loan/cfg/loanForm.json'},
    'sellerCntLookupList': {title: '卖方协议', cfg: 'business/factor/loan/cfg/sellerCntLookupList.json'},

    // 应收类 - 付款申请
    'paymentForm': {title: '付款申请', cfg: 'business/factor/payment/cfg/paymentForm.json'},
    'paymentCustForm': {title: '获取交易对手信息', cfg: 'business/factor/payment/cfg/counterPartyForm.json'},
    'paymentAddForm': {title: '新增', cfg: 'business/factor/payment/cfg/paymentAddForm.json'},
 
    // 应收类 - 勾销息费
    'cancIntFeeForm': {title: '勾销息费', cfg: 'business/factor/cancIntFee/cfg/cancIntFeeForm.json'},
    'cancIntFeeCustForm': {title: '获取交易对手信息', cfg: 'business/factor/cancIntFee/cfg/counterPartyForm.json'},
    
    'deptList': {title: '机构管理',url: 'business/sys/deptManagement.html'},

    'roleManager': {title: '角色管理',cfg: 'business/sys/cfg/roleManager.json'},
    'roleManager-add': {title: '新增',cfg: 'business/sys/cfg/roleManager-add.json'},
    'roleManager-mod': {title: '编辑',cfg: 'business/sys/cfg/roleManager-mod.json','url': '/role/get'},

    'userManager': {title: '用户管理',cfg: 'business/sys/cfg/userManager.json'},
    'userManager-add': {title: '新增',cfg: 'business/sys/cfg/userManager-add.json'},
    'userManager-edit': {title: '编辑',cfg: 'business/sys/cfg/userManager-mod.json','url': '/user/get'},

    'pwdManager': {title: '密码维护',cfg: 'business/sys/cfg/pwdManager.json'},

    'sysMenuManager': {title: '菜单管理',url: 'business/sys/menuManagement.html'},
    'sysMenuManager-add': {title: '新增菜单',cfg: 'business/sys/cfg/sysMenuManager-add.json'},
    'sysMenuManager-edit': {title: '修改菜单',cfg: 'business/sys/cfg/sysMenuManager-mod.json','url': '/menu/list'},

    'logManager': {title: '系统监控',cfg: 'business/sys/cfg/logManager.json'},

    'serialNm': {title: '序列号管理',cfg: 'business/sys/cfg/serialNm.json'},
    'getAllTableList': {title: '查询所有表',cfg: 'business/sys/cfg/tableNm.json'},
    'serialNm-add': {title: '新增序列号',cfg: 'business/sys/cfg/serialNm-form.json'},

    'demo-form-edit': {url: '/rest/demo/form-data', cfg: 'demo/form'},
    'demo-datagrid': {cfg: 'demo/datagrid'},

    'demo-custom-page': {url: 'demo/customPage.html'}
});