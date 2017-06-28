eb.log.debug('Custom \'pwdManager\' script loaded!');

$("#sys-pswdch-btn").click(function (e) {
debugger;
    var formId = "pwdManagerForm";

    var formData = eb.utils.form.extractAsObjects(formId);

    formData.oldPassword = eb.utils.crypto.encrypt('md5', formData.oldPassword);
    formData.newPassword = eb.utils.crypto.encrypt('md5', formData.newPassword);

    // 常规形态校验
    var validateResult = eb.app.validateForm(formId);
    if (!validateResult) {
        alert("表单数据校验失败，请根据提示检查您输入的数据！");
        return;
    }

    // 特殊校验逻辑
    var confirmPassword = $("#ipt-confirmPassword").EBRichInput("getValue");
    if (formData.newPassword!==eb.utils.crypto.encrypt('md5', confirmPassword))
    {
        alert("两次输入密码不一致！");
        return;
    }
    if (formData.newPassword == formData.oldPassword)
    {
    	  alert("新密码不能和原密码相同！");
          return;
    }
    	

    var client = new eb.Client({
            url: eb.settings.SERVER_CONTEXT_PATH + $(this).attr("data-submit-url"),
            requestData: formData
        })
        .before(function () {
            $.showLoading("正在更新密码，请稍候...");
        })
        .ifSuccess(function (response) {
            alert(response.msg);
            $.hideLoading("正在更新密码，请稍候...成功！");
        })
        .ifFail(function (response) {
            alert(response.msg);
            $.hideLoading("正在更新密码，请稍候...失败！");
        })
        .after(function () {
            // do nothing
        })
        .send();

});