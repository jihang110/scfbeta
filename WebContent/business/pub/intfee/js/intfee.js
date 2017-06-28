var val = $("#deductIntWay").EBRichInput('getValue');
if (val == 0) {
	$('#chargeDay').EBRichInput('show');
	$('#chargeDay').EBRichInput('setValue', {
		value : '每个季度末18号'
	});
} else if (val == 1) {
	$('#chargeDay').EBRichInput('show');
	$('#chargeDay').EBRichInput('setValue', {
		value : '每个月18号'
	});
} else {
	$('#chargeDay').EBRichInput('hide');
}

$("#deductIntWay").EBRichInput("onChange", function(value) {

	if (value == 0) {
		$('#chargeDay').EBRichInput('show');
		$('#chargeDay').EBRichInput('setValue', {
			value : '每个季度末18号'
		});
	} else if (value == 1) {
		$('#chargeDay').EBRichInput('show');
		$('#chargeDay').EBRichInput('setValue', {
			value : '每个月18号'
		});
	} else {
		$('#chargeDay').EBRichInput('hide');
	}

});
