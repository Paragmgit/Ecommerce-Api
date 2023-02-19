package com.example.EcommerseApi.orderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EcommerseApi.addressModel.Address;
import com.example.EcommerseApi.addressRepository.AddressRepository;
import com.example.EcommerseApi.orderModel.Order;
import com.example.EcommerseApi.orderRepository.OrderRepository;
import com.example.EcommerseApi.productModel.Product;
import com.example.EcommerseApi.productRepository.ProductRepository;
import com.example.EcommerseApi.userModel.User;
import com.example.EcommerseApi.userRepository.UserRepository;

@Service
public class OrderService {

	    @Autowired
	    private OrderRepository orderRepository;

	    @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private ProductRepository productRepository;

	    @Autowired
	    private AddressRepository addressRepository;

	    public Order getOrderById(Integer orderId) {
	        return orderRepository.findById(orderId).get();
	    }

		public Order createOrder(Order orderRequest) {
			User user = userRepository.findById(orderRequest.getId()).get();
			Integer id = orderRequest.getProduct().getId();
	        Product product = productRepository.findById(id).get();
	        Address address = addressRepository.findById(orderRequest.getAddress().getId()).get();
	        Order order = new Order();
	        order.setUser(user);
	        order.setProduct(product);
	        order.setAddress(address);
	        order.setProductQuantity(orderRequest.getProductQuantity());

	        return orderRepository.save(orderRequest);
		}
}
