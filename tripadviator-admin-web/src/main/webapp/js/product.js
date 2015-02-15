/**
 * Product js
 */

$(document).ready(function() {

	$("#productReviewImportId").click(function(event) {
		alert("Testing here");

		$.ajax({
			type : "POST",
			url  : "importProductReview.html",
			data : {
				
			}
		}).done(function(msg) {
			alert("Data Saved: " + msg);
		});
	});
});