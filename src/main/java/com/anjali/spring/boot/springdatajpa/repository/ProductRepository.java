package com.anjali.spring.boot.springdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.anjali.spring.boot.springdatajpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByName(String name);
	List<Product> findByNameAndPrice(String name, Double price);
}
