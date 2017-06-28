eb.log.debug('Custom \'payment.js\' script loaded!');
var _Math = eb.utils.math;

$("#cntNo").EBRichInput("onChange", function (value) {

    var client = new eb.Client({
	        url: eb.settings.SERVER_CONTEXT_PATH + '/factor/payment/invoice',
	        requestData: {
	        		"cntNo": value,
	        		"invStatus":"3"
	        	}
        })
        .ifSuccess(function (response) {
        	var invAmt = 0;
        	var invAmts= 0;
            $('#invcsList').EBDataGrid('setData', {items: response.data.dataList});
            $.each(response.data.dataList,function(i,v){ 
            	 invAmt = v.invAmt;
            	 invAmts = _Math.floatAdd(invAmts, invAmt);
            }); 
            $('#unpaidPayableAmt').EBRichInput('setValue', {
    			value: invAmts
    		});
            
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
	var invAmt = 0;
	var invAmts= 0;
	 $.each(rows,function(i,v){ 
	    invAmts = _Math.floatAdd(invAmt, row.invAmt);
    }); 
	$('#ttlPmtAmt').EBRichInput('setValue', {
		value: invAmts
	});
});
// 取消全选
$('#invcsList').EBDataGrid('onUncheckAll', function (rows) {
	$('#ttlPmtAmt').EBRichInput('setValue', {
		value: null
	});
});