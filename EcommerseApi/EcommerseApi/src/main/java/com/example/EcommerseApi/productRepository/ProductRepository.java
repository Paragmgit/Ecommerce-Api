package com.example.EcommerseApi.productRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EcommerseApi.productModel.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	List<Product> findByCategory(String category);

}
