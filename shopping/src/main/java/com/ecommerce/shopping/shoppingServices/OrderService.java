package com.ecommerce.shopping.shoppingServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.shopping.shoppingModels.Orders;
import com.ecommerce.shopping.shoppingRepository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository OrderRepo;
	
	public void save(Orders order) {
		OrderRepo.save(order);
		
	}
	
}
