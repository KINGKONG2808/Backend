package com.dev.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.entities.RestResponse;
import com.dev.repositories.ContactRepository;
import com.dev.repositories.PostRepository;
import com.dev.CartUtils;
import com.dev.entities.Post;

/**
 * de viet rest-api dung rest controller rest nay tra ve 1 data khac controller
 * tra ve 1 view
 */
@RestController
@RequestMapping("/rest/api")
public class UserRestController {

	@Autowired
	PostRepository postRepository;
	@Autowired
	ContactRepository contactRepository;

	@PostMapping(value = "/blog/delete")
	public ResponseEntity<RestResponse> blogDelete(@RequestBody final Map<String, Object> data, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse response) {
		Integer entityId = (Integer) data.get("entityId");
		postRepository.deleteById(entityId);
		return ResponseEntity.ok(RestResponse.success("Bạn đã xoá thành công"));
	}

	@PostMapping(value = "/contact/delete")
	public ResponseEntity<RestResponse> contactDelete(@RequestBody final Map<String, Object> data, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse response) {
		Integer entityId = (Integer) data.get("entityId");
		contactRepository.deleteById(entityId);
		return ResponseEntity.ok(RestResponse.success("Bạn đã xoá thành công"));
	}

	@PostMapping(value = "/cart/addToCart")
	public ResponseEntity<RestResponse> addToCart(@RequestBody final Map<String, Object> data, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse response) {
		Integer productId = (Integer) data.get("productId");
		Post post = postRepository.getOne(productId);
		CartUtils.checkCart(post, request);
		return ResponseEntity.ok(RestResponse.success("Bạn đã đăng kí thành công"));
	}

	/**
	 * @request body cua spring de spring mapping du lieu nguoi dung day len voi
	 *          model
	 */
	@PostMapping(value = "/user/register")
	public ResponseEntity<RestResponse> register(@RequestBody final Map<String, Object> data, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse respone) {
		String email = (String) data.get("email");
		if (!email.contains("@")) {
			return ResponseEntity.ok(RestResponse.failed("Email chưa đúng định dạng!"));
		}
		return ResponseEntity.ok(RestResponse.success("Register complete !!!"));
	}
}
