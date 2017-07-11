eb.utils.regs =
{
    "number": {
        "reg": /^(\d*\.)?\d+$/,
        "msg": "必须是数字！"
    },
    "decimal": {
        "reg": /^[+]?[0-9]{1}[0-9]*[\\.]?[0-9]{0,2}$/,
        "msg": "必须是数字保留两位小数！"
    },
    "string": {
        "reg": /^[A-Za-z\u4e00-\u9fa5]+$/,
        "msg": "只能输入中文和英文！"
    },
    "email": {
        "reg": /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/,
        "msg": "邮箱格式不正确！"
    },
    "mobilephone": {
        "reg": /^1[34578]\d{9}$/,
        "msg": "请输入正确的手机号！"
    },
    "fixedPhone": {
        "reg": /^(0\d{2,3}-\d{7,8})$/,
        "msg": "格式类似为: 0XXX-XXXXXXX！"
    },
    "postcode": {
        "reg": /^\d{6}$/,
        "msg": "格式类似为: XXXXXX！"
    }
};