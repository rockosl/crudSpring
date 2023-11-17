package com.rocko.crudSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocko.crudSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
