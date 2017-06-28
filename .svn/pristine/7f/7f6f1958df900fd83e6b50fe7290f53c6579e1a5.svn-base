$("#dg-prdtdist-prdDistList").EBRichInput("onChange", function(value) {
			var items = $("#dg-prdtdist-prdDistList").EBDataGrid('getData');
			var sum = 0;
			$.each(items, function(index, itm) {
						sum += itm.productLmt;
					});
			var bal = $('#txt-prdtdist-lmtAmt').EBRichInput('getValue') - sum;
			console.log("bal"+bal);
			$('#txt-prdtdist-releLmtAmt').EBRichInput('setValue', {
						value : bal
					});

		});