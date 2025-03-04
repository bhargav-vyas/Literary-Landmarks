package com.tka.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tka.dao.UserRepository;
import com.tka.model.User;

import ch.qos.logback.classic.Logger;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;

	public User CreateUser(User user) {
		return userRepository.save(user);
	}

	public User getUserById(Long id) {
	return  userRepository.getById(id);
	}

	public List<User> getAllUser(User user) {
		return userRepository.findAll();
	}

	public User updateUserById(Long id, User userDetails) {
		Optional<User> existUser = userRepository.findById(id);
		
		if (!existUser.isPresent()) {
			throw new RuntimeException("User with ID " + id + " not found");	
		}
		User user =existUser.get();
		user.setUsername(userDetails.getUsername());
		user.setEmail(userDetails.getEmail());
		user.setPassword(userDetails.getPassword());
		user.setRole(userDetails.getRole());
		return userRepository.save(user);

		}

	public User deletUserById(Long id) {
		Optional<User> user =userRepository.findById(id);
		if (!user.isPresent()) {
			  throw new RuntimeException("User with ID " + id + " not found");
		}
		userRepository.deleteById(id);
		return user.get();
	}
			
	}
