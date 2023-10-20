package com.magic.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magic.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
