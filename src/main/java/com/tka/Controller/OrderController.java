package com.tka.Controller;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		
		System.out.println(order);
		System.out.println(1);
		return orderService.addOrder(order);
	 	}
	@GetMapping("/get/{id}")
	public Order  getallorder(@PathVariable Long id){
		return orderService.getAllorder(id);
		
	}
	@DeleteMapping("/delet/{id}")
	public  String deletById(@PathVariable Long id) {
		return orderService.deletById(id);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Order>>getAllOrders(){
		List<Order> orders =orderService.getAllorder();
		return new ResponseEntity<>(orders,HttpStatus.OK);
	}

	
	

}
