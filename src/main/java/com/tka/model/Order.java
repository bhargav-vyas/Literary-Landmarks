package com.tka.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "userid", nullable = false)
	private User user;
	private BigDecimal totalamount;
	@OneToMany(cascade = CascadeType.DETACH , orphanRemoval = true, mappedBy = "order" )
	 private List<Book> book;
	
	private LocalDate orderdate;
	private String status;
	private BigDecimal quantity;

	
 public Order() {
	// TODO Auto-generated constructor stub
}

public Order(long id, User user, BigDecimal totalamount , LocalDate orderdate, String status,
		BigDecimal quantity) {
	super();
	this.id = id;
	this.user = user;
	this.totalamount = totalamount;
	
	this.orderdate = orderdate;
	this.status = status;
	this.quantity = quantity;
	
	
	
	
	
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public BigDecimal getTotalamount() {
	return totalamount;
}

public void setTotalamount(BigDecimal totalamount) {
	this.totalamount = totalamount;
}





@Override
public String toString() {
	return "Order [id=" + id + ", user=" + user + ", totalamount=" + totalamount + ", book=" + book + ", orderdate="
			+ orderdate + ", status=" + status + ", quantity=" + quantity + "]";
}

public List<Book> getBook() {
	return book;
}

public void setBook(List<Book> book) {
	this.book = book;
}

public BigDecimal getQuantity() {
	return quantity;
}

public void setQuantity(BigDecimal quantity) {
	this.quantity = quantity;
}

public LocalDate getOrderdate() {
	return orderdate;
}

public void setOrderdate(LocalDate orderdate) {
	this.orderdate = orderdate;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}





 
}