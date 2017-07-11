eb.log.debug('Homepage script loaded!');

// TODO 首页预加载任务增加加载首页配置项任务
if (!eb.app.homepage) {
    eb.app.homepage =
        {

            DEFAULTS: {
                fixedWidgets: ['INFO_BANNER', 'STATISTIC_BOARD'],

                customWidgits: ['SHORT_CUTS', 'WORKFLOW_TODOLIST', 'CLIENT_STATISTIC', 'PRODUCT_STATISTIC']
            },

            FIXED_WIDGETS: {

                'INFO_BANNER': {
                    title: '用户信息',
                    showTitle: false,
                    genHTML: function () {

                    },
                    render: function () {
                        var genHTML = function (info) {
                            var html = "<div class='col-lg-4 col-md-4 col-sm-12 col-xs-12 userinfo'>" +
                                "<div class='col-lg-4 col-md-4 col-sm-4 col-xs-4 portrait'>" +
                                "<i class='fa iconfont icon-icon-test4'></i>" +
                                "</div>" +
                                "<div class='col-lg-8 col-md-8 col-sm-8 col-xs-8 info'>" +
                                "<p>欢迎进入供应链金融系统</p>" +
                                "<p>" + info.user.role + "&nbsp;" + info.user.dept + "</p>" +
                                "<p>您好！</p>" +
                                "</div>" +
                                "</div>" +
                                "<div class='col-lg-4 col-md-4 col-sm-12 col-xs-12 logininfo'>" +
                                "<div class=''>" +
                                "<p>上次登陆时间：" + info.login.lastTimeTxt + "</p>" +
                                "<p>本次登陆时间：" + info.login.curTimeTxt + "</p>" +
                                "<p>距密码到期还有：" +
                                "<span class=\"info-banner-count\" cup-duration=\"1500\" cup-start=\"0\" cup-end=\"" + info.login.pswdExpireDays + "\"></span>" +
                                "天 </p>" +
                                "</div>" +
                                "</div>" +
                                "<div class='col-lg-4 col-md-4 col-sm-12 col-xs-12 msglinks'>" +
                                "<div class='col-md-6'>" +
                                "<i class=\"fa fa-bell-o\" aria-hidden=\"true\"></i>" +
                                "我的通知&nbsp;" +
                                "<span class=\"info-banner-count\" cup-duration=\"1500\" cup-start=\"0\" cup-end=\"" + info.noticeNum + "\"></span>" +
                                "&nbsp; 个" +
                                "</div>" +
                                "<div class='col-md-6'>" +
                                "<i class=\"fa fa-volume-up\" aria-hidden=\"true\"></i>" +
                                "我的公告&nbsp;" +
                                "<span class=\"info-banner-count\" cup-duration=\"1500\" cup-start=\"0\" cup-end=\"" + info.announcementNum + "\"></span>" +
                                "&nbsp; 个" +
                                "</div>" +
                                "</div>";

                            return html;
                        };

                        /*new eb.Client({
                         url: eb.settings.SERVER_CONTEXT_PATH + '/main/info'
                         })
                         .ifSuccess(function (response) {

                         var info = response.data;
                         $('#INFO_BANNER').html(genHTML(info));
                         new eb.component.CounterUp({
                         selector: '.info-banner-count'
                         }).start();

                         })
                         .ifFail(function (response) {
                         $.notice('用户信息获取失败！', 'error');
                         })
                         .send(); // 改为系统启动加载 */

                        var info = eb.app.cache.userinfo;
                        $('#INFO_BANNER').html(genHTML(info));
                        new eb.component.CounterUp({
                            selector: '.info-banner-count'
                        }).start();


                        /*var info = {
                         user: {
                         role: 'xxx角色',
                         dept: 'xxxxxx部门'
                         },

                         login: {
                         lastTimeTxt: '2016年11月13日 13:36:12 星期三',
                         curTimeTxt: '2016年12月25日 02:17:56',
                         pswdExpireDays: 100
                         },
                         noticeNum: 15,
                         announcementNum: 22
                         };
                         $('#INFO_BANNER').html(genHTML(info));
                         new eb.component.CounterUp({
                         selector: '.info-banner-count'
                         }).start();*/
                    }
                },

                'STATISTIC_BOARD': {
                    title: '统计面板',
                    showTitle: false,
                    meta: [
                        {
                            id: 'todoNum',
                            title: '待办队列',
                            href: '#workflowTodoList',
                            start: 0,
                            end: 0,
                            prefix: '',
                            postFix: '',
                            icon: 'fa fa-pencil-square',
                            colorStyle: 'blue'
                        },
                        {
                            id: 'doneNum',
                            title: '已办队列',
                            href: '#',
                            start: 0,
                            end: 0,
                            prefix: '',
                            postFix: '',
                            icon: 'fa fa-check-square',
                            colorStyle: 'red'
                        },
                        {
                            id: 'warningNum',
                            title: '预警队列',
                            href: '#workflowTodoList',
                            start: 0,
                            end: 0,
                            prefix: '',
                            postFix: '',
                            icon: 'fa fa-bell',
                            colorStyle: 'green'
                        },
                        {
                            id: 'archiveNum',
                            title: '暂存队列',
                            href: '#workflowTodoList',
                            start: 0,
                            end: 0,
                            prefix: '',
                            postFix: '',
                            icon: 'fa fa-archive',
                            colorStyle: 'purple'
                        }
                    ],
                    genHTML: function () {
                        var genBlockHTML = function (options) {
                            var html = "";

                            var meta = eb.app.homepage.FIXED_WIDGETS.STATISTIC_BOARD.meta;
                            for (var i = 0; i < meta.length; i++) {
                                html += "<div class='card-wrapper col-lg-3 col-md-3 col-sm-6 col-xs-12'><a class=\"card " + meta[i].colorStyle + "\" href=\"" + meta[i].href + "\">" +
                                    "<div class=\"icon\"><i class=\"" + meta[i].icon + "\"></i></div>" +
                                    "<div class=\"detail\">" +
                                    "<div class=\"number\">" +
                                    "<span id=\"homepage-" + meta[i].id + "-placeholder\" class=\"countup\" cup-duration=\"1500\" cup-start=\"" + meta[i].start + "\" cup-end=\"" + meta[i].end + "\" cup-append=\"" + meta[i].postFix + "\"></span>" +
                                    "</div>" +
                                    "<div class=\"desc\">" +
                                    "<span class=\"title\">" + meta[i].title + "</span>" +
                                    "</div>" +
                                    "</div>" +
                                    "</a></div>";
                            }
                            html += "";

                            return html;
                        };

                        $("#STATISTIC_BOARD").html(genBlockHTML());
                    },
                    render: function () {
                        var setDigit = function (id, num) {
                            $('#homepage-' + id + '-placeholder').attr('cup-end', num);
                        };

                        var startCounterUp = function (id) {
                            new eb.component.CounterUp({
                                selector: '#homepage-' + id + '-placeholder'
                            }).start();
                        };

                        /* var client = new eb.Client();
                         // TODO 请求真实数据再渲染 */

                        var data = eb.app.cache.userinfo;
                        var meta = eb.app.homepage.FIXED_WIDGETS.STATISTIC_BOARD.meta;
                        for (var i = 0; i < meta.length; i++) {
                            setDigit(meta[i].id, eb.app.cache.userinfo[meta[i].id] || 0);
                            startCounterUp(meta[i].id);
                        }
                        // Mock 效果 */
                    }
                }

            },

            CUSTOM_WIDGETS: {

                'WORKFLOW_TODOLIST': {
                    title: '待办列表',
                    showTitle: true,
                    optionIcon: 'icon-table',
                    icon: 'fa fa-table',
                    actions: [
                        {
                            remark: '更多',
                            icon: 'fa fa-ellipsis-h',
                            action: "eb.app.Router.go('workflowTodoList')"
                        }
                    ],
                    genHTML: function () {
                        $("#WORKFLOW_TODOLIST").find('.eb-panel-body').html("<table id='WORKFLOW_TODOLIST-table' class='eb-datagrid'></table>")
                    },
                    render: function () {
                        $("#WORKFLOW_TODOLIST-table").EBDataGrid({
                            pageStrategy: "real",
                            selectStrategy: "none",
                            sourceUrl: eb.settings.SERVER_CONTEXT_PATH + "/bpm/task/todoList",
                            pageSize: 6,
                            columns: [
                                {
                                    "title": "任务类型",
                                    "field": "processDefinitionName"
                                },
                                {
                                    "title": "任务名称",
                                    "actions": [
                                        {
                                            "name": "@{processInstanceName}",
                                            "remark": "点击进入办理流程：@{processInstanceName}",
                                            "action": "eb.app.Router.go('#workflowTodoList-@{processDefinitionKey}', {'requestData': {taskId: '@{taskId}'}})"
                                        }
                                    ]
                                },
                                {
                                    "title": "最新处理人",
                                    "field": "lastProcessor"
                                },
                                {
                                    "title": "最新处理时间",
                                    "field": "lastProcessTime"
                                }
                            ]
                        })
                    }
                },

                'WARNING_LIST': {
                    title: '预警列表',
                    optionIcon: 'icon-table',
                    icon: 'fa fa-table',
                    showTitle: true,
                    genHTML: function () {
                        $("#WARNING_LIST").find('.eb-panel-body').html("<table id='WARNING_LIST-table' class='eb-datagrid'></table>")
                    },
                    render: function () {
                        $("#WARNING_LIST-table").EBDataGrid({
                            pageStrategy: "real",
                            selectStrategy: "none",
                            sourceUrl: eb.settings.SERVER_CONTEXT_PATH + "/bpm/task/todoListdddd",
                            pageSize: 6,
                            columns: [
                                {
                                    "title": "通知标题",
                                    "field": "processDefinitionName"
                                },
                                {
                                    "title": "通知类型",
                                    "field": ""
                                },
                                {
                                    "title": "发送时间",
                                    "field": "lastProcessor"
                                },
                                {
                                    "title": "通知状态",
                                    "field": "lastProcessTime"
                                }
                            ]
                        })
                    }
                },

                'DONE_LIST': {
                    title: '已办列表',
                    optionIcon: 'icon-table',
                    icon: 'icon-table',
                    showTitle: true,
                    genHTML: function () {
                        $("#DONE_LIST").find('.eb-panel-body').html("<table id='DONE_LIST-table' class='eb-datagrid'></table>");
                    },
                    render: function () {
                        $("#DONE_LIST-table").EBDataGrid({
                            pageStrategy: "real",
                            selectStrategy: "none",
                            sourceUrl: eb.settings.SERVER_CONTEXT_PATH + "/bpm/task/completedlist",
                            pageSize: 6,
                            columns: [
                                {
                                    "title": "事项名称",
                                    "field": "procDefName"
                                },
                                {
                                    "title": "创建时间",
                                    "field": "startTime"
                                },
                                {
                                    "title": "处理时间",
                                    "field": "endTime"
                                },
                                {
                                    "title": "事项状态",
                                    "field": "procStatus",
                                    "dict": [{key: "0", value: "未结"}, {key: "1", value: "已结"}]
                                }
                            ]
                        })
                    }
                },

                'TEMP_LIST': {
                    title: '暂存',
                    optionIcon: 'icon-table',
                    icon: 'icon-table',
                    showTitle: true,
                    genHTML: function () {
                        $("#TEMP_LIST").find('.eb-panel-body').html("<table id='TEMP_LIST-table' class='eb-datagrid'></table>");
                    },
                    render: function () {
                        $("#TEMP_LIST-table").EBDataGrid({
                            pageStrategy: "real",
                            selectStrategy: "none",
                            sourceUrl: eb.settings.SERVER_CONTEXT_PATH + "/bpm/task/todoListdddd",
                            pageSize: 6,
                            columns: [
                                {
                                    "title": "事项名称",
                                    "field": "processDefinitionName"
                                },
                                {
                                    "title": "事项类型",
                                    "field": "lastProcessTime"
                                },
                                {
                                    "title": "创建时间",
                                    "field": ""
                                }
                            ]
                        })
                    }
                },

                'CLIENT_STATISTIC': {
                    title: '客户统计',
                    optionIcon: 'icon-map',
                    icon: 'fa fa-map-o',
                    showTitle: true,
                    genHTML: function () {
                        $("#CLIENT_STATISTIC").find('.eb-panel-body').html("<div id='CLIENT_STATISTIC-chart' class='homepage-chart'></div>");
                    },
                    render: function () {

                        var chart = echarts.init(document.getElementById('CLIENT_STATISTIC-chart'));


                        function randomData() {
                            return Math.round(Math.random() * 1000);
                        }


                        var options = option = {
                            /*title: {
                             //text: 'iphone销量',
                             //subtext: '纯属虚构',
                             left: 'center'
                             },*/
                            tooltip: {
                                trigger: 'item'
                            },
                            legend: {
                                orient: 'horizontal',
                                left: 'left',
                                data: ['优质客户', '潜在客户', '不良客户']
                            },
                            visualMap: {
                                min: 0,
                                max: 2500,
                                left: 'left',
                                top: 'bottom',
                                text: ['高', '低'],           // 文本，默认为数值文本
                                calculable: true
                            },
                            toolbox: {
                                show: false,
                                orient: 'vertical',
                                left: 'right',
                                top: 'center',
                                feature: {
                                    dataView: {readOnly: false},
                                    restore: {},
                                    saveAsImage: {}
                                }
                            },
                            series: [
                                {
                                    name: '优质客户',
                                    type: 'map',
                                    mapType: 'china',
                                    roam: false,
                                    label: {
                                        normal: {
                                            show: false
                                        },
                                        emphasis: {
                                            show: true
                                        }
                                    },
                                    data: [
                                        {name: '北京', value: randomData()},
                                        {name: '天津', value: randomData()},
                                        {name: '上海', value: randomData()},
                                        {name: '重庆', value: randomData()},
                                        {name: '河北', value: randomData()},
                                        {name: '河南', value: randomData()},
                                        {name: '云南', value: randomData()},
                                        {name: '辽宁', value: randomData()},
                                        {name: '黑龙江', value: randomData()},
                                        {name: '湖南', value: randomData()},
                                        {name: '安徽', value: randomData()},
                                        {name: '山东', value: randomData()},
                                        {name: '新疆', value: randomData()},
                                        {name: '江苏', value: randomData()},
                                        {name: '浙江', value: randomData()},
                                        {name: '江西', value: randomData()},
                                        {name: '湖北', value: randomData()},
                                        {name: '广西', value: randomData()},
                                        {name: '甘肃', value: randomData()},
                                        {name: '山西', value: randomData()},
                                        {name: '内蒙古', value: randomData()},
                                        {name: '陕西', value: randomData()},
                                        {name: '吉林', value: randomData()},
                                        {name: '福建', value: randomData()},
                                        {name: '贵州', value: randomData()},
                                        {name: '广东', value: randomData()},
                                        {name: '青海', value: randomData()},
                                        {name: '西藏', value: randomData()},
                                        {name: '四川', value: randomData()},
                                        {name: '宁夏', value: randomData()},
                                        {name: '海南', value: randomData()},
                                        {name: '台湾', value: randomData()},
                                        {name: '香港', value: randomData()},
                                        {name: '澳门', value: randomData()}
                                    ]
                                },
                                {
                                    name: '潜在客户',
                                    type: 'map',
                                    mapType: 'china',
                                    label: {
                                        normal: {
                                            show: false
                                        },
                                        emphasis: {
                                            show: true
                                        }
                                    },
                                    data: [
                                        {name: '北京', value: randomData()},
                                        {name: '天津', value: randomData()},
                                        {name: '上海', value: randomData()},
                                        {name: '重庆', value: randomData()},
                                        {name: '河北', value: randomData()},
                                        {name: '安徽', value: randomData()},
                                        {name: '新疆', value: randomData()},
                                        {name: '浙江', value: randomData()},
                                        {name: '江西', value: randomData()},
                                        {name: '山西', value: randomData()},
                                        {name: '内蒙古', value: randomData()},
                                        {name: '吉林', value: randomData()},
                                        {name: '福建', value: randomData()},
                                        {name: '广东', value: randomData()},
                                        {name: '西藏', value: randomData()},
                                        {name: '四川', value: randomData()},
                                        {name: '宁夏', value: randomData()},
                                        {name: '香港', value: randomData()},
                                        {name: '澳门', value: randomData()}
                                    ]
                                },
                                {
                                    name: '不良客户',
                                    type: 'map',
                                    mapType: 'china',
                                    label: {
                                        normal: {
                                            show: false
                                        },
                                        emphasis: {
                                            show: true
                                        }
                                    },
                                    data: [
                                        {name: '北京', value: randomData()},
                                        {name: '天津', value: randomData()},
                                        {name: '上海', value: randomData()},
                                        {name: '广东', value: randomData()},
                                        {name: '台湾', value: randomData()},
                                        {name: '香港', value: randomData()},
                                        {name: '澳门', value: randomData()}
                                    ]
                                }
                            ]
                        };

                        chart.setOption(options);
                    }
                },

                'PRODUCT_STATISTIC': {
                    title: '产品使用数据',
                    showTitle: true,
                    optionIcon: 'icon-pie-chart',
                    icon: 'fa fa-pie-chart',
                    indDict: [
                        {key: 'ywkhzs', value: '业务客户总数'},
                        {key: 'ywjyl', value: '业务交易量'},
                        {key: 'zryszkze', value: '转让应收账款总额'},
                        {key: 'ljfdzs', value: '累计放贷总数'},
                        {key: 'ljfdze', value: '累计放贷总额'},
                        {key: 'ljsyze', value: '累计收益总额'}
                    ],
                    genHTML: function () {

                        var dict = eb.app.homepage.CUSTOM_WIDGETS.PRODUCT_STATISTIC.indDict;

                        var html = "<select id=\"PRODUCT_STATISTIC-select\">";
                        for (var i = 0; i < dict.length; i++) {
                            html += "<option value=\"" + dict[i].key + "\">" + dict[i].value + "</option>";
                        }
                        html += "</select>"

                        $("#PRODUCT_STATISTIC").find(".addons").html(html);
                        $("#PRODUCT_STATISTIC-select").multiselect({
                            enableFiltering: false,
                            onChange: function (event) {
                                eb.app.homepage.CUSTOM_WIDGETS.PRODUCT_STATISTIC.render();
                            }
                        });
                    },
                    render: function () {
                        $("#PRODUCT_STATISTIC").find('.eb-panel-body').html("<div id='PRODUCT_STATISTIC-chart' class='homepage-chart'></div>");

                        var indCode = $("#PRODUCT_STATISTIC-select").val();
                        var dictMap = eb.utils.dict2Map(eb.app.homepage.CUSTOM_WIDGETS.PRODUCT_STATISTIC.indDict);
                        var indName = dictMap[indCode];

                        // TODO 查接口显示

                        var chart = echarts.init(document.getElementById('PRODUCT_STATISTIC-chart'));

                        var options = {
                            animation: false,
                            title: {
                                text: indName,
                                //subtext: '纯属虚构',
                                x: 'center'
                            },
                            tooltip: {
                                trigger: 'item',
                                formatter: "{a} <br/>{b} : {c} ({d}%)"
                            },
                            legend: {
                                orient: 'vertical',
                                left: 'left',
                                data: ['订单融资', '仓单融资', '国内保理', '信用贷款', '动产质押']
                            },
                            series: [
                                {
                                    name: indName,
                                    type: 'pie',
                                    radius: '55%',
                                    center: ['50%', '60%'],
                                    data: [
                                        {value: eb.utils.random(3), name: '订单融资'},
                                        {value: eb.utils.random(3), name: '仓单融资'},
                                        {value: eb.utils.random(3), name: '国内保理'},
                                        {value: eb.utils.random(3), name: '信用贷款'},
                                        {value: eb.utils.random(3), name: '动产质押'}
                                    ],
                                    itemStyle: {
                                        emphasis: {
                                            shadowBlur: 10,
                                            shadowOffsetX: 0,
                                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                                        }
                                    }
                                }
                            ]
                        };

                        chart.clear();
                        chart.setOption(options);
                    }
                },

                'FINANCE_STATISTIC': {
                    title: '融资数据',
                    showTitle: true,
                    optionIcon: 'icon-bar-chart',
                    icon: 'fa fa-bar-chart',
                    indDict: [
                        {key: 'ed', value: '额度'},
                        {key: 'sl', value: '数量'}
                    ],
                    genHTML: function () {
                        var dict = eb.app.homepage.CUSTOM_WIDGETS.FINANCE_STATISTIC.indDict;

                        var html = "<select id=\"FINANCE_STATISTIC-select\">";
                        for (var i = 0; i < dict.length; i++) {
                            html += "<option value=\"" + dict[i].key + "\">" + dict[i].value + "</option>";
                        }
                        html += "</select>"

                        $("#FINANCE_STATISTIC").find(".addons").html(html);
                        $("#FINANCE_STATISTIC-select").multiselect({
                            enableFiltering: false,
                            onChange: function (event) {
                                eb.app.homepage.CUSTOM_WIDGETS.FINANCE_STATISTIC.render();
                            }
                        });
                    },
                    render: function () {
                        $("#FINANCE_STATISTIC").find('.eb-panel-body').html("<div id='FINANCE_STATISTIC-chart' class='homepage-chart'></div>");

                        var indCode = $("#FINANCE_STATISTIC-select").val();
                        var dictMap = eb.utils.dict2Map(eb.app.homepage.CUSTOM_WIDGETS.FINANCE_STATISTIC.indDict);
                        var indName = dictMap[indCode];

                        var chart = echarts.init(document.getElementById('FINANCE_STATISTIC-chart'));

                        var options = {
                            title: {
                                text: indName + '统计',
                                //subtext: '纯属虚构'
                            },
                            tooltip: {
                                trigger: 'axis'
                            },
                            /*legend: {
                             data:['蒸发量']
                             },*/
                            toolbox: {
                                show: false,
                                feature: {
                                    dataView: {show: true, readOnly: false},
                                    magicType: {show: true, type: ['line', 'bar']},
                                    restore: {show: true},
                                    saveAsImage: {show: true}
                                }
                            },
                            calculable: true,
                            grid: {
                                x: 5,
                                x2: 5
                            },
                            yAxis: [
                                {
                                    type: 'value'
                                }
                            ]
                        };

                        if (indCode === 'ed') {
                            options.xAxis = [
                                {
                                    type: 'category',
                                    data: ['累计放贷', '已回款贷款', '未回款贷款', '正常贷款', '不良贷款']
                                }
                            ];
                            options.series = [
                                {
                                    name: indName + '统计',
                                    type: 'bar',
                                    data: [5000.00, 1200.00, 2320.00, 8472.00, 9183.00],
                                    markPoint: {
                                        data: [
                                            {type: 'max', name: '最大值'},
                                            {type: 'min', name: '最小值'}
                                        ]
                                    },
                                    markLine: {
                                        data: [
                                            {type: 'average', name: '平均值'}
                                        ]
                                    }
                                }
                            ];
                        }
                        else {
                            options.xAxis = [
                                {
                                    type: 'category',
                                    data: ['累计放贷', '正常贷款', '不良贷款']
                                }
                            ];
                            options.series = [
                                {
                                    name: indName + '统计',
                                    type: 'bar',
                                    data: [1233.0, 123.0, 7.0],
                                    markPoint: {
                                        data: [
                                            {type: 'max', name: '最大值'},
                                            {type: 'min', name: '最小值'}
                                        ]
                                    },
                                    markLine: {
                                        data: [
                                            {type: 'average', name: '平均值'}
                                        ]
                                    }
                                }
                            ];
                        }

                        chart.setOption(options);
                    }
                },

                'INCOME_STATISTIC': {
                    title: '收益数据',
                    showTitle: true,
                    optionIcon: 'icon-bar-chart',
                    icon: 'fa fa-bar-chart',
                    genHTML: function () {

                    },
                    render: function () {
                        $("#INCOME_STATISTIC").find('.eb-panel-body').html("<div id='INCOME_STATISTIC-chart' class='homepage-chart'></div>");

                        var chart = echarts.init(document.getElementById('INCOME_STATISTIC-chart'));

                        var options = {
                            tooltip: {
                                trigger: 'axis',
                                axisPointer: {
                                    type: 'cross',
                                    crossStyle: {
                                        color: '#999'
                                    }
                                }
                            },
                            legend: {
                                data: ['利息', '费用']
                            },
                            xAxis: [
                                {
                                    type: 'category',
                                    data: ['1月', '2月', '3月'],
                                    axisPointer: {
                                        type: 'shadow'
                                    }
                                }
                            ],
                            yAxis: [
                                {
                                    type: 'value',
                                    name: '利息',
                                    min: 0,
                                    max: 250,
                                    interval: 50,
                                    axisLabel: {
                                        formatter: '{value} 元'
                                    }
                                },
                                {
                                    type: 'value',
                                    name: '费用',
                                    min: 0,
                                    max: 25,
                                    interval: 5,
                                    axisLabel: {
                                        formatter: '{value} 元'
                                    }
                                }
                            ],
                            series: [
                                {
                                    name: '利息',
                                    type: 'bar',
                                    data: [20.0, 40.9, 70.0]
                                },
                                {
                                    name: '费用',
                                    type: 'bar',
                                    data: [20.6, 50.9, 90.0]
                                }
                            ]
                        };

                        chart.setOption(options);
                    }
                },

                'SHORT_CUTS': {
                    title: '快捷导航',
                    showTitle: true,
                    optionIcon: 'icon-paper-plane',
                    icon: 'fa fa-paper-plane',
                    genHTML: function () {
                        var shortCuts = [
                            {title: "登记", link: "#"},
                            {title: "转让", link: "#"},
                            {title: "融资", link: "#"},
                            {title: "付款", link: "#"}
                        ];
                        var html = "";

                        for (var i = 0; i < shortCuts.length; i++) {
                            var shortCut = shortCuts[i];
                            html += "<a class='short-cut-btn' href='" + shortCut.link + "'>" + shortCut.title + "</a>";
                        }
                        html += "<a class='short-cut-btn add-btn' href='#'><i class=\"fa fa-plus\" aria-hidden=\"true\"></i></a>";

                        $("#SHORT_CUTS").find(".eb-panel-body").html(html);
                    },
                    render: function () {

                    }
                }

            },


            /**
             * 获得首页配置项
             */
            getSettings: function () {
                return $.extend({}, eb.app.homepage.DEFAULTS, eb.app.cache.homepage);
            },

            syncTimer: false,

            /**
             * 同步配置信息到后端以及应用缓存
             */
            syncSettings: function () {
                clearInterval(eb.app.homepage.syncTimer);

                var dataToArray = function (data) {
                    var result = [];
                    for (var i = 0; i < data.length; i++) {
                        result.push(data[i].name);
                    }
                    return result;
                }

                var dataF = eb.utils.form.extractAsSerializedArray('homepage-control-panel-form-f');
                var arrF = dataToArray(dataF);

                var dataC = eb.utils.form.extractAsSerializedArray('homepage-control-panel-form-c');
                var arrC = dataToArray(dataC);

                eb.app.cache.homepage.fixedWidgets = arrF;
                eb.app.cache.homepage.customWidgits = arrC;

                eb.app.homepage.syncTimer = setTimeout(function () {
                    eb.log.debug('Synchronizing homepage custom settings...');

                    var settings = {
                        fixedWidgets: eb.app.cache.homepage.fixedWidgets,
                        customWidgits: eb.app.cache.homepage.customWidgits
                    };

                    new eb.Client({
                        url: eb.settings.SERVER_CONTEXT_PATH + '/main/savePrefer',
                        requestData: {
                            'HOMEPAGE_WIDGET_SETTINGS': JSON.stringify(settings)
                        }
                    })
                        .ifSuccess(function (response) {
                            $.notice('您的首页设置已成功保存！', 'success');
                        })
                        .ifFail(function (response) {
                            $.notice('您的首页设置已保存失败！', 'error');
                        })
                        .send();

                    // TODO 同步配置项到后端
                }, 2500);
            },

            /**
             * 实例化首页
             */
            init: function () {
                // TODO 首页实例化
                var settings = eb.app.homepage.getSettings();

                $("#widget-zone-fixed").html("");
                for (var i = 0; i < settings.fixedWidgets.length; i++) {
                    var widgetCode = settings.fixedWidgets[i];
                    var widget = eb.app.homepage.FIXED_WIDGETS[widgetCode];
                    var frame = "<div id=\"" + widgetCode + "\" class=\"widget fixed-widget row\"></div>"

                    $("#widget-zone-fixed").append(frame);

                    widget.genHTML();
                    widget.render();
                }

                $("#widget-zone-custom").html("");
                for (var i = 0; i < settings.customWidgits.length; i++) {
                    var widgetCode = settings.customWidgits[i];
                    var widget = eb.app.homepage.CUSTOM_WIDGETS[widgetCode];
                    var frame = "<div id=\"" + widgetCode + "\" class=\"widget custom-widget col-lg-6 col-md-6 col-sm-12 col-xs-12\">";

                    frame += "<div class=\"eb-panel light\">";
                    if (widget.title && widget.showTitle) {
                        frame += "<div class=\"eb-panel-title\">" +
                            "<div class=\"caption\">" + (widget.icon ? "<i class=\"" + widget.icon + "\" aria-hidden=\"true\"></i>" : "") + widget.title + "</div>" +
                            "<div class=\"addons\">";

                        if (widget.actions) {
                            for (var j = 0; j < widget.actions.length; j++) {
                                var action = widget.actions[j];

                                frame += "<a class='action-link' href='#' data-action=\"" + action.action + "\" title='" + action.remark + "'>" +
                                    ( action.icon ? "<i class='" + action.icon + "'></i>" : "" ) +
                                    "</a>";
                            }
                        }

                        frame += "</div>" +
                            "</div>";
                        frame += "<div class=\"eb-panel-body\"></div>";
                    }
                    frame += "</div>";

                    frame += "</div>";

                    $("#widget-zone-custom").append(frame);

                    widget.genHTML();
                    widget.render();
                }
            },

            /**
             * 实例化控制面板
             */
            initControllPanel: function () {
                var settings = eb.app.homepage.getSettings();

                var genFixedOptionHTML = function (widgetCode, widget, settings) {
                    var checked = settings.fixedWidgets.contains(widgetCode);

                    var html = "<div class=\"option\">" +
                        "<div class=\"info\">" +
                        "<span>" + widget.title + "</span>" +
                        "</div>" +
                        "<div class=\"controls\">" +
                        "<input name=\"" + widgetCode + "\" class=\"switch\" type=\"checkbox\" " + (checked ? "checked" : "") + " />" +
                        "</div>" +
                        "</div>";

                    return html;
                };

                var genCustomOptionHTML = function (widgetCode, widget, settings, isFirst, isLast) {
                    var checked = settings.customWidgits.contains(widgetCode);

                    var html = "<div class=\"option\" data-widget-code=\"" + widgetCode + "\">" +
                        "<div class=\"info\">" +
                        "<span class=\"text\">" + widget.title + "</span>" +
                        "<span class=\"icon " + widget.optionIcon + "\">" +
                        "<i></i>" +
                        //(widget.optionIcon ? "<i class=\"" + widget.optionIcon + "\" aria-hidden=\"true\"></i>" : "") +
                        "</span>" +
                        "</div>" +
                        "<div class=\"controls\">" +
                        "<input name=\"" + widgetCode + "\" class=\"switch\" type=\"checkbox\" " + (checked ? "checked" : "") + " />" +
                        "<div class=\"arrow-block\">" +
                        "<span class=\"btn-up" + (isFirst ? " disabled" : "") + "\"><i class=\"fa fa-angle-up\" aria-hidden=\"true\"></i></span>" +
                        "<span class=\"btn-down" + (isLast ? " disabled" : "") + "\"><i class=\"fa fa-angle-down\" aria-hidden=\"true\"></i></span>" +
                        "</div>" +
                        "</div>" +
                        "</div>";

                    return html;
                };

                var fixedWidgets = "<div class=\"option\">" +
                    "<div class=\"info\">" +
                    "<span>界面主题</span>" +
                    "</div>" +
                    "<div class=\"controls\">" +
                    "<select id='ui-theme-select'>" +
                    "<option value='metronic'>Metronic</option>" +
                    "<option value='baseline'>Baseline</option>" +
                    "</select>" +
                    "</div>" +
                    "</div>";
                for (var key in eb.app.homepage.FIXED_WIDGETS) {
                    fixedWidgets += genFixedOptionHTML(key, eb.app.homepage.FIXED_WIDGETS[key], settings);
                }
                $("#homepage-control-panel .options.fixed").html(fixedWidgets);

                var activeWidgets = settings.customWidgits.concat(), nonActiveWidgets = [];
                for (var key in eb.app.homepage.CUSTOM_WIDGETS) {
                    if (!activeWidgets.contains(key)) {
                        nonActiveWidgets.push(key);
                    }
                }
                var sortedCustomWidgets = activeWidgets.concat(nonActiveWidgets);
                var customWidgets = "";
                for (var i = 0; i < sortedCustomWidgets.length; i++) {
                    var key = sortedCustomWidgets[i];
                    customWidgets += genCustomOptionHTML(key, eb.app.homepage.CUSTOM_WIDGETS[key], settings);
                }
                $("#homepage-control-panel .options.custom").html(customWidgets);
                eb.app.homepage.refreshControlPanelButton();

                $("#homepage-control-panel").find('.switch').each(function () {
                    $(this).bootstrapSwitch({
                        size: 'small',
                        disabled: false,
                        readonly: false,
                        animate: true,
                        onSwitchChange: function (event, state) {
                            eb.app.homepage.syncSettings();
                            eb.app.homepage.init();
                        }
                    });
                });

                $("#ui-theme-select").multiselect({
                    enableFiltering: false,
                    onChange: function (element, checked) {
                        var value = $("#ui-theme-select").val();
                        eb.app.theme.change(value);
                    }
                });

                $("#homepage-control-panel-toggler").click(function () {
                    $("#homepage-control-panel").fadeToggle();
                    $("#homepage-control-panel-toggler").toggle();
                });

                $("#homepage-control-panel-closer").click(function () {
                    $("#homepage-control-panel").fadeOut();
                    $("#homepage-control-panel-toggler").fadeIn();
                });

                $("#homepage-control-panel").on('click', '.btn-up', function (e) {
                    if (!$(this).hasClass('disabled')) {
                        var curOpt = $(this).parent().parent().parent();
                        var prevOpt = curOpt.prev();

                        var widgetCode = curOpt.attr('data-widget-code');
                        var prevWidgetCode = prevOpt.attr('data-widget-code');

                        curOpt.insertBefore(prevOpt);
                        eb.app.homepage.refreshControlPanelButton();

                        // 同步配置项
                        eb.app.homepage.syncSettings();

                        // 同步页面内容

                        var widget = eb.app.homepage.CUSTOM_WIDGETS[widgetCode];

                        var widgetObj = $('#' + widgetCode);
                        var prevWidgetObj = $('#' + prevWidgetCode);

                        if (prevWidgetObj.length > 0) {
                            widgetObj.insertBefore(widgetObj.prev());

                            if (widget.refreshRequired) {
                                widget.genHTML();
                                widget.render();
                            }
                        }
                    }
                });

                $("#homepage-control-panel").on('click', '.btn-down', function (e) {
                    if (!$(this).hasClass('disabled')) {
                        var curOpt = $(this).parent().parent().parent();
                        var nextOpt = curOpt.next();

                        var widgetCode = curOpt.attr('data-widget-code');
                        var nextWidgetCode = nextOpt.attr('data-widget-code');

                        curOpt.insertAfter(nextOpt);
                        eb.app.homepage.refreshControlPanelButton();

                        // 同步配置项
                        eb.app.homepage.syncSettings();

                        // 同步页面内容
                        var widget = eb.app.homepage.CUSTOM_WIDGETS[widgetCode];

                        var widgetObj = $('#' + widgetCode);
                        var nextWidgetObj = $('#' + nextWidgetCode);

                        if (nextWidgetObj.length > 0) {
                            widgetObj.insertAfter(widgetObj.next());

                            if (widget.refreshRequired) {
                                widget.genHTML();
                                widget.render();
                            }
                        }
                    }
                });
            },

            refreshControlPanelButton: function () {
                $("#homepage-control-panel .options.custom").find('.btn-up, .btn-down').removeClass('disabled');
                $("#homepage-control-panel .options.custom").find('.option').first().find('.btn-up').addClass('disabled');
                $("#homepage-control-panel .options.custom").find('.option').last().find('.btn-down').addClass('disabled');
            },

            /**
             * 实例化小部件
             * @param widgetCode
             */
            initWidget: function (widgetCode) {
                // not required
            },

            /**
             * 销毁小部件
             * @param widgetCode
             */
            destroyWidget: function (widgetCode) {
                // not required
            }

        };
}

// 实例化首页
eb.app.homepage.initControllPanel();
eb.app.homepage.init();
