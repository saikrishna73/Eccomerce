package com.ecommerce.shopping.shoppingServices;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.shopping.shoppingModels.Customer;
import com.ecommerce.shopping.shoppingRepository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	public void save(Customer customer) {
		customerRepo.save(customer);
		
	}

	public List<Customer> getCustomers() {
		List<Customer> li = customerRepo.findAll();
		System.out.println(li);
		 Comparator<Customer> byName = 
			        (Customer o1, Customer o2)->o1.getCustomerName().compareTo(o2.getCustomerName());
			        
		Collections.sort(li, byName);
		return li;
	}
	
}
