package com.techgusta.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techgusta.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
