package com.chokri.bookclub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import com.chokri.bookclub.models.Book;
import com.chokri.bookclub.models.User;
import com.chokri.bookclub.services.BookService;
import com.chokri.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	@Autowired
	private UserService userService;

	// VEW ROUTES
	// Show all the books
	@GetMapping("/books")
	public String books(Model model, @ModelAttribute("book") Book book, HttpSession session) {

//			// Grab  the user id from session
//			
//			Long userId=(Long) =(Long) Session.
//			// ROUTE GUARDE

		List<Book> allBooks = bookService.findAll();
		model.addAttribute("listOfBooks", allBooks);
		return ("/books.jsp");

	}

	// View route Create a book
	@GetMapping("/books/new")
	public String createBook(@ModelAttribute("book") Book book) {
		return "/new.jsp";
	}

	// Action Route - Create a Book
	@PostMapping("/books/new")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model,
			HttpSession session) {

		if (result.hasErrors()) {
			return "new.jsp";
		} else {
			Long userId = (Long) session.getAttribute("user_id");
			User user = userService.findById(userId).get();
			book.setPostedBy(user);
			bookService.createBook(book);
			return "redirect:/books";
		}

	}

	
	// showOne 
	@GetMapping("/books/show/{id}")
	public String showOne( @PathVariable("id") long id,  Model model, HttpSession session) {
		Book book = bookService.findBook(id);
		model.addAttribute("oneBook",book);
		
		return "showone.jsp";
	}
	
	

}