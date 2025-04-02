package com.test.Carrefour.repository;

import java.util.List;
import java.util.Optional;

import com.test.Carrefour.model.Order;

public interface OrderRepository {
	List<Order> findAll();

	Optional<Order> findById(Long id);

	Order save(Order order);

	void deleteById(Long id);

}
