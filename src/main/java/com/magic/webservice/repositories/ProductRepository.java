package com.magic.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magic.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
