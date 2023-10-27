package com.magic.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magic.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
