$("#custId").EBRichInput("onChange", function (value) {

    var client = new eb.Client({
            url: eb.settings.SERVER_CONTEXT_PATH + '/pub/custRela/sellerList',
            requestData: {
            	custId: value
            }
        })
        .ifSuccess(function (response) {
            $("#sellerCommList").EBDataGrid("setData", {items: response.data.dataList});
        })
        .send();

});

$("#productNm").EBRichInput("bindLookupReqDataCollector", function () {
    return {
    	custId: $("#custId").EBRichInput("getValue")
    };
});

$("#acId").EBRichInput("bindLookupReqDataCollector", function () {
	return {
		custId: $("#custId").EBRichInput("getValue")
	};
});

var val = $("#coordinator").EBRichInput('getValue');
if (val == 0) {
	$('#coordinatorNm').EBRichInput('show');
	$('#coordinatorEmail').EBRichInput('show');
} else {
	$('#coordinatorNm').EBRichInput('hide');
	$('#coordinatorEmail').EBRichInput('hide');
}

$("#coordinator").EBRichInput("onChange", function(value) {

	if (value == 0) {
		$('#coordinatorNm').EBRichInput('show');
		$('#coordinatorEmail').EBRichInput('show');
	} else {
		$('#coordinatorNm').EBRichInput('hide');
		$('#coordinatorEmail').EBRichInput('hide');
	}

});