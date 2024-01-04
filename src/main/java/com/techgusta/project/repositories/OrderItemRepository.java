package com.techgusta.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techgusta.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
