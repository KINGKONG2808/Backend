package com.dev.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.entities.Contact;
import com.dev.repositories.ContactRepository;

@Controller
public class ContactController {
	@Autowired ContactRepository contactrepository;
	
	@RequestMapping(value = { "/contact" }, method = { RequestMethod.GET })
	public String contact(final ModelMap model, final HttpServletRequest request, final HttpServletResponse respone)
			throws IOException {
		System.out.println("Contact loading, wait a moment bro ...");
		// day datacontact vao model
		Contact contact = new Contact();
		contact.setFullName("Vu Van Hung");
		contact.setEmail("vuhung2881999@gmail.com");
		contact.setPhone("0366310685");
		contact.setContent("Wellcome, ...");
//		model.addAttribute("contact", new Contact());
		model.addAttribute("contact", contact);
		return "contact";
	}

	// cach nay dung binding data dung map
	@RequestMapping(value = { "/contact-bind-data" }, method = { RequestMethod.POST })
	public String saveContact(@ModelAttribute("contact") Contact contact, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse respone) {
//		System.out.println(contact.getFullName());
//		System.out.println(contact.getEmail());
//		System.out.println(contact.getPhone());
//		System.out.println(contact.getContent());
		
		//lệnh này để lưu thông tin từfront về dtb 
		contactrepository.save(contact);

		// luu du lieu vao dtb, tra ve thong bao
		model.addAttribute("status", "success");
		return "contact";
	}

	// cach nay dung request thong thuong
	@RequestMapping(value = { "/contact-normal" }, method = { RequestMethod.POST })
	public String saveContact(final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse respone) {
		String fullName = request.getParameter("fullName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String content = request.getParameter("content");

		Contact contact = new Contact();
		contact.setFullName(fullName);
		contact.setFullName(email);
		contact.setFullName(phone);
		contact.setFullName(content);

		System.out.println(contact.getFullName());
		System.out.println(contact.getEmail());
		System.out.println(contact.getPhone());
		System.out.println(contact.getContent());

		model.addAttribute("status", "success");
		model.addAttribute("contact", contact);

		return "contact";
	}
}
