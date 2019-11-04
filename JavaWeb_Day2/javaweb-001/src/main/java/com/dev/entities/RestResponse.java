package com.dev.entities;

/**
 * class nay bieu dien json tra ve nguoi dung tu rest api co cau truc nhu sau: {
 * status: ["success", "failed"], message: "" }
 */

public class RestResponse {
	private String status;
	private String message;

	// hàm này ngăn tạo mới ob từ toán tử new
	private RestResponse() {
	};
	
	// thông báo thành công
	public static RestResponse success(String message) {
		RestResponse restResponse = new RestResponse();
		restResponse.setStatus("success");
		restResponse.setMessage(message);
		return restResponse;
	}

	// thông báo thất bại
	public static RestResponse failed(String message) {
		RestResponse restResponse = new RestResponse();
		restResponse.setStatus("failed");
		restResponse.setMessage(message);
		return restResponse;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
