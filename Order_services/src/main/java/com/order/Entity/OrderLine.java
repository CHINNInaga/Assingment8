package com.order.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderLine {
	@Id
	@Column(name="orderline_id")
	private Integer orderLineId;
	private String item;
	private float price;
	private int quantity;
	private int eta;
	private OrderLineStatus status;
	
	
	public Integer getOrderLineId() {
		return orderLineId;
	}
	public void setOrderLineId(Integer orderLineId) {
		this.orderLineId = orderLineId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public OrderLineStatus getStatus() {
		return status;
	}

	public void setStatus(OrderLineStatus open) {
		this.status = status;
		
	}
	
	
	
	
	}
	
	


