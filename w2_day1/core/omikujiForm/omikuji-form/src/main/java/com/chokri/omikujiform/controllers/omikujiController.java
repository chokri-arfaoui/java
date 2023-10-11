package com.chokri.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
@Controller
//view route
public class omikujiController {
	@RequestMapping("/omikuji")
	public String omikuji() {
		
		return"omikuji.jsp";
		
		
	}
//	Action Route
	@RequestMapping(value="/process",method =RequestMethod.POST)
	public String omikuji(
			@RequestParam("year")Integer year,
			@RequestParam("city")String city,
			@RequestParam("person")String person,
			@RequestParam("hobby")String hobby,
			@RequestParam("thing")String Thing ,
			@RequestParam("message")String message,
			
			HttpSession session
			) {
		session.setAttribute("year", year);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", Thing);
		session.setAttribute("message", message);
		
		
		return "redirect:/omikuji/show";
		
	}
	//Method To Show Info about OMIKUJI
		@RequestMapping("/omikuji/show")
		public String show() {
			return "show.jsp";
		}
}
