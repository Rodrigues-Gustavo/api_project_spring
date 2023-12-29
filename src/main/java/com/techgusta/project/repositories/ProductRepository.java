package com.techgusta.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techgusta.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
