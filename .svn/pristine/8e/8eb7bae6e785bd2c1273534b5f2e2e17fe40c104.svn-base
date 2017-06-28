eb.log.debug('Custom \'userManager\' script loaded!');

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

    })
    .ifFail(function (response) {
        alert(response.msg);
    })
    .send();

/**
 * 所属企业与所属机构的联动
 */
$("#user-corpId").EBRichInput("onChange", function () {
    var client = new eb.Client({
        url: eb.settings.SERVER_CONTEXT_PATH + '/dept/tree'
    })
        .ifSuccess(function (response) {
            var deptArr = [ ];
            var resData = response.data;
            for (var i = 0; i < resData.length; i++) {
                deptArr.push({key:resData[i].subDeptList[i].deptId,value:resData[i].subDeptList[i].deptName});
            }
            $("#user-deptId").EBRichInput("setOptions", {dict: deptArr});
        })
        .ifFail(function (response) {
            alert(response.msg);
        })
        .send();

});

/**
 * 所属企业与用户角色的联动
 */
$("#user-corpId").EBRichInput("onChange", function () {
    var client = new eb.Client({
        url: eb.settings.SERVER_CONTEXT_PATH + '/role/list',
        requestData: {"isPage":"1","page":{"pageSize":10,"pageNumber":1}}
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

    // 特殊校验逻辑
    var confirmPassword = $("#ipt-confirmPwd").EBRichInput("getValue");
    if (formData.password!==eb.utils.crypto.encrypt('md5', confirmPassword))
    {
        alert("两次输入密码不一致！");
        return;
    }


});