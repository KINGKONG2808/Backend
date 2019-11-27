package com.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.entities.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
}
