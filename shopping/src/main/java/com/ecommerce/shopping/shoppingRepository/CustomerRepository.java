package com.ecommerce.shopping.shoppingRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.shopping.shoppingModels.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
