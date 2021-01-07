package com.ecommerce.shopping.shoppingRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shopping.shoppingModels.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer>{

}
