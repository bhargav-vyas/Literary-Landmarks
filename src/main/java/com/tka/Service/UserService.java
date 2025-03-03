package com.tka.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tka.dao.UserRepository;
import com.tka.model.User;

@Service
public class UserService {
@Autowired
 public UserRepository userRepository;

	public User CreateUser(User user) {
		return userRepository.save(user);
	}

	public User getUserById(Long id) {
	return  userRepository.getById(id);
	}

	public List<User> getAllUser(User user) {
		return userRepository.findAll();
	}
	

}
