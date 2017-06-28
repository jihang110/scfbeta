eb.log.debug('Custom \'invRegConfig.js\' script loaded!');

$('#cntNo').EBRichInput('onChange', function (value) {

    var client = new eb.Client({
        url: eb.settings.SERVER_CONTEXT_PATH + '/factor/invRegConfig/invoice',
        requestData: {'cntrctNo': value}
    })
    .ifSuccess(function (response) {
    	var invAmt = 0;
    	var invAmts= 0;
        $('#invcsList').EBDataGrid('setData', {items: response.data.dataList});
        $.each(response.data.dataList,function(i,v){ 
        	 invAmt = v.invAmt;
        	 invAmts += invAmt;
        }); 
        $('#invcTotalAmt').EBRichInput('setValue', {
			value: invAmts
		});
    })
    .send();

});
// 单击选中发票
$('#invcsList').EBDataGrid('onCheck', function (row, index) {
    console.log(row, index);
    var invcConfirmAmt = $('#invcConfirmAmt').EBRichInput("getValue");
    if(invcConfirmAmt == null || invcConfirmAmt == ""){
    	invcConfirmAmt = 0;
    }
    var invcAmt = parseInt(invcConfirmAmt) + row.invAmt;
    $('#invcConfirmAmt').EBRichInput('setValue', {
		value: invcAmt
	});
    $('#invcsList').EBDataGrid('updateItem', {index: index, item: row});
});
// 单击取消发票
$('#invcsList').EBDataGrid('onUncheck', function (row, index) {
    console.log(row, index);
    var invcConfirmAmt = $('#invcConfirmAmt').EBRichInput("getValue");
    var invcAmt = invcConfirmAmt - row.invAmt;
    if(invcAmt==0){
    	invcAmt = null;
    }
    $('#invcConfirmAmt').EBRichInput('setValue', {
		value: invcAmt
	});
    $('#invcsList').EBDataGrid('updateItem', {index: index, item: row});
});
// 全选发票
$('#invcsList').EBDataGrid('onCheckAll', function (rows) {
	var invAmt = 0;
	var invAmts= 0;
	var invcConfirmAmt = 0;
	 $.each(rows,function(i,v){ 
		invAmt = v.invAmt;
	    invAmts += invAmt;
    }); 
	$('#invcConfirmAmt').EBRichInput('setValue', {
		value: invAmts
	});
});
// 取消全选
$('#invcsList').EBDataGrid('onUncheckAll', function (rows) {
	$('#invcConfirmAmt').EBRichInput('setValue', {
		value: null
	});
});