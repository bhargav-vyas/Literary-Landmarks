package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.model.User;

public interface UserRepository  extends JpaRepository<User,Long>{

}
