package com.chokri.Savetravels.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.chokri.Savetravels.models.Pocketbook;
import com.chokri.Savetravels.services.PocketBookService;

import jakarta.validation.Valid;

@Controller
public class PocketbookController {
	@Autowired
	private PocketBookService pocketBookService;

	// View Route - Show all the pocketbooks
	@GetMapping("/expences")
	public String allPocketBooks(Model model, @ModelAttribute("pocketbook") Pocketbook book) {
		List<Pocketbook> allPocketBooks = pocketBookService.findAll();
		model.addAttribute("listOfPocketBooks", allPocketBooks);

		return "expences.jsp";
	}
//	 view route- showone
	@GetMapping("expences/{id}")
	public String showone(Model model, @PathVariable("id") Long id,@ModelAttribute("pocketbook") Pocketbook Pocketbook ) {
		Pocketbook onePocketBook = pocketBookService.findPocketBook(id);
		model.addAttribute("onePocketBook", onePocketBook);
		return "showone.jsp";
		
	}
	

//Action Route - Create a Book
	@PostMapping("/expences")
	public String createBook(@Valid @ModelAttribute("pocketbook") Pocketbook pocketbook, BindingResult result,
			Model model) {

		List<Pocketbook> allPocketBooks = new ArrayList<>();
		if (result.hasErrors()) {
			allPocketBooks = pocketBookService.findAll();
			model.addAttribute("listOfPocketBooks", allPocketBooks);
			return "expences.jsp";
		} else {
			// save the book to DB
			Pocketbook pocketbookSaved = pocketBookService.createPocketBook(pocketbook);
			model.addAttribute("listOfPocketBooks", allPocketBooks.add(pocketbookSaved));

			return "redirect:/expences";
		}

	}

	// View Route - Edit a pocketbook
	@GetMapping("/expences/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model model) {
		// find the pocketbook with the provided id
		Pocketbook thispocketbook = pocketBookService.findPocketBook(id);
		model.addAttribute("pocketbook", thispocketbook);
//			System.out.println(thisBook.getId());
		return "edit.jsp";
	}

	// Action Route -- EDIT a pocketbook
	@PutMapping("/expences/edit/{id}")
	public String update(@Valid @ModelAttribute("pocketbook") Pocketbook pocketbook, BindingResult result) {

		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			// if there are no errors, update the pocketbook
			pocketBookService.updateBook(pocketbook);
			return "redirect:/expences";
		}

	}

	// Action Route - DELETE pocketbook
	@DeleteMapping("/expences/{id}")
	public String delete(@PathVariable("id") Long id) {
		pocketBookService.deletePocketBook(id);
		return "redirect:/expences";
	}

}
