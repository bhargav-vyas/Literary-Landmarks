package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.model.OrderItem;

public interface OrderIteamRepository extends JpaRepository<OrderItem, Long > {
  
}
   