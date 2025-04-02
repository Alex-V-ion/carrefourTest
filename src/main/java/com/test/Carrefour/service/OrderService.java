package com.test.Carrefour.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.Carrefour.model.Order;
import com.test.Carrefour.model.Product;
import com.test.Carrefour.repository.OrderRepository;

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order updatedOrder) {
    	Order existing = orderRepository.findById(id).isPresent()
                ? orderRepository.findById(id).get()
                : null;

        if (existing == null) {
            throw new RuntimeException("Product not found");
        }

        existing.setName(updatedOrder.getName());
        try {
			return orderRepository.save(existing);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public void deleteOrder(Long id) {
    	orderRepository.deleteById(id);
    }
}
