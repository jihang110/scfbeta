// Override Window Objects
window._alert   = alert;
window._confirm = confirm;
window.alert   = $.alert;
window.confirm = $.confirm;

// 系统设置
eb.settings =
{
    // 终端日志级别
    LOG_LEVEL: 'DEBUG',

    // 表单同名多值分隔符
    MUTI_VAL_SEP: ';',

    // 应用名称
    APP_NAME: 'Enbrau Studio',

    // 服务端上下文地址
    SERVER_CONTEXT_PATH: '/scfbeta',

    // 服务端公共资源地址集合（不含上下文地址）
    SERVER_RESOURCES:
    {
        login: '/login',

        menu: '/menu/tree',

        dict: '/dict/listAll'
    },

    // REST 接口约定
    REST_CONTRACT:
    {
        add: '/add',
        mod: '/mod',
        del: '/delete',
        get: '/get',
        list: '/list'
    }
};

// 约定可推测接口
eb.app.getPredictableUrl = function (url, predict) {
    return url + eb.settings.REST_CONTRACT[predict];
};

eb.app.deleteFromDataGrid = function (options) {
    var client = new eb.Client({url: eb.settings.SERVER_CONTEXT_PATH + options.url, requestData: options.requestData})
        .ifSuccess(function (response) {
            alert(response.msg);
        })
        .ifFail(function (response) {
            alert(response.msg);
        });

    client.send();
};

eb.app.validateForm = function (formId, options) {
    var validateResult = true;

    $("#"+formId).find("[data-validation]").each(function(){
        if ($(this).attr("data-validation")=="false")
        {
            $(this).EBRichInput("showValidationResult");
            validateResult = false;
        }
    });

    return validateResult;
};

eb.app.submitForm = function (url, formId, options) {
    var validateResult = eb.app.validateForm(formId);

    if (!validateResult) {
        alert("表单数据校验失败，请根据提示检查您输入的数据！");
        return;
    }

    var formData = eb.utils.form.extractAsObjects(formId);

    $("#"+formId).find('[data-grid-name]').each(function () {
        var name = $(this).attr('data-grid-name');
        var dataList = $(this).attr('data-select-strategy')==='none' ? $(this).EBDataGrid('getData') : $(this).EBDataGrid('getSelections');
        eval("formData."+name+"=dataList");
    });

    new eb.Client({url: url, requestData: formData})
        .before(function () {
            $.showLoading("正在提交表单数据...");
        })
        .ifSuccess(function (response) {
            $.hideLoading("正在提交表单数据...成功！");
            alert(response.msg);
            if (options.onSuccess) options.onSuccess();
        })
        .ifFail(function (response) {
            $.hideLoading("正在提交表单数据...失败！");
            alert(response.msg);
        })
        .send();
};

eb.app.openItemForm = function (itemIndex, formRoute, gridId, formId) {
    eb.app.Router.open(formRoute, {
        businessData: $('#'+gridId).EBDataGrid('getData', {index: itemIndex})[0],
        btnGroup: [
            {
                type: 'grid-save',
                title: '保存',
                gridId: gridId,
                itemIndex: itemIndex
            },
            {
                type: 'modal-window-dismiss',
                title: '取消'
            }
        ]
    });
};


// 应用初始化方法
(eb.app.init = function () {

    // 应用初始化任务列表
    var jobs = [
        // 加载菜单
        {eventName: 'QUERY_MENU', url: eb.app.getSourceURL('menu'), callback: function(response){
            var menuData = response.data;

             /*menuData.push(
                 {"name": "框架功能演示", "url": "#", "icon": "fa fa-rocket", "submenu": [
                     {"name": "开发方式（配置）", "url": "#", "submenu": [
                         {"name": "新建表单", "url": "#demoDataGrid-demoForm"},
                         {"name": "编辑表单", "url": "#demoDataGrid-demoFormEdit"},
                         {"name": "数据列表", "url": "#demoDataGrid"},
                         {"name": "流程审批", "url": "#workflowTodoList-demoAuditPage"}
                     ]}
                 ]},
                 {"name": "系统管理", "url": "#", "icon": "fa fa-cogs", "submenu": [
                     {"name": "系统接口管理", "url": "#interfaceList"},
                     {"name": "待办流程列表", "url": "#workflowTodoList"}
                 ]},
                 {"name": "系统管理", "url": "#", "icon": "fa fa-cogs", "submenu": [
                     {"name": "数据字典管理", "url": "#dictList"},
                 ]}
            ); // 开发阶段插入demo菜单 */

            eb.app.loadMenu(menuData);
        }},
        // 加载字典
        {eventName: 'QUERY_DICT', url: eb.app.getSourceURL('dict'), callback: function(response){
            if (response.data)
            {
                for (var key in response.data)
                {
                    eb.app.cache.dicts[key] = response.data[key];

                    var dictE = [{"key": "", "value": "请选择"}].concat(response.data[key]);
                    eb.app.cache.dicts[key+'-E'] = dictE;
                }
            }
        }}
    ];

    // 初始化任务事件订阅器（处理任务都完成后的逻辑）
    var events = [];
    for (var i=0; i<jobs.length; i++) {
        events.push(jobs[i].eventName);
    }
    var proxy = new eb.EventProxy({
        events: events,
        callback: function (triggeredEvents)
        {
            // 请求完成后，隐藏loading画面
            $('#cover-app-loading').fadeOut();

            // 加载菜单
            //eb.app.loadMenu(triggeredEvents['QUERY_MENU']);

            // 加载首个页面
            eb.app.Router.dispatch(window.location.hash.replace('#', '') || 'homepage');
        }
    });

    for (var i=0; i<jobs.length; i++)
    {
        var job = jobs[i];

        var client = new eb.Client(job)
            .ifSuccess(function (response) {
                // 任务自己处理
                if (this.job.callback) this.job.callback(response);
                // 提交给订阅器处理
                proxy.emit(this.job.eventName, response.data);
            })
            .ifFail(function (response) {

                // SCF 未登陆处理
                if (response.flag===6)
                {
                    window.location = 'login.html';
                }
                // 其他错误
                else
                {
                    eb.log.error('Initial job ' + this.job.eventName + ' failed: ' + JSON.stringify(response));
                }

            });

        client.job = job;

        client.send();
    }
})();