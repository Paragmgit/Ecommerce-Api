package com.example.EcommerseApi.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EcommerseApi.userModel.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
