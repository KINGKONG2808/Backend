package com.dev.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.test.DetailsProduct;

@Controller
public class DetailsController {
	@RequestMapping(value = { "/macpro2019" }, method = { RequestMethod.GET })
	public String macpro2019(final ModelMap model, final HttpServletRequest request, final HttpServletResponse respone)
			throws IOException {
		System.out.println("Details loading, wait a moment bro ...");
		model.addAttribute("_macbookPro", DetailsProduct.getListMacPro());
		return "macpro2019";
	}

	@RequestMapping(value = { "/macpro2018" }, method = { RequestMethod.GET })
	public String macpro2018(final ModelMap model, final HttpServletRequest request, final HttpServletResponse respone)
			throws IOException {
		System.out.println("Details loading, wait a moment bro ...");
		model.addAttribute("_macbookPro", DetailsProduct.getListMacPro());
		return "macpro2018";
	}
}
