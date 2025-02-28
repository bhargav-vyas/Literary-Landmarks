package com.tka.model;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Book {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)

	 private long  id;
	 private  String title;
	 private String  author; 
	 private  BigDecimal price;
	 private int  stock;
	 private  String genre;
	 
	
	 
	 
	 @ManyToOne
	 @JoinColumn(name="order_id")
	 private Order order;
	 
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long id, String title, String author, BigDecimal price, int stock, String genre , Order order) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
		this.genre = genre;
		this.order =order;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", stock=" + stock
				+ ", genre=" + genre + "]";
	}

	 
	 
}