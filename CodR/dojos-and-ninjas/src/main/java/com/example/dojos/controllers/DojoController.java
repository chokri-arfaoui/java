package com.example.dojos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojos.models.Dojo;
import com.example.dojos.services.DojoService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class DojoController {

	@Autowired
	private DojoService dojoService;

	// VEW ROUTES
	// Show all the dojos
	@GetMapping("/dojos")
	public String getAllDojos(Model model, @ModelAttribute("dojo") Dojo dojo, HttpSession session) {

		List<Dojo> allDojos = dojoService.findAll();
		model.addAttribute("listOfDojos", allDojos);
		return ("/dojos.jsp");

	}

	// View route Create a dojo
	@GetMapping("/dojos/new")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/new.jsp";
	}

	// Action Route - Create a Dojo
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model,
			HttpSession session) {

		if (result.hasErrors()) {
			return "newDojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos";
		}

	}

}
