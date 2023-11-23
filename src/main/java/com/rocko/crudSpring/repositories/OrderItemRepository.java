package com.rocko.crudSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocko.crudSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
