$("#dg-prdtdist-prdDistList").EBDataGrid("onChange", function() {
			var items = $("#dg-prdtdist-prdDistList").EBDataGrid('getData');
			var sum = 0;
			$.each(items, function(index, itm) {
						sum += parseFloat(itm.productLmt);
					});
			var bal = parseFloat($('#txt-prdtdist-lmtAmt').EBRichInput('getValue')) - sum;
			console.log("bal" + bal);
			$('#txt-prdtdist-releLmtAmt').EBRichInput('setValue', {
						value : bal
					});

		});

$("#lkp-prdtdist-corpName").EBRichInput("onChange", function(value) {
			var url = eb.settings.SERVER_CONTEXT_PATH + '/pub/prdtdist/list';
			var corpId = $('#hid-prdtdist-corpId').val();
			var client = new eb.Client({
						url : url,
						requestData : {
							"custId" : corpId
						}
					}).ifSuccess(function(response) {
						fn_prdtdist_form.setReleLmtAmtVal();
						$("#dg-prdtdist-prdDistList").EBDataGrid("setData", {
									items : response.data.dataList
								});
					}).send();
		});

var fn_prdtdist_form = {
	setReleLmtAmtVal : function() {
		var avlAmt = $('#txt-prdtdist-lmtAmt').EBRichInput('getValue');
		$('#txt-prdtdist-releLmtAmt').EBRichInput('setValue', {
					value : avlAmt
				});
	},
	doEdit : function(productId, index) {
		if (productId) {
			var client = new eb.Client({
						url : eb.settings.SERVER_CONTEXT_PATH + '/pub/prdtdist/prdtUsed?productId=' + productId,
						requestData : {}
					}).ifSuccess(function(response) {
						if (response.data.used == '1') {
							alert('此产品已有协议在使用，不允许编辑！');
						} else {
							eb.app.openItemForm(index, 'prdtdistDetailForm', 'dg-prdtdist-prdDistList');
						}
					}).send();
		} else {
			eb.app.openItemForm(index, 'prdtdistDetailForm', 'dg-prdtdist-prdDistList');
		}
	},
	doDel : function(productId, index) {
		if (productId) {
			var client = new eb.Client({
						url : eb.settings.SERVER_CONTEXT_PATH + '/pub/prdtdist/prdtUsed?productId=' + productId,
						requestData : {}
					}).ifSuccess(function(response) {
						if (response.data.used == '1') {
							alert('此产品已有协议在使用，不允许删除！');
						} else {
							$('#dg-prdtdist-prdDistList').EBDataGrid('delData', {
										index : index
									});
						}
					}).send();
		} else {
			$('#dg-prdtdist-prdDistList').EBDataGrid('delData', {
						index : index
					});
		}
	}

}
