package com.ecommerce.shopping.shoppingModels;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Orders1")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderID;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="Customer1_customerID", nullable=false)
	@JsonBackReference
	private Customer customer;
	private String orderDetail; 
	private String orderDate;
	private Double orderAmount;
	
	
	public Orders(int orderID, Customer customer, String orderDetail, String orderDate, Double orderAmount) {
		super();
		this.orderID = orderID;
		this.customer = customer;
		this.orderDetail = orderDetail;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	
	public Orders() {
		
		
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "Orders [orderID=" + orderID + ", customer=" + customer + ", orderDetail=" + orderDetail
				+ ", orderDate=" + orderDate + ", orderAmount=" + orderAmount + "]";
	}
	
	
	
}
