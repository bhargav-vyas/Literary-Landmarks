package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Service.BookService;
import com.tka.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;

	@PostMapping("/add")
	public  Book createbook(@RequestBody  Book book ) {
		return bookService.addBook(book);
	}
	@GetMapping("/{Id}")
	public Book  findById(@PathVariable Long Id) {
		Book book = bookService.findById(Id);
		if (book!=null) {
			return book;
			
		} else {
			throw new IllegalArgumentException("Book with id"+Id+ "not found");
		}		
		}
		
	}
