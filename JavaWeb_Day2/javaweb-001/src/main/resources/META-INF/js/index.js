//summernote for function add post
$(document).ready(function() {
	$('#my-summernote').summernote();
	$("#myInput").on("keyup", function() {
		var value = $(this).val().toLowerCase();
		$("#myTable tr").filter(function() {
			$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
		});
	});
})

// validate email right here
function validate() {
	var email = $("#userEmail").val();
	if (validateEmail(email))
		return true;
	else
		return false;
}

function validateEmail(email) {
	var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	return re.test(email);
}

// confirm password right there
function validatePassword() {
	var password = $("#userPassword").val();
	var confirmPassword = $("#confirmUserPassword").val();
	if (password == confirmPassword)
		return true;
	else
		return false;
}

// hide all alert before submit
$("#divSuccessEmail").hide();
$("#divErrorEmail").hide();
$("#divSuccessPassword").hide();
$("#divErrorPassword").hide();

var Blog = {
	addToCart : function(productId) {
		var data = {};
		data["productId"] = productId;
		$.ajax({
			url : "/rest/api/cart/addToCart",
			type : "post",
			contentType : "application/json", // dữ liệu gửi lên RestAPI có
			// dạng là json.
			data : JSON.stringify(data), // object json -> string json

			dataType : "json", // dữ liệu từ Rest trả về là json.
			success : function(jsonResult) { // được gọi khi web-service trả
				// về dữ liệu.
				if (jsonResult.status == "success") {
					alert('Added product ' + productId + ' to cart.')
				}
			}
		});
	},

	deleteForm : function(modalID, entityId, restApi) {
		$("#deleteOk").click(function() {

			var data = {};
			data["entityId"] = entityId;
			$.ajax({
				url : restApi,
				type : "post",
				contentType : "application/json", // dữ liệu gửi lên RestAPI
													// có dạng là json.
				data : JSON.stringify(data), // object json -> string json

				dataType : "json", // dữ liệu từ Rest trả về là json.
				success : function(jsonResult) { // được gọi khi web-service
													// trả về dữ liệu.
					if (jsonResult.status == "success") {
						// thành công
						window.location.reload();

					} else {
						// thất bại
					}
				}
			});

		});
		$('#' + modalID).modal('show');
	},

	userRegister : function() {
		var userName = $("#userUserName").val();
		var email = $("#userEmail").val();
		var password = $("#userPassword").val();

		// đây là json: {userName: "", email: "", password: ""}
		var data = {};
		data["userName"] = userName;
		data["email"] = email;
		data["password"] = password;

		$.ajax({
			url : "/rest/api/user/register",
			type : "post",
			contentType : "application/json", // dữ liệu gửi lên RestAPI có
			// dạng là json.
			data : JSON.stringify(data), // object json -> string json

			dataType : "json", // dữ liệu từ Rest trả về là json.
			success : function(jsonResult) { // được gọi khi web-service trả
				// về dữ liệu.
				// alert(jsonResult.status);
				// alert(jsonResult.message);
				// validate email
				if (validate()) {
					$("#divSuccessEmail").show();
					$("#divErrorEmail").hide();
				} else {
					$("#divSuccessEmail").hide();
					$("#divErrorEmail").show();
				}
				// validate password
				if (validatePassword()) {
					$("#divSuccessPassword").show();
					$("#divErrorPassword").hide();
				} else {
					$("#divSuccessPassword").hide();
					$("#divErrorPassword").show();
				}
			}
		});
	}
}