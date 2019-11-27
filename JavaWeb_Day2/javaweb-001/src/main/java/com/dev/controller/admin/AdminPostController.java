package com.dev.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dev.entities.Post;
import com.dev.entities.PostAttachment;
import com.dev.repositories.CategoriesRepository;
import com.dev.repositories.PostRepository;

@Controller
public class AdminPostController {
	@Autowired
	PostRepository postRepository;
	@Autowired
	CategoriesRepository categoriesRepository;
	@Value("${file.upload.path}")
	private String attachmentPath;

	@RequestMapping(value = { "/admin/add-post" }, method = { RequestMethod.GET })
	public String listContact(final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		model.addAttribute("post", new Post());
		model.addAttribute("categories", categoriesRepository.findAll());
		return "admin/add-post";
	}

	@RequestMapping(value = "/admin/add-post", method = RequestMethod.POST)
	public String saveContact(@RequestParam("postImage") MultipartFile postImage, @ModelAttribute("post") Post post,
			final ModelMap model, final HttpServletRequest request, final HttpServletResponse response)
			throws IllegalStateException, IOException {

		if (postImage != null && postImage.getSize() > 0) {
			PostAttachment postAttachment = new PostAttachment();
			postAttachment.setName(postImage.getOriginalFilename());
			postAttachment.setMime(postImage.getContentType());
			postAttachment.setPath(attachmentPath);
			post.addPostAttachment(postAttachment);
			postImage.transferTo(new File(attachmentPath + "/" + postImage.getOriginalFilename()));
		}

		post.setCreatedDate(new Date());
		postRepository.save(post);
		return "admin/add-post";
	}
}
