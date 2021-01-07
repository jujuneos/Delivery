package com.deliverer.deliverer.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverer.deliverer.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByOrderByNameAsc();
}
