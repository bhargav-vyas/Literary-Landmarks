package com.tka.Service;
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
	

}
