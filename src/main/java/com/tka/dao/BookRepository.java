package com.tka.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tka.model.Book;
@Repository
public  interface BookRepository  extends JpaRepository<Book , Long>{
	

}
