package com.dev.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.entities.Contact;
import com.dev.repositories.ContactRepository;

@Controller
public class AdminContactController {
	@Autowired
	ContactRepository contactRepository;

	@RequestMapping(value = { "/admin/list-contact" }, method = { RequestMethod.GET })
	public String listContact(final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		List<Contact> contacts = contactRepository.findAll();
		model.addAttribute("contacts", contacts);
		return "admin/list-contact";
	}

	// edit contact
	@RequestMapping(value = { "/admin/edit-contact/{contactId}" }, method = { RequestMethod.GET })
	public String editContact(@PathVariable int contactId, final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		Contact contact = contactRepository.getOne(contactId);
		model.addAttribute("contact", contact);
		return "admin/edit-contact";
	}

	@RequestMapping(value = { "/admin/edit-contact" }, method = { RequestMethod.POST })
	public String saveEditContact(@ModelAttribute("contact") Contact contact, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse response) {
		contactRepository.save(contact);
		model.addAttribute("status", "success");
		return listContact(model, request, response);
	}
}
