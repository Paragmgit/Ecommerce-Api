package com.example.EcommerseApi.orderRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EcommerseApi.orderModel.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}
