package com.dev.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.entities.Bill;
import com.dev.entities.BillPost;
import com.dev.entities.Categories;
import com.dev.entities.Contact;
import com.dev.entities.Post;
import com.dev.entities.PostAttachment;
import com.dev.repositories.BillPostRepository;
import com.dev.repositories.BillRepository;
import com.dev.repositories.CategoriesRepository;
import com.dev.repositories.ContactRepository;
import com.dev.repositories.PostAttachmentRepository;
import com.dev.repositories.PostRepository;

@Controller
public class AdminPageController {
	@Autowired ContactRepository contactRepository;
	@Autowired CategoriesRepository categoriesRepository;
	@Autowired PostRepository postRepository;
	@Autowired PostAttachmentRepository postAttachmentRepository;
	@Autowired BillRepository billRepository;
	@Autowired BillPostRepository billPostRepository;
	
	@RequestMapping(value = { "/admin/home" }, method = { RequestMethod.GET })
	public String listContact(final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		List<Contact> contacts = contactRepository.findAll();
		List<Categories> categories = categoriesRepository.findAll();
		List<Post> posts = postRepository.findAll();
		List<PostAttachment> postAttachments = postAttachmentRepository.findAll();
		List<Bill> bills = billRepository.findAll();
		List<BillPost> billPosts = billPostRepository.findAll();
		model.addAttribute("contacts", contacts);
		model.addAttribute("categories", categories);
		model.addAttribute("posts", posts);
		model.addAttribute("postAttachments", postAttachments);
		model.addAttribute("bills", bills);
		model.addAttribute("billPosts", billPosts);
		return "admin/home";
	}
}
