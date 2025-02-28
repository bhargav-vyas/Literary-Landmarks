package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Service.UserService;
import com.tka.model.User;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/User")
public class UserController {
	@Autowired UserService usertService;
	
	@PostMapping("/add")
	private User  CreateUser(@Valid  @RequestBody User user) {
		return usertService.CreateUser(user) ;
		
	}

}
