package com.test.Carrefour.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.Carrefour.model.Order;
import com.test.Carrefour.service.OrderService;

public class OrderController {
	private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllLists() {
        return orderService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Order getListById(@PathVariable Long id) {
        return orderService.getProductById(id)
                .orElseThrow(() -> new RuntimeException("List not found"));
    }

    @PostMapping
    public Order createList(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order) {
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
    	orderService.deleteOrder(id);
    }
}
