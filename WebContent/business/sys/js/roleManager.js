eb.log.debug('Custom \'roleManager\' script loaded!');

var roleId = $("#roleId").data('eb-initval');
var client = new eb.Client({
	url : eb.settings.SERVER_CONTEXT_PATH + '/corp/getCorp',
	requestData : {
		"isPage" : "1",
		"page" : {
			"pageSize" : 10,
			"pageNumber" : 1
		}
	}
})

.ifSuccess(function(response) {
	var resData = response.data.dataList;
	var corpArr = [];

	//将响应数据里面的企业id和name依次赋值给数组
	for (var i = 0; i < resData.length; i++) {
		corpArr.push({
			key : resData[i].corpId,
			value : resData[i].corpName
		});
	}
	//获取所属企业列表
	$("#role-corpId").EBRichInput("setOptions", {
		dict : corpArr
	});

}).send();

var client = new eb.Client({
	url : eb.settings.SERVER_CONTEXT_PATH + '/role/roleTypeList'
})

.ifSuccess(function(response) {
	var resData = response.data.dataList;
	var roleTypeArr = [];

	//将响应数据里面的企业id和name依次赋值给数组
	for (var i = 0; i < resData.length; i++) {
		roleTypeArr.push({
			key : resData[i].roleType,
			value : resData[i].roleTypeName
		});
	}
	//获取角色类型列表
	$("#roleId").EBRichInput("setOptions", {
		dict : roleTypeArr
	});
	$("#roleId").EBRichInput("setValue", {
		value : roleId
	});

	$("#sys-role-btn").click(function(e) {
		var formId = "roleForm";
		var formData = eb.utils.form.extractAsObjects(formId);

		formData.corpId = $("#role-corpId").EBRichInput("getValue");

		var client = new eb.Client({
			url : eb.settings.SERVER_CONTEXT_PATH + '/role/add',
			requestData : formData
		}).ifSuccess(function(response) {
			eb.app.Router.go('#roleManager');
		}).ifFail(function(response) {
			alert(response.msg);
		}).send();

	});

}).ifFail(function(response) {
	alert(response.msg);
}).send();
