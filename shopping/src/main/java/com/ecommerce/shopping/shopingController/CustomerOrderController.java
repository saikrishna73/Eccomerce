package com.ecommerce.shopping.shopingController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.shopping.shoppingModels.Customer;
import com.ecommerce.shopping.shoppingModels.Orders;
import com.ecommerce.shopping.shoppingServices.CustomerService;
import com.ecommerce.shopping.shoppingServices.OrderService;

@RestController
public class CustomerOrderController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	OrderService ordeService;
	
	@PostMapping("/CustomerSave")
	public ResponseEntity<String> saveCustomers(@RequestBody Customer customer){
		
		customerService.save(customer);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}
	
	@PostMapping("/OrderSave")
	public ResponseEntity<String> saveCustomers(@RequestBody Orders order){
		
		ordeService.save(order);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}
	
	@GetMapping("/getCustomersWithOrder")
	public List<Customer> getCustomer(){
		
		return customerService.getCustomers();
		
	}
	
	@PostMapping("/getCountWords")
	public String getWords(@RequestBody String str){
		
		return str.split(" ").length+"";
		
	}

}
