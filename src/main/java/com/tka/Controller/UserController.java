package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	
	@GetMapping("/getuser/{id}")
	private User getUserById(@PathVariable Long id) {
		return usertService.getUserById(id);
	}

	@GetMapping("/getall")
	private List<User> getAllUser(@RequestBody User user){
		return usertService.getAllUser(user);
		
	}
	@DeleteMapping("/delet/{id}")
	private User deletUserById(@PathVariable Long id) {
		return usertService.deletUserById(id);
	}
	
	
	@PostMapping("/add")
	private User  CreateUser(@Valid  @RequestBody User user) {
		return usertService.CreateUser(user) ;
	}
	@PutMapping("/update/{id}")
	private User updateUserById(@PathVariable Long id , @RequestBody User userDetials) {
		return usertService.updateUserById(id,userDetials);	
	}
	
}
