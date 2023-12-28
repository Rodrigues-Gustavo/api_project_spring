package com.techgusta.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techgusta.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
