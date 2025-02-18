package com.tka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.BookRepository;
import com.tka.model.Book;

import jakarta.persistence.EntityNotFoundException;

@Service
public class BookService {
		@Autowired
		private BookRepository bookRepository;

		public Book addBook(Book book) {
			return bookRepository.save(book) ;
		}

		public Book findById(Long Id) {
						Book book= bookRepository.getById(Id);
						try {

			book.getId();
				return book;
			
			} catch (EntityNotFoundException e) {
				throw new  IllegalArgumentException("Sorry Book WithId"+ Id + "Not found");                        
				 
			}
			
		
		}

	}


