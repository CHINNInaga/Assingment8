package com.order.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.order.Entity.Address;
import com.order.Entity.Order;
import com.order.Entity.OrderLine;
import com.order.Entity.OrderStatus;
import com.order.Entity.OrderLineStatus;
import com.order.Repository.OrderRepository;
@SpringBootTest
class OrderServicesTest {
    
	@Autowired
	private OrderServices service;
    @MockBean
    private OrderRepository repo;
    private Address address;
    private Order order;
    private OrderLine orderLine;
	
    @Test
    void testSaveOrder() {

       address = new Address();
       order = new Order();
       orderLine = new OrderLine();

       address.setAddressId(1);
       address.setCity("atp");
       address.setCountry("india");
       address.setPin("111111");

       orderLine.setOrderLineId(2);
       orderLine.setItem("laptop");
       orderLine.setPrice(60000);
       orderLine.setQuantity(1);
       orderLine.setEta(2);
       orderLine.setStatus(OrderLineStatus.open);


       List<OrderLine> orderlinesList = new ArrayList<>();
       orderlinesList.add(orderLine);

       order.setOrderId(3);
       order.setTotalAmount(60000);
       order.setOrderDate("01-01-2022");
       order.setOrderStatus(OrderStatus.open);
       order.setAddress(address);
       order.setOrderlines(orderlinesList);

       Mockito.when(repo.save(order)).thenReturn(order);
       assertThat(service.saveOrder(order)).isEqualTo(order);
   }

    @Test
    void testGetOrdersByPincodeWithMatchingValue() {

    address = new Address();
    order = new Order();
    orderLine = new OrderLine();

    address.setAddressId(1);
    address.setCity("atp");
    address.setCountry("india");
    address.setPin("111111");

    orderLine.setOrderLineId(2);
    orderLine.setItem("laptop");
    orderLine.setPrice(60000);
    orderLine.setQuantity(1);
    orderLine.setEta(2);
    orderLine.setStatus(OrderLineStatus.open);


    List<OrderLine> orderlinesList = new ArrayList<>();
    orderlinesList.add(orderLine);

    order.setOrderId(3);
    order.setTotalAmount(60000);
    order.setOrderDate("01-01-2022");
    order.setOrderStatus(OrderStatus.open);
    order.setAddress(address);
    order.setOrderlines(orderlinesList);

    List<Order> ordersList = new ArrayList<>();
    ordersList.add(order);

    Integer pincode = (111111);
    Mockito.when(repo.findAll()).thenReturn(ordersList);
    }
}

//    List<Order> resultingOrdersList = orderService.getOrdersByPincode(pincode);
//    assertEquals(pincode,resultingOrdersList.get(0).getAddress().getPin() );
//
//}



