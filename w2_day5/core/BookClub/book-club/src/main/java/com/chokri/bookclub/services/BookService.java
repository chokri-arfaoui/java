package com.chokri.bookclub.services;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chokri.bookclub.models.Book;
import com.chokri.bookclub.repositories.BookRepository;


@Service
public class BookService {
	
	@Autowired
	private BookRepository bookrepository;
	
	// READ ALL
		public List<Book> findAll(){
			return bookrepository.findAll();
		}
		
		// CREATE
		public Book createBook(Book book) {
			return bookrepository.save(book);
		}
		
		// READ ONE 
		public Book findBook(Long id) {
			Optional<Book> maybeBook = bookrepository.findById(id);
			if(maybeBook.isPresent()) {
				return maybeBook.get();
			}else { 
				return null;
			}
		}
		
		// UPDATE 
		public Book updateBook(Book book) {
			return bookrepository.save(book);
		}
		
		// DELETE
		public void deleteBook(Long id) {
			bookrepository.deleteById(id);
		}

		public Book findBookById(Long id) {
			return bookrepository.findById(id).orElseThrow();
		}
	

}
