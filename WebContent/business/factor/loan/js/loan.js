$("#lkp-loan-cntNo").EBRichInput("onChange", function(value) {
	var url = eb.settings.SERVER_CONTEXT_PATH + '/factor/loan/invlist?cntId=' + $("#hid-loan-cntId").val();
	var client = new eb.Client({
			url: url
		})
		.ifSuccess(function(response) {
			$("#dl-loan-invlist").EBDataGrid("setData", {
				items: response.data.dataList
			});
		})
		.send();

});

$("#dl-loan-invlist").EBDataGrid('onCheck', function(row, index) {
	var duedate = row.invDueDate;
	var deadline = $('#hid-loan-loanDeadline').val();
	var deadlineDate = fn_factor_loan.goback(duedate,deadline);
	var now = new Date();
	console.log(now +","+ deadlineDate + ","+(now > deadlineDate));
	if (now > deadlineDate){
		alert("到期前" + deadline + "个工作日内的发票不可融资");
		//TODO call row uncheck...
	}
	fn_factor_loan.calculdateAmts();
});

$("#dl-loan-invlist").EBDataGrid('onUncheck', function(row, index) {
	fn_factor_loan.calculdateAmts();
});

fn_factor_loan = {
	calculdateAmts: function() {
		var items = $("#dl-loan-invlist").EBDataGrid('getSelections');
		var loanSum = 0;
		var rateSum = 0;
		var invAmtSum = 0;
		$.each(items, function(index, itm) {
			loanSum += itm.invLoanAval;
			rateSum += itm.intAmt;
			invAmtSum += itm.invAmt;
		});
		var loanPer = loanSum / invAmtSum;
		$('#ipt-loan-ttlLoanAmt').EBRichInput('setValue', {
			value: loanSum
		});
		$('#ipt-loan-intAmt').EBRichInput('setValue', {
			value: rateSum.toFixed(4)
		});
		$('#ipt-loan-loanPercApply').EBRichInput('setValue', {
			value: loanPer.toFixed(2)
		});
		$('#ipt-loan-expectLoanAmt').EBRichInput('setValue', {
			value: loanSum
		});
	},
	goback: function(dateStr,days) {
		var now = new Date(dateStr);
		if (days >= 1) {
			now = new Date(now.getTime() - 86400000 * days);
		}
		return now;
		/*
		var yyyy = now.getFullYear();
		var	mm = (now.getMonth() + 1).toString();
		var	dd = now.getDate().toString();
		if (mm.length == 1) {
			mm = '0' + mm;
		}
		if (dd.length == 1) {
			dd = '0' + dd;
		}
		return (yyyy + '-' + mm + '-' + dd);
		*/
	}
}