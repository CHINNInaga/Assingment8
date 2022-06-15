package com.order.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.Entity.Order;
import com.order.services.OrderServices;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderServices services;
	@PostMapping("/saveorder")
	public Order saveorder(@Valid @RequestBody Order order) {
		return services.saveOrder(order);
		}
	@GetMapping("/getOrderDetails/{orderId}")
	public Order getorder(@Valid @PathVariable Integer orderId ) {
		return services.getorder(orderId);
		}
	@GetMapping("/getOrderDetails/{orderPincode}")
	private Order getOrder(@Valid @PathVariable Integer orderPincode) {
		return services.getorder(orderPincode);
	}
		

	}
	


