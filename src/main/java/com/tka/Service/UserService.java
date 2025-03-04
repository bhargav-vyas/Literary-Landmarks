package com.tka.Service;
import java.util.List;
import java.util.Optional;

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

	public User updateUserById(Long id, User userDetials) {
		Optional<User> existUser = userRepository.findById(id);
		
		if (existUser.isPresent()) {
			User user =existUser.get();
			user.setUsername(userDetials.getUsername());
			user.setEmail(userDetials.getEmail());
			user.setPassword(userDetials.getPassword());
			user.setRole(userDetials.getRole());
			user.setId(userDetials.getId());
			return userRepository.save(user);
		}else {
			throw new RuntimeException(" "+ id +"not foud");
		}
		
		
	}
	

}
