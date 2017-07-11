eb.log.debug('Custom \'userManager-mod\' script loaded!');

var corpId = $("#user-corpId").data('eb-initval');
//var roleId = $("#user-deptRoles").data('eb-initval');
var formId = "userForm";
var formData = eb.utils.form.extractAsObjects(formId);
var userId = formData.userId;

var client = new eb.Client({
    url: eb.settings.SERVER_CONTEXT_PATH + '/corp/list',
    requestData: {"isPage":"1","page":{"pageSize":10,"pageNumber":1}}

})

    .ifSuccess(function (response) {
        var resData = response.data.dataList;
        var corpArr = [ ];

        //将响应数据里面的企业id和name依次赋值给数组
        for (var i = 0; i < resData.length; i++) {
            corpArr.push({key:resData[i].corpId,value:resData[i].corpName});
        }
        //获取所属企业列表
        $("#user-corpId").EBRichInput("setOptions", {dict: corpArr});
        $("#user-corpId").EBRichInput("setValue", {value: corpId});

        $('#user-corpId').EBRichInput('lock');



        $("#userDept-mod").click(function (e){
            if ($("#user-deptId").EBRichInput("getValue") == '') {
                alert("请选择机构名称！");
                return;
            }
        });

		var client1 = new eb.Client({
		    url: eb.settings.SERVER_CONTEXT_PATH + '/dept/list',
		    requestData: {"corpId": corpId}
		})
		    .ifSuccess(function (response) {
//		        var deptArr = [ ];
//		        var resData = response.data;
//		        for (var i = 0; i < resData.length; i++) {
//		        		deptArr.push({key:resData[i].subDeptList[i].deptId,value:resData[i].subDeptList[i].deptName});
//
//		        }
//		        $("#user-deptId").EBRichInput("setOptions", {dict: deptArr});
        $("#user-deptId").EBRichInput("init",
            {
                "type": "tree",
                "label": "机构名称",
                "name": "mainDeptId",
                "sourceUrl": "/dept/list?corpId="+corpId,
                "selectStrategy": "single",
                "keyField": "deptId",
                "valueField": "deptName",
                "idField": "deptId",
                "pidField": "parentId",
                "childrenField": "subDeptList",
                "id":"user-deptId",
                "required":true
            })
		    })
		    .ifFail(function (response) {
		        alert(response.msg);
		    })
        .send();

        var client2 = new eb.Client({
            url: eb.settings.SERVER_CONTEXT_PATH + '/role/listByCorp',
            requestData: {"isPage":"1","page":{"pageSize":10,"pageNumber":1}, "corpId": corpId}
        }).ifSuccess(function (response) {
            var roleArr = [ ];
            var resData = response.data.dataList;
            for (var i = 0; i < resData.length; i++) {
                roleArr.push({key: resData[i].roleId, value: resData[i].roleName});
            }
            $("#user-deptRoles").EBRichInput("setOptions", {dict: roleArr});
            var roleId = $("#user-deptRoles").EBRichInput("getValue");
        }).send();

        $("#sys-user-btn").click(function (e) {
            var formId = "userForm";
            var formData = eb.utils.form.extractAsObjects(formId);

            // 常规形态校验
            var validateResult = eb.app.validateForm(formId);
            if (!validateResult) {
                alert("表单数据校验失败，请根据提示检查您输入的数据！");
                return;
            }

            formData.corpId = corpId;
            formData.userId = userId;

            $("#"+formId).find('[data-grid-name]').each(function () {
                var name = $(this).attr('data-grid-name');
                var dataList = $(this).attr('data-select-strategy')==='none' ? $(this).EBDataGrid('getData') : $(this).EBDataGrid('getSelections');
                eval("formData."+name+"=dataList");
            });

            var newClient = new eb.Client({
                url: eb.settings.SERVER_CONTEXT_PATH + $(this).attr("data-submit-url"),
                requestData: formData
            })
                .ifSuccess(function (response) {
                    eb.app.Router.go('#userManager');
                })
                .send();

        });
    })
    .ifFail(function (response) {
        alert(response.msg);
    })
    .send();