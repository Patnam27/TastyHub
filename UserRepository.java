package com.restaurant.tastyhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.tastyhub.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}