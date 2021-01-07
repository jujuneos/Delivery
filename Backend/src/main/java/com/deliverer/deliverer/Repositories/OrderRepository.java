package com.deliverer.deliverer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverer.deliverer.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
