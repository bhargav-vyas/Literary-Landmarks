package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Service.OrderIteamService;
import com.tka.model.OrderItem;

import jakarta.persistence.Entity;
@RestController
@RequestMapping("/OrderIteam")
public class OrderIteamController {
	@Autowired
	private OrderIteamService orderIteamService ;
	 
	
	@PostMapping("/add")
	private OrderItem addOrderIteam(@RequestBody OrderItem orderItem) {
		return orderIteamService.addOrderIteam(orderItem);
		
	}
	
	
	
	@GetMapping("/get/{Id}")
	private  OrderItem  getOrderById(@PathVariable Long Id) {
		return orderIteamService. getOrderById(Id);
		
	}

}
