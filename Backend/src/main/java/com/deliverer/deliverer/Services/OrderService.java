package com.deliverer.deliverer.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deliverer.deliverer.Repositories.OrderRepository;
import com.deliverer.deliverer.dto.OrderDTO;
import com.deliverer.deliverer.entities.Order;

@Service
public class OrderService {
	 
	@Autowired
	private OrderRepository repository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findAll();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}
