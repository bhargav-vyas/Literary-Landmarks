package com.tka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.OrderIteamRepository;
import com.tka.model.OrderItem;
@Service
public class OrderIteamService {
	@Autowired
	private OrderIteamRepository orderIteamRepository;

	public OrderItem getOrderById(Long id) {
		return orderIteamRepository.getById(id);
	}

	public OrderItem addOrderIteam(OrderItem orderItem) {
		return orderIteamRepository.save(orderItem);
	}
}
