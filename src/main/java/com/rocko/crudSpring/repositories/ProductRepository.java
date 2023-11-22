package com.rocko.crudSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocko.crudSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
