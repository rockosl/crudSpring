package com.rocko.crudSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocko.crudSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
