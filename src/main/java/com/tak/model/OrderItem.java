package com.tak.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class OrderItem {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name ="order_id",referencedColumnName = "id",insertable = false, updatable = false)
	private long orderId;
	
	@ManyToOne
	@JoinColumn(name = "bookId",referencedColumnName = "id",insertable = false,updatable = false)
	private int bookId;
	
	private int quantity;
	
	private BigDecimal price;

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItem(int id, long orderId, int bookId, int quantity, BigDecimal price) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.bookId = bookId;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", orderId=" + orderId + ", bookId=" + bookId + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	

}
