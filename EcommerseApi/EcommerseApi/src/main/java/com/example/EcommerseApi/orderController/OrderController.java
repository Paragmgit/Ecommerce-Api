package com.example.EcommerseApi.orderController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcommerseApi.addressModel.Address;
import com.example.EcommerseApi.addressService.AddressService;
import com.example.EcommerseApi.orderModel.Order;
import com.example.EcommerseApi.orderService.OrderService;
import com.example.EcommerseApi.productModel.Product;
import com.example.EcommerseApi.productService.ProductService;
import com.example.EcommerseApi.userModel.User;
import com.example.EcommerseApi.userService.UserService;

@RestController
public class OrderController {
	
	    @Autowired
	    private UserService userService;

	    @Autowired
	    private ProductService productService;

	    @Autowired
	    private AddressService addressService;

	    @Autowired
	    private OrderService orderService;

	    @PostMapping("/users")
	    public ResponseEntity<User> createUser(@RequestBody User user) {
	        User savedUser = userService.createUser(user);
	        return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
	    }

	    @PostMapping("/products")
	    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
	        Product savedProduct = productService.createProduct(product);
	        return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
	    }

	    @PostMapping("/addresses")
	    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
	        Address savedAddress = addressService.createAddress(address);
	        return new ResponseEntity<>(savedAddress,HttpStatus.CREATED);
	    }

	    @PostMapping("/orders")
	    public ResponseEntity<Order> createOrder(@RequestBody Order orderRequest) {
	        Order savedOrder = orderService.createOrder(orderRequest);
	        return new ResponseEntity<>(savedOrder,HttpStatus.CREATED);
	    }

	    @GetMapping("/orders/{id}")
	    public ResponseEntity<Order> getOrderById(@PathVariable Integer id) {
	        Order order = orderService.getOrderById(id);
	        if (order != null) {
	            return new ResponseEntity<>(order,HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(order,HttpStatus.NOT_FOUND);
	        }
	    }

	    @GetMapping("/users/{id}")
	    public ResponseEntity<Optional<User>> getUserById(@PathVariable Integer id) {
	        Optional<User> user = userService.getUserById(id);
	        if (user != null) {
	            return new ResponseEntity<>(user,HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @GetMapping("/products")
	    public ResponseEntity<List<Product>> getAllProducts() {
	        List<Product> products = productService.getAllProducts();
	        return new ResponseEntity<>(products,HttpStatus.OK);
	    }

	    // Get products based on category
	    @GetMapping("/products/category")
	    public ResponseEntity<List<Product>> getProductsByCategory(@RequestParam String category) {
	        List<Product> products = productService.getProductsByCategory(category);
	        return new ResponseEntity<>(products,HttpStatus.OK);
	    }

	    // Delete a product by product id
	    @DeleteMapping("/products/{id}")
	    public ResponseEntity<Void> deleteProductById(@PathVariable Integer id) {
	        productService.deleteProductById(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
