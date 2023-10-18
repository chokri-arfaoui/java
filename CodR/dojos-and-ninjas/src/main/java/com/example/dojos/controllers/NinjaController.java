package com.example.dojos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.dojos.models.Ninja;
import com.example.dojos.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("dojo/{id}")
	public String getNinjaByDojo(@ModelAttribute("id") long id, Model model){
		
		List<Ninja> ninjas = ninjaService.findByDojoId(id);
		
		model.addAttribute("ninjas",ninjas);
		return "redirect:/dojos";
		
		
		
	}

}
