eb.log.debug('Custom \'invTrans.js\' script loaded!');
var _Math = eb.utils.math;

var cntNo = $('#cntNo').EBRichInput('getValue');
if (cntNo && eb.app.cache.currentWorkflow.formConfig.editableExclusion.contains('invList')) {
    var client = new eb.Client({
        url: eb.settings.SERVER_CONTEXT_PATH + '/factor/invTrans/invoice',
        requestData: {'cntNo': cntNo}
    }).ifSuccess(function (response) {
        $('#chargeTotalAmt').EBRichInput('setValue', {value: 0});
        $('#invcTransAmt').EBRichInput('setValue', {value: 0});
        var selectList = $('#invList').EBDataGrid('getData');
        $('#invList').EBDataGrid('setData', {items: response.data.dataList});
        var sum = 0;
        $.each(response.data.dataList, function (index, row) {
            sum = _Math.floatAdd(sum, row.invAmt);
            for (var i = 0; i < selectList.length; i++) {
                var item = selectList[i];
                if (row.recUid === item.recUid) {
                    $('#invList').EBDataGrid('check', {'index': index});
                }
            }
        });
        $('#sumInvAmt').EBRichInput('setValue', {value: sum});
    }).send();
}

$('#cntNo').EBRichInput('onChange', function (value) {

    var client = new eb.Client({
        url: eb.settings.SERVER_CONTEXT_PATH + '/factor/invTrans/invoice',
        requestData: {'cntNo': value}
    })
    .ifSuccess(function (response) {
        $('#invList').EBDataGrid('setData', {items: response.data.dataList});
        var sum = 0;
        $.each(response.data.dataList, function (index, row) {
            sum = _Math.floatAdd(sum, row.invAmt);
        });
        $('#sumInvAmt').EBRichInput('setValue', {value: sum === 0 ? '' : sum});
        $('#invcTransAmt').EBRichInput('setValue', {value: ''});
        $('#chargeTotalAmt').EBRichInput('setValue', {value: ''});
    })
    .send();

});
// 单击选中发票
$('#invList').EBDataGrid('onCheck', function (row, index) {
    var sum1 = $('#invcTransAmt').EBRichInput('getValue') || 0;
    var sum2 = $('#chargeTotalAmt').EBRichInput('getValue') || 0;
    var deduMethod = $('#deduMethod').EBRichInput('getValue');
    var rateBearParty = $('#rateBearParty').EBRichInput('getValue');
    if (rateBearParty === '0' && deduMethod === '0') {
        row.charge = _Math.floatMul(row.invAmt, $('#rate').EBRichInput('getValue'));
    } else {
        row.charge = 0;
    }
    sum1 = _Math.floatAdd(sum1, row.invAmt);
    sum2 = _Math.floatAdd(sum2, row.charge);
    $('#invcTransAmt').EBRichInput('setValue', {value: sum1});
    $('#chargeTotalAmt').EBRichInput('setValue', {value: sum2});
    $('#invList').EBDataGrid('updateItem', {index: index, item: row});
});
// 单击取消发票
$('#invList').EBDataGrid('onUncheck', function (row, index) {
    var sum1 = $('#invcTransAmt').EBRichInput('getValue') || 0;
    var sum2 = $('#chargeTotalAmt').EBRichInput('getValue') || 0;
    sum1 = _Math.floatSub(sum1, row.invAmt);
    sum2 = _Math.floatSub(sum2, row.charge);
    row.charge = null;
    $('#invcTransAmt').EBRichInput('setValue', {value: sum1 === '0' ? '' : sum1});
    $('#chargeTotalAmt').EBRichInput('setValue', {value: sum2});
    $('#invList').EBDataGrid('updateItem', {index: index, item: row});
});
// 全选发票
$('#invList').EBDataGrid('onCheckAll', function (rows) {
    var sum1 = 0, sum2 = 0;
    var deduMethod = $('#deduMethod').EBRichInput('getValue');
    var rateBearParty = $('#rateBearParty').EBRichInput('getValue');
    var rate = $('#rate').EBRichInput('getValue');
    var flag = rateBearParty === '0' && deduMethod === '0';
    $.each(rows, function (index, row) {
        row.charge = flag ? _Math.floatMul(row.invAmt, rate) : 0;
        sum1 = _Math.floatAdd(sum1, row.invAmt);
        sum2 = _Math.floatAdd(sum2, row.charge);
    });
    $('#invcTransAmt').EBRichInput('setValue', {value: sum1});
    $('#chargeTotalAmt').EBRichInput('setValue', {value: sum2});
    $('#invList').EBDataGrid('setData', {items: rows});
});
// 取消全选
$('#invList').EBDataGrid('onUncheckAll', function (rows) {
    $.each(rows, function (index, row) {
        row.charge = null;
    });
    $('#invcTransAmt').EBRichInput('setValue', {value: ''});
    $('#chargeTotalAmt').EBRichInput('setValue', {value: ''});
    $('#invList').EBDataGrid('setData', {items: rows});
});