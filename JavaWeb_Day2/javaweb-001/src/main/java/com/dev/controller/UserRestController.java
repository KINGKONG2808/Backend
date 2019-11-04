package com.dev.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.entities.RestResponse;

/**
 * de viet rest-api dung rest controller rest nay tra ve 1 data khac controller
 * tra ve 1 view
 */
@RestController
@RequestMapping("/rest/api")
public class UserRestController {
	/**
	 * @request body cua spring de spring mapping du lieu nguoi dung day len voi
	 *          model
	 */
	@PostMapping(value = "/user/register")
	public ResponseEntity<RestResponse> register(@RequestBody final Map<String, Object> data, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse respone) {
		for (Map.Entry<String, Object> entry : data.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		return ResponseEntity.ok(RestResponse.success("Register complete !!!"));
	}
}
