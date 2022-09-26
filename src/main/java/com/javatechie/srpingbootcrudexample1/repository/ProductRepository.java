package com.javatechie.srpingbootcrudexample1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.srpingbootcrudexample1.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	Product findByName(String name);
}
