package com.tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.OrderRepository;
import com.tka.model.Order;
@Service
public class OrderService {
	@Autowired
	public OrderRepository  orderRepository;
	

	public Order addOrder(Order order) {
		System.out.println("1");
		return orderRepository.save(order);
		
	}

	public Order getAllorder(Long id) {
		return orderRepository.getById(id);
	}

}
