eb.log.debug('Custom \'userManager\' script loaded!');
//var corpId = $("#user-corpId").data('eb-initval');
//var roleId = $("#user-deptRoles").data('eb-initval');
var formId = "userForm";
var formData = eb.utils.form.extractAsObjects(formId);

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
//        $("#user-corpId").EBRichInput("setValue", {value: corpId});
        
        $("#user-corpId").EBRichInput("onChange", function () {
            //所属企业与所属机构的联动
                	corpId = $('#user-corpId').EBRichInput("getValue");
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


            //所属企业与用户角色的联动
            var client2 = new eb.Client({
                url: eb.settings.SERVER_CONTEXT_PATH + '/role/listByCorp',
                requestData: {"isPage":"1","page":{"pageSize":10,"pageNumber":1},"corpId": $('#user-corpId').EBRichInput("getValue")}
            })
                .ifSuccess(function (response) {
                    var roleArr = [ ];
                    var resData = response.data.dataList;
                    for (var i = 0; i < resData.length; i++) {
                        roleArr.push({key:resData[i].roleId,value:resData[i].roleName});
                    }
                    $("#user-deptRoles").EBRichInput("setOptions", {dict: roleArr});
                })
                .ifFail(function (response) {
                    alert(response.msg);
                })
                .send();

        });

        $("#userDept-add").click(function (e){
			if ($("#user-deptId").EBRichInput("getValue") == '') {
		    alert("请选择机构名称！");
		    return;
		}
		});
        
        $("#sys-user-btn").click(function (e) {
        	var formId = "userForm";
            var formData = eb.utils.form.extractAsObjects(formId);
            
            // 常规形态校验
            var validateResult = eb.app.validateForm(formId);
            if (!validateResult) {
                alert("表单数据校验失败，请根据提示检查您输入的数据！");
                return;
            }

            formData.password = eb.utils.crypto.encrypt('md5', formData.password);

            $("#"+formId).find('[data-grid-name]').each(function () {
                var name = $(this).attr('data-grid-name');
                var dataList = $(this).attr('data-select-strategy')==='none' ? $(this).EBDataGrid('getData') : $(this).EBDataGrid('getSelections');
                eval("formData."+name+"=dataList");
            });


            // 特殊校验逻辑
            var confirmPassword = $("#ipt-confirmPwd").EBRichInput("getValue");
            if (formData.password!==eb.utils.crypto.encrypt('md5', confirmPassword))
            {
                alert("两次输入密码不一致！");
                return;
            }

            formData.corpId = $('#user-corpId').EBRichInput("getValue");
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

	var client = new eb.Client({
	    url: eb.settings.SERVER_CONTEXT_PATH + '/role/listByCorp',
	    requestData: {"isPage":"1","page":{"pageSize":10,"pageNumber":1}, "corpId": $('#user-corpId').EBRichInput("getValue")}
	}).ifSuccess(function (response) {
	    var roleArr = [ ];
	    var resData = response.data.dataList;
	    for (var i = 0; i < resData.length; i++) {
	        roleArr.push({key: resData[i].roleId, value: resData[i].roleName});
	    }
	    $("#user-deptRoles").EBRichInput("setOptions", {dict: roleArr});
	    var roleId = $("#user-deptRoles").EBRichInput("getValue");
	})
	.send();
	
        	corpId = $('#user-corpId').EBRichInput("getValue");
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
