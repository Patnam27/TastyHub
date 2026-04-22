package com.restaurant.tastyhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.tastyhub.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}