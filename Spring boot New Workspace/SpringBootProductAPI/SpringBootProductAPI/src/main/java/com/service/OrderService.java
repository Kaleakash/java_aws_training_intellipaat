package com.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Order;
import com.bean.Product;
import com.repository.OrderRepository;
import com.repository.ProductRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	ProductService productService;
	
	public String placeOrder(Order order) {
		Product pp= productService.findProductById(order.getPid());
		if(pp != null) {
			order.setOrderDate(LocalDate.now());   // it provide current date.
			int availableQuantiy = productService.findProductQuantity(order.getPid());
			if(availableQuantiy>=order.getNumberOfQuanity()) {
					productService.updateProductQuantity(order.getPid(),order.getNumberOfQuanity());	
					orderRepository.save(order);
					return "Order placed successfully";
			}else {
				return "InSufficient Quantity";	
			}
		
		}else {
			return "PId is not present";
		}
	}
	
	public List<Order> findAllOrderDetails() {
		return orderRepository.findAll();
	}
	
	public Order findOrderByOrderId(int oid) {
		//return orderRepository.findById(oid).get();
		Optional<Order> result = orderRepository.findById(oid);
		if(result.isPresent()) {
			return result.get();
		}else {
			return null;
		}
	}
	
	public List<Order> findOrderDetailsByPId(int pid){
		return orderRepository.findAllOrderByPId(pid);
	}
}
