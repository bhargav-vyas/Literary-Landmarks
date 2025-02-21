package com.tka.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.antlr.v4.runtime.misc.NotNull;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name ="`order`")
public class Order {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long  id;
	@ManyToOne(cascade = CascadeType.PERSIST) 
	@JoinColumn(name ="userid", nullable =false)
	private User user;
	private BigDecimal totalamount ;
	
		private LocalDate orderdate;
	private String status;
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}


	public Order(long id, User user, BigDecimal totalamount, LocalDate orderdate, String status) {
		super();
		this.id = id;
		this.user = user;
		this.totalamount = totalamount;
		this.orderdate = orderdate;
		this.status = status;
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


	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", totalamount=" + totalamount + ", orderdate=" + orderdate
				+ ", status=" + status + "]";
	}
	
}
	