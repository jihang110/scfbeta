// Override Window Objects
window._alert   = alert;
window._confirm = confirm;
window.alert   = $.alert;
window.confirm = $.confirm;

// 系统设置（向下兼容）
eb.app.config.LOG_LEVEL = eb.settings.LOG_LEVEL = 'DEBUG';
eb.settings.APP_NAME = '有田供应链金融管理系统';
eb.settings.SERVER_CONTEXT_PATH = '/scfbeta';
eb.settings.SERVER_RESOURCES =
{
    login: '/login',
     menu: '/menu/tree',
     dict: '/dict/listAll'
};
eb.settings.REST_CONTRACT =
{
     add: '/add',
     mod: '/mod',
     del: '/delete',
     get: '/get',
    list: '/list'
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

// 表单操作相关函数
eb.app.form =
{

    validate: function (formId, options) {
        var validateResult = true;

        $("#"+formId).find("[data-validation]").each(function(){
            if ($(this).attr("data-validation")=="false")
            {
                $(this).EBRichInput("showValidationResult");
                validateResult = false;
            }
        });

        return validateResult;
    },

    submit: function (url, formId, options) {
        var opts = $.extend(true, {}, options);

        var validateResult = eb.app.form.validate(formId);

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

                // 流程发起跳转到流程结果页面
                if (response.data && response.data.trxSerialNum)
                {
                    eb.app.cache.currentWorkflowResult = response.data;
                    eb.app.Router.go("workflowResult");

                    return;
                }

                alert(response.msg);
                if (opts.onSuccess) opts.onSuccess();
            })
            .ifFail(function (response) {
                $.hideLoading("正在提交表单数据...失败！");
                alert(response.msg);
            })
            .send();
    }

};
// 向下兼容
eb.app.validateForm = eb.app.form.validate;
eb.app.submitForm   = eb.app.form.submit;

// 列表操作相关函数
eb.app.datagrid =
{

    /**
     * 发起删除请求
     * @param options
     */
    deleteItem: function (options) {
        var confirmMsg = options.msg || '您确定要删除这条数据？';
        var gridId = options.gridId;

        var client = new eb.Client({url: eb.settings.SERVER_CONTEXT_PATH + options.url, requestData: options.requestData})
            .before(function () {
                $.showLoading('正在删除数据...');
            })
            .ifSuccess(function (response) {
                $.hideLoading('正在删除数据...操作成功！');

                if (gridId) $('#' + gridId).EBDataGrid('search');
            })
            .ifFail(function (response) {
                $.hideLoading('正在删除数据...操作失败！');
                alert(response.msg);
            });

        $.confirm(confirmMsg, function () {
            client.send();
        });
    }

};

// 流程操作相关函数
eb.app.workflow =
{

    /**
     * 展现流程历史
     * @param taskId  必须，任务ID
     * @param baseUrl 可选，流程接口baseUrl，默认取当前缓存即打开的流程
     */
    showHistoryData: function(taskId, baseUrl)
    {
        var workflowCfg = $.extend(true, {}, eb.app.cache.currentWorkflow);
        var url = eb.settings.SERVER_CONTEXT_PATH + (baseUrl ? baseUrl : workflowCfg.baseUrl) + '/historyFormData';
        
        new eb.Client({
                url: url,
                requestData: {taskId: taskId}
            })
            .before(function () {
                $.showLoading('正在加载流程历史数据...');
            })
            .ifSuccess(function (response) {
                $.hideLoading('正在加载流程历史数据...成功！');

                var historyData = response.data;

                for (var i=0; i<workflowCfg.fields.length; i++)
                {
                    workflowCfg.fields[i].id   = workflowCfg.fields[i].id+'-history' || 'eb-richipt-'+eb.utils.random(3);
                    workflowCfg.fields[i].type = (workflowCfg.fields[i].type!=='datagrid' && workflowCfg.fields[i].type!=='hidden') ? 'output' : workflowCfg.fields[i].type;

                    if (workflowCfg.fields[i].type==='datagrid')
                    {
                        workflowCfg.fields[i].selectStrategy = 'none';
                        var lastColumn = workflowCfg.fields[i].columns[workflowCfg.fields[i].columns.length-1];
                        if (lastColumn.actions)
                        {
                            workflowCfg.fields[i].columns.pop();
                        }
                    }
                }

                eb.app.Router.add({
                    'workflowHistoryInfo': {'cfg': {
                        'pageType': 'page-form',
                        'formId': 'workflow-history-info',
                        'fields': workflowCfg.fields,
                        'workflowChartUrl': eb.settings.SERVER_CONTEXT_PATH + '/bpm/graph?taskId=' + historyData.taskId
                    }}
                });

                eb.app.Router.open('workflowHistoryInfo', {
                    'title': '流程历史数据',
                    'businessData': historyData.formData
                });

                $('#workflow-history-info').find('.eb-richbtn').hide();

                // 流程配置显隐规则
                if (historyData.formConfig && historyData.formConfig.visibleExclusion) {

                    var exclusion = historyData.formConfig.visibleExclusion;

                    (function (exclusion) {
                        if (exclusion)
                        {
                            for (var i=0; i<exclusion.length; i++)
                            {
                                var name = exclusion[i];
                                $('#window-modal').find("[data-eb-name='"+name+"']").EBRichInput('hide');
                            }
                        }
                    }) (exclusion);

                }

                // 业务字段显隐规则
                if (initWorkFlowPage) initWorkFlowPage('-history');
            })
            .ifFail(function (response) {
                $.hideLoading('正在加载流程历史数据...失败！');
                alert('流程历史数据加载失败：' + response.msg);
            })
            .send()
    }

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
        }},
        {eventName: 'QUERY_HOMEPAGE_SETTINGS', url: eb.settings.SERVER_CONTEXT_PATH + '/main/getPrefer?key=HOMEPAGE_WIDGET_SETTINGS', callback: function (response) {
            if (response.data)
            {
                eb.app.cache.homepage = JSON.parse(response.data);
            }
        }},
        {eventName: 'QUERY_USER_INFO', url: eb.settings.SERVER_CONTEXT_PATH + '/main/info', callback: function(response) {
            if (response.data)
            {
                eb.app.cache.userinfo = response.data;
                $('#navbar-todoNum-placeholder').html(eb.app.cache.userinfo.todoNum || 0);
                $('#navbar-warningNum-placeholder').html(eb.app.cache.userinfo.warningNum || 0);
                $('#navbar-noticeNum-placeholder').html(eb.app.cache.userinfo.noticeNum || 0);
                $('#navbar-announcementNum-placeholder').html(eb.app.cache.userinfo.announcementNum || 0);
                $('#navbar-roleswitcher-placeholer').html(eb.app.cache.userinfo.user.role);
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
            setTimeout(function () {
                $('#cover-app-loading').fadeOut();
            }, 3500);

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