package com.tka.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tka.model.Order;
@Repository
public  interface  OrderRepository extends  JpaRepository<Order, Long> {

	
	
	

}
