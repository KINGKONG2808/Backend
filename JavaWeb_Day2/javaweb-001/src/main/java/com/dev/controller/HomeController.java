package com.dev.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.test.TestProduct;

@Controller
public class HomeController {
	/** trang truy cap co nhieu endpoint */
	@RequestMapping(value = { "/", "/home" }, method = { RequestMethod.GET })
	public String index(final ModelMap model, final HttpServletRequest request, final HttpServletResponse respone)
			throws IOException {
		System.out.println("Home loading, wait a moment bro ...");

		//
//		model.addAttribute("_product", TestProduct.getListHome());
		model.addAttribute("_macPro", TestProduct.getListMacpro());
		model.addAttribute("_macAir", TestProduct.getListMacair());
		model.addAttribute("_iMac", TestProduct.getListImac());
		return "index";
	}

	/** endpoint tra ve noi dung chi tiet bai viet */
	@RequestMapping(value = { "/details" }, method = { RequestMethod.GET })
	public String details(final ModelMap model, final HttpServletRequest request, final HttpServletResponse respone)
			throws IOException {
		System.out.println("Details loading, wait a moment bro ...");
		return "details";
	}
	
//	@RequestMapping(value = { "/contact" }, method = { RequestMethod.GET })
//	public String contact(final ModelMap model, final HttpServletRequest request, final HttpServletResponse respone)
//			throws IOException {
//		System.out.println("Contact loading, wait a moment bro ...");
//		return "contact";
//	}
}
