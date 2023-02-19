package com.example.EcommerseApi.userService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerseApi.userModel.User;
import com.example.EcommerseApi.userRepository.UserRepository;

@Service
public class UserService {
  
	@Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

	public Optional<User> getUserById(Integer id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}
}
