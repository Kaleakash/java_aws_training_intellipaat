package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Order;
import com.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping(value="placeOrder",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String placeOrder(@RequestBody Order order) {
		System.out.println(order);
		return orderService.placeOrder(order);
	}
	// http://localhost:8080/orders/orderHistoryByPid/100
	
	@GetMapping(value = "orderHistoryByPid/{pid}")
	public List<Order> findOrderDetailsUsingProductId(@PathVariable("pid") int pid){
		return orderService.findOrderDetailsByPId(pid);
	}
	
	@GetMapping(value = "orderHistoryByPid/{oid}")
	public Order findOrderDetailsUsingOrderId(@PathVariable("oid") int oid){
		return orderService.findOrderByOrderId(oid);
	}
}


