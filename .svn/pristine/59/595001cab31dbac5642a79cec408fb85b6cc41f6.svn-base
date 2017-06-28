eb.log.debug('Custom \'deptList\' script loaded!');

$("#sys-depted-btn").click(function(e){
	debugger;
    var formId = "deptListForm";
    var formData = eb.utils.form.extractAsObjects(formId);

    // 常规形态校验
    var validateResult = eb.app.validateForm(formId);
    if (!validateResult) {
        alert("表单数据校验失败，请根据提示检查您输入的数据！");
        return;
    }

    var client = new eb.Client({
        url: eb.settings.SERVER_CONTEXT_PATH + $(this).attr("data-submit-url"),
        requestData: formData
    })
        .before(function () {
            $.showLoading("正在更新机构信息，请稍候...");
        })
        .ifSuccess(function (response) {
            alert(response.msg);
            $.hideLoading("正在更新机构信息，请稍候...成功！");
        })
        .ifFail(function (response) {
            alert(response.msg);
            $.hideLoading("正在更新机构信息，请稍候...失败！");
        })
        .after(function () {
            // do nothing
        })
        .send();
});

$("#deptAdd-deptId").EBRichInput("onChange", function (){
    var client = new eb.Client({
        url: eb.settings.SERVER_CONTEXT_PATH + '/dept/list'
    })
});