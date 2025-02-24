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

	public String deletById(Long id) {
		try {
			if (orderRepository.getById(id) != null) {
				orderRepository.deleteById(id);		
				return "order with Id "  + id +" has been  deleted successful"
						+ " ";
			}
			else {
				return"order with Id" + id +" not found ";
			}
		} catch (Exception e) {
			return "error to deleting this  order"+e.getMessage();
		}
			
		}
	}
		
	
