package com.example.coffeeorder.repository;

import com.example.coffeeorder.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeOrderRepository extends JpaRepository<OrderEntity, Integer> {

}
