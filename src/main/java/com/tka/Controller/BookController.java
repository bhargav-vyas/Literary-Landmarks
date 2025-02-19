package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Book createbook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@GetMapping("/{Id}")
	public ResponseEntity<?> findById(@PathVariable Long Id) {
		return bookService.findById(Id);

	}

	@DeleteMapping("/{Id}")
	public String deletBookById(@PathVariable Long Id) {
		return bookService.deletBookById(Id);

	}
	@PutMapping("/update/{Id}")
	public String udateBook(@PathVariable Long Id ,@RequestBody Book bookDetails) {
		return bookService.updateBookById(Id, bookDetails);
	}
}