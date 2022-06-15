package com.order.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.Entity.Order;
import com.order.Repository.OrderRepository;

@Service
public class OrderServices {
	@Autowired
	private OrderRepository repo;
	public Order saveOrder(Order order) {
		return repo.save(order);
	}
	public Order getorder( Integer orderId) {
		Order o = new Order();
		return repo.findById(orderId).get();
	}


}
