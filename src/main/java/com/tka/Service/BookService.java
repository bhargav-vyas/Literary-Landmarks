package com.tka.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tka.dao.BookRepository;
import com.tka.model.Book;

import jakarta.persistence.EntityNotFoundException;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	public ResponseEntity<?> findById(Long Id) {
	    Optional<Book> bookOptional = bookRepository.findById(Id);
	    
	    if (bookOptional.isPresent()) {
	        return ResponseEntity.ok(bookOptional.get());
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid BookId: " + Id);
	    }
	}


	public String deletBookById(Long Id) {
		try {
			Book book = bookRepository.getById(Id);
			bookRepository.deleteById(Id);
			return " Book with Id " + Id + " deleted Successfully ";
		} catch (EntityNotFoundException e) {
			return " Book With Id" + Id + "Not found ";

		}
	}
 
	public String updateBookById(Long id, Book bookDetails) {
		
		try {
				Book existingBook =bookRepository.getById(id);
				existingBook.setTitle(bookDetails.getTitle());
				existingBook.setAuthor(bookDetails.getAuthor());
				existingBook.setGenre(bookDetails.getGenre());
				existingBook.setPrice(bookDetails.getPrice());
				existingBook.setStock(bookDetails.getStock());	
				bookRepository.save(existingBook);
				return " Book with ID "+ id + " update Successfully! ";
			 } catch (Exception e) {
				return" Book With ID "+ id +" not found ";
			 }
				
			}
	
		}