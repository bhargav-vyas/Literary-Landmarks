package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Service.OrderService;
import com.tka.model.Order;

@RestController
@RequestMapping("/Order")
public class OrderController {
	@Autowired
 private OrderService orderService;
	
	@PostMapping("/add")
	public Order CreateOrder(@RequestBody Order order) {
		System.out.println(1);
		return orderService.addOrder(order);
	 	}
	@GetMapping("/add/{Id}")
	public List<Order> getallorder(@PathVariable Long Id){
		return orderService.getAllorder(Id);
		
	}
	

}
