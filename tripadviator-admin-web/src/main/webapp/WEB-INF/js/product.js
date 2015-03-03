/**
 * Product js
 */

$(document).ready(function() {

	$("#productReviewImportId").click(function(event) {
		$.ajax({
			type : "POST",
			url  : "importProductReview.html",
			data : {
				
			}
		}).done(function(msg) {
			alert("Data Saved: " + msg);
		});
	});
	
	
	$("#productPhotoImportId").click(function(event) {
		$.ajax({
			type : "POST",
			url  : "importProductPhoto.html",
			data : {
				
			}
		}).done(function(msg) {
			alert("Data Saved: " + msg);
		});
	});
	
	$("#productVideoImportId").click(function(event) {
		$.ajax({
			type : "POST",
			url  : "importProductVideo.html",
			data : {
				
			}
		}).done(function(msg) {
			alert("Data Saved: " + msg);
		});
	});
});