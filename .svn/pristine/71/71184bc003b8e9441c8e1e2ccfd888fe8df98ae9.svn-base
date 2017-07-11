eb.log.debug('Custom \'paymentAudit.js\' script loaded!');
var _Math = eb.utils.math;

var cntNo = $('#cntNo').EBRichInput('getValue');
if (cntNo && eb.app.cache.currentWorkflow.formConfig.editable) {
    var client = new eb.Client({
        url: eb.settings.SERVER_CONTEXT_PATH + '/factor/payment/invoice',
        requestData: {'cntNo': cntNo}
    }).ifSuccess(function (response) {
        $('#ttlPmtAmt').EBRichInput('setValue', {value: 0});
        var selectList = $('#invcsList').EBDataGrid('getData');
        $('#invcsList').EBDataGrid('setData', {items: response.data.dataList});
        var sum = 0;
        $.each(response.data.dataList, function (index, row) {
            sum = _Math.floatAdd(sum, row.invAmt);
            for (var i = 0; i < selectList.length; i++) {
                var item = selectList[i];
                if (row.recUid === item.recUid) {
                    $('#invcsList').EBDataGrid('check', {'index': index});
                }
            }
        });
        $('#ttlPmtAmt').EBRichInput('setValue', {value: sum});
    }).send();
}

$("#cntNo").EBRichInput("onChange", function (value) {

    var client = new eb.Client({
	        url: eb.settings.SERVER_CONTEXT_PATH + '/factor/payment/invoice',
	        requestData: {
	        		"cntNo": value
	        	}
        })
        .ifSuccess(function (response) {
        	$('#ttlPmtAmt').EBRichInput('setValue', {value: null});
            $('#invcsList').EBDataGrid('setData', {items: response.data.dataList});
        })
        .send();

});
//单击选中发票
$('#invcsList').EBDataGrid('onCheck', function (row, index) {
    var ttlPmtAmt = $('#ttlPmtAmt').EBRichInput("getValue");
    if(ttlPmtAmt == null || ttlPmtAmt == ""){
    	ttlPmtAmt = 0;
    }
    var invcAmt = _Math.floatAdd(ttlPmtAmt, row.invAmt);
    $('#ttlPmtAmt').EBRichInput('setValue', {
		value: invcAmt
	});
    row.pmtAmt = row.invAmt;
    $('#invcsList').EBDataGrid('updateItem', {index: index, item: row});
});
// 单击取消发票
$('#invcsList').EBDataGrid('onUncheck', function (row, index) {
    var ttlPmtAmt = $('#ttlPmtAmt').EBRichInput("getValue");
    var invcAmt = _Math.floatSub(ttlPmtAmt, row.invAmt);
    if(invcAmt==0){
    	invcAmt = null;
    }
    $('#ttlPmtAmt').EBRichInput('setValue', {
		value: invcAmt
	});
    row.pmtAmt = 0;
    $('#invcsList').EBDataGrid('updateItem', {index: index, item: row});
});

// 全选发票
$('#invcsList').EBDataGrid('onCheckAll', function (rows) {
	var invAmts= 0;
	$.each(rows, function (index, row) {
        row.pmtAmt = row.invAmt;
        invAmts = _Math.floatAdd(invAmts, row.invAmt);
    });
	$('#ttlPmtAmt').EBRichInput('setValue', {value: invAmts});
	$('#invcsList').EBDataGrid('setData', {items: rows});
});
// 取消全选
$('#invcsList').EBDataGrid('onUncheckAll', function (rows) {
	$.each(rows, function (index, row) {
        row.pmtAmt = 0;
    });
	$('#invcsList').EBDataGrid('setData', {items: rows});
	$('#ttlPmtAmt').EBRichInput('setValue', {
		value: null
	});
});