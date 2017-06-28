eb.log.debug('Custom \'cancIntFee.js\' script loaded!');
var _Math = eb.utils.math;

$('#settlementTp').EBRichInput("onChange", function (value) {
    var corpId = $('#payerId').val();
    var client = new eb.Client({
        url: eb.settings.SERVER_CONTEXT_PATH + '/factor/cancIntFee/invoice',
        requestData: {
            "corpId": corpId,
            "settlementTp": value
        }
    }).ifSuccess(function (response) {
        $('#invcsList').EBDataGrid('setData', {items: response.data.dataList});
    }).send();
});
// 单击选中发票
$('#invcsList').EBDataGrid('onCheck', function (row, index) {
    var sum = $('#settlementAmt').EBRichInput('getValue') || 0;
    sum = _Math.floatAdd(sum, row.settlementAmt);
    $('#settlementAmt').EBRichInput('setValue', {value: sum});
});
// 单击取消发票
$('#invcsList').EBDataGrid('onUncheck', function (row, index) {
    var sum = $('#settlementAmt').EBRichInput('getValue') || 0;
    sum = _Math.floatSub(sum, row.settlementAmt);
    $('#settlementAmt').EBRichInput('setValue', {value: sum});
});
// 全选发票
$('#invcsList').EBDataGrid('onCheckAll', function (rows) {
    var sum = 0;
    $.each(rows, function (index, row) {
        sum = _Math.floatAdd(sum, row.settlementAmt);
    });
    $('#settlementAmt').EBRichInput('setValue', {value: sum});
});
// 取消全选
$('#invcsList').EBDataGrid('onUncheckAll', function (rows) {
    $('#settlementAmt').EBRichInput('setValue', {value: 0});
});