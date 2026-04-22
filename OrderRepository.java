package com.restaurant.tastyhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.tastyhub.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}