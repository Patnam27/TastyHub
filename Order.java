package com.restaurant.tastyhub.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemName;
    private double price;
    public Long getId() {
    	return id;
    }
    public void setId(Long id) {
    	this.id = id;
    }
    public String getterName() {
    	return itemName;
    }
    public void setItemName(String itemName) {
    	this.itemName = itemName;
    }
    public double getPrice() {
    	return price;
    }
    public void setPrice(double price) {
    	this.price = price;
    }

   }