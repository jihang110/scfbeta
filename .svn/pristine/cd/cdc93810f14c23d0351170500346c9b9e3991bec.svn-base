eb.log.debug('Custom \'custRelaList.js\' script loaded!');

$("#buyerName").EBRichInput("onChange", function (value) {

    var client = new eb.Client({
            url: eb.settings.SERVER_CONTEXT_PATH + '/pub/custRela/list',
            requestData: {
            	"sysType":"4",
            	"buyerNm":value
            }
        })
        .ifSuccess(function (response) {
            $("#sellerList").EBDataGrid("setData", {items: response.data.dataList});
        })
        .send();

});