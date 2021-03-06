$("#sel-corp-corpType").EBRichInput("onChange", function(value) {
			fn_corp_form.showLmtAmt(value);
		});

(initWorkFlowPage = function (postfix) {

	var value = $.EB('#sel-corp-corpType', postfix).EBRichInput('getValue');

    if (value === 'BUYER') {
        $.EB('#txt-corp-lmtAmt', postfix).EBRichInput('show');
        if ($.EB("#hid-corp-corpId", postfix).val()){
            $.EB('#txt-corp-lmtAmt', postfix).EBRichInput('lock');
        }
    } else {
        $.EB('#txt-corp-lmtAmt', postfix).EBRichInput('hide');
    }

})(false);

var fn_corp_form = {
	showLmtAmt : function(value) {
		if (value == 'BUYER') {
			$('#txt-corp-lmtAmt').EBRichInput('show');
			if ($("#hid-corp-corpId").val()){
				$('#txt-corp-lmtAmt').EBRichInput('lock');
			}
		} else {
			$('#txt-corp-lmtAmt').EBRichInput('hide');
		}
	},
	doEditAcctForm : function(acctId, rowIndex) {
		if (acctId) {
			var client = new eb.Client({
						url : eb.settings.SERVER_CONTEXT_PATH + '/pub/corp/acctUsed?acctId=' + acctId,
						requestData : {}
					}).ifSuccess(function(response) {
						if (response.data.used == '1') {
							alert('此账号已有协议在使用，不允许编辑！');
						} else {
							eb.app.openItemForm(rowIndex, 'corpAcctDetailForm', 'dg-corp-acctList');
						}
					}).send();
		} else {
			eb.app.openItemForm(rowIndex, 'corpAcctDetailForm', 'dg-corp-acctList');
		}
	},
	doDeleteAcct : function(acctId, rowIndex) {
		if (acctId) {
			var client = new eb.Client({
						url : eb.settings.SERVER_CONTEXT_PATH + '/pub/corp/acctUsed?acctId=' + acctId,
						requestData : {}
					}).ifSuccess(function(response) {
						if (response.data.used == '1') {
							alert('此账号已有协议在使用，不允许删除！');
						} else {
							$('#dg-corp-acctList').EBDataGrid('delData', {
										index : rowIndex
									})
						}
					}).send();
		} else {
			$('#dg-corp-acctList').EBDataGrid('delData', {
						index : rowIndex
					})
		}
	}
}

//fn_corp_form.showLmtAmt($("#sel-corp-corpType").EBRichInput('getValue'));

