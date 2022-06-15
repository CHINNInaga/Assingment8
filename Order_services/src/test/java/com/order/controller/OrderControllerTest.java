package com.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.order.Entity.Order;
import com.order.services.OrderServices;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	
	@InjectMocks
	OrderController orderController;
	@Mock
	OrderServices orderServives;

	@Test
	public void getOrderbyIdTest() {
	int id=20;
	Order order=new Order();
	when(OrderServices.getOrder(id)).thenReturn(order);

	
	//orderController.getOrder(id);
	 }

	@Test
	public void getOrderbyIdTestNull() {
	Integer id=9;
	Order order=new Order();
	when(OrderServices.getorder(orderId)).thenReturn(null);
    // orderController.getOrder(orderId);
	}

    @Test
	public void getOrderbyPinTest() {
	int pin=20;
	List<Order> order=new ArrayList();
	when(OrderServices.getorder(orderPincode)).thenReturn(order);
     //orderController.getOrder(orderPincode);
	


	}
	}

