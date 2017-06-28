eb.log.debug('Custom \'serialNm\' script loaded!');

$("#MODNUM").click(function(e){
	
}

/**
 * checkbox选中，显示预览信息
 */
function getValue() {
	$(":checkbox").click(function() {
		var tags = $('#preInf');
		var box = $(":checkbox");
		var modNo = $("#modNo");
		var modNo2 = $("#modNo2");
		value = "";
		tags.val(value);

		var options = $("#addModal option:selected");
		var sep = options.text();
                    if(options.val() == "1"){
              			sep = "";
              		}
              		if(options.val() == "5"){
              			sep = " ";
              		}
            		$.each(box, function(i, n) {
        			if ($(n).is(":checked")) {
        				value = value + $(n).val() + sep;
        				tags.val(value);
        			}
        		});
		
//    if(){
//    	
//    }

//    if(modNo.is(":checked")){
//    	value = value + modNo.val() + ';';
//		tags.val(value);
//    }
//    if(modNo2.is(":checked")){
//    	value = value + modNo2.val() + ';';
//		tags.val(value);
//    }
	});

}

/**
 * 1.当复选框没被选中，文本框不可编辑
 * 2.当复选框被选中，文本框可编辑
 */
function isChecked(checked) {
	var modNo = $("#modNo");
	if (checked) {
		modNo.get(0).disabled = "";
	} else {
		modNo.attr('disabled', 'disabled');
	}
}

function isChecked2(checked) {
	var modNo2 = $("#modNo2");
	if (checked) {
		modNo2.get(0).disabled = "";
	} else {
		modNo2.attr('disabled', 'disabled');
	}
}

