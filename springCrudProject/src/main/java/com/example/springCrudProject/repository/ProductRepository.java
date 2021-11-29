package com.example.springCrudProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springCrudProject.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	Product findByName(String name);
	
	
}
