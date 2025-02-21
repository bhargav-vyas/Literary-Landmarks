package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Service.OrderService;
import com.tka.model.Order;
@Controller
@RestController("/Order")
public class OrderController {
	@Autowired
 private OrderService orderService;
	
	@PostMapping("/add")
	public String  CreateOrder(@RequestBody Order order) {
		orderService.addOrder(order);
		return "the order added succesufully";
	}

}
