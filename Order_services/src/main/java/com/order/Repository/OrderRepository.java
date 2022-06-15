package com.order.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.Entity.Order;



public interface OrderRepository extends JpaRepository <Order, Integer> {

}
