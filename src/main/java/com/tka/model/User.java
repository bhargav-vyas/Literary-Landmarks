package com.tka.model;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.BatchSize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
//	@NotBlank(message="Username cannot be blank.")
//	 @Size(min = 6, message = "Password must have at least 6 characters")
	private String username;
//	@NotBlank(message="Username cannot be blank.")
//	 @Size(min = 6, message = "Password must have at least 6 characters")
	private String password;
//	  @Email(message = "Invalid email format")
	@Column(unique = true)
	private  String email;
	
	private String  role;

	 public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long id, String username, String password, String email, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", role="
				+ role + "]";
	}
}