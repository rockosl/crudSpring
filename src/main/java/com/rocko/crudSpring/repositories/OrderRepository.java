package com.rocko.crudSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocko.crudSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
