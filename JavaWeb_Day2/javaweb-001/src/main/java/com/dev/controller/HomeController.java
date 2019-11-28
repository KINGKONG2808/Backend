package com.dev.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.repositories.BillRepository;
import com.dev.repositories.PostRepository;
import com.dev.beans.Cart;
import com.dev.entities.Bill;
import com.dev.entities.BillPost;

@Controller
public class HomeController {
	@Autowired PostRepository postRepository;
	@Autowired BillRepository billRepository;

	@RequestMapping(value = { "/login" }, method = { RequestMethod.GET })
	public String login(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		// trả về tên view.
		return "login";
	}

	/** trang truy cap co nhieu endpoint */
	@RequestMapping(value = { "/", "/home" }, method = { RequestMethod.GET })
	public String index(final ModelMap model, final HttpServletRequest request, final HttpServletResponse respone)
			throws IOException {
		System.out.println("Home loading, wait a moment bro ...");

		model.addAttribute("_products", postRepository.findAll());
		return "index";
	}

	@RequestMapping(value = { "/details/{productId}" }, method = { RequestMethod.GET })
	public String details(@PathVariable int productId, final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		model.addAttribute("product", postRepository.getOne(productId));
		// trả về tên view.
		return "details";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = { "/cart/finish" }, method = { RequestMethod.GET })
	public String cartFinish(final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {

//		1. lấy danh sách sản phẩm đã chọn mua
		List<Cart> carts = new ArrayList<Cart>();
		HttpSession httpSession = request.getSession();
		if (httpSession.getAttribute("giohang") != null) {
			carts = (List<Cart>) httpSession.getAttribute("giohang");
		}

		// 2. tạo hoá đơn
		Bill bill = new Bill();
		bill.setName("Make bill on " + new Date().toString());

		// 3. bổ sung sản phẩm vào hoá đơn.
		Double kq = new Double(0);
		
		for (Cart cart : carts) {
			BillPost billPost = new BillPost();
			billPost.setProductId(cart.getProductId());
			billPost.setPrice(cart.getPrice());
			billPost.setQuality(cart.getQuality());
			billPost.setTotal(cart.getTotalMoney());
			kq+=cart.getTotalMoney();
			bill.addBillPost(billPost);
		}

		// 4. lưu hoá đơn
		billRepository.save(bill);
		model.addAttribute("total", kq);

		// trả về tên view.
		return "giohang";
	}
}
