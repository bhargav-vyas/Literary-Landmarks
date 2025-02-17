package com.tak.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Order {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long  id;
	private  long userid;
	private long totalamount ;
	
	private LocalDate orderdate;
	
	private String status;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(long id, long userid, long totalamount, LocalDate orderdate, String status) {
		super();
		this.id = id;
		this.userid = userid;
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

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public long getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(long totalamount) {
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
		return "Order [id=" + id + ", userid=" + userid + ", totalamount=" + totalamount + ", orderdate=" + orderdate
				+ ", status=" + status + "]";
	}
	

}
