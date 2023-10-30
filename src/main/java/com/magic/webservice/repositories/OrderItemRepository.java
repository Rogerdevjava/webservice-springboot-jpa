package com.magic.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magic.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

