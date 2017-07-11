eb.log.debug('Custom \'serialNm\' script loaded!');

var formId = "sys-serial-form";
var formData = eb.utils.form.extractAsObjects(formId);

$("#Rule").EBRichInput("onChange", function (){

    var key = $("#separator").EBRichInput("getValue");
    
    var ruleKey = $("#Rule").EBRichInput("getValue");

    //判断模块一、模块二是否被选中
    if (ruleKey.indexOf('$MOD$') != -1) {
        $('#modOne').EBRichInput('unlock');
    }
    if (ruleKey.indexOf('$TRX$') != -1) {
        $('#modTwo').EBRichInput('unlock');
    }
    
    var serialRule = formData.serialRule;

  //var a =ruleKey.join(seq);
  //判断分隔符类型
  var seq;
  if (key == 1){
      seq = '';
  }
  if (key == 2){
      seq = '-';
  }
  if (key ==3){
      seq = '_';
  }
  if (key == 4){
      seq = ';';
  }
  if (key == 5){
      seq = ' ';
  }

  var arr = ruleKey.split(";");
  var ruleValue = arr.join(seq);
  $('#serialRule').EBRichInput('setValue', {
      value: ruleValue
  })
    
})


