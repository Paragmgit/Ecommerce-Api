package com.example.EcommerseApi.productService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerseApi.productModel.Product;
import com.example.EcommerseApi.productRepository.ProductRepository;

@Service
public class ProductService {
  
	    @Autowired
	    private ProductRepository productRepository;

	    public Product createProduct(Product product) {
	        return productRepository.save(product);
	    }

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	    public List<Product> getProductsByCategory(String category) {
	        return productRepository.findByCategory(category);
	    }

	    public void deleteProductById(Integer id) {
	        productRepository.deleteById(id);
	    }

}
