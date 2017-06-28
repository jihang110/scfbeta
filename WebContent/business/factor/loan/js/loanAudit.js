var expectLoanAmt = $('#ipt-loan-expectLoanAmt').EBRichInput('getValue');
$('#ipt-loan-actualLoanAmt').EBRichInput('setValue', {
	value : expectLoanAmt
});
