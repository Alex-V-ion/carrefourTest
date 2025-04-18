package com.test.Carrefour.repository;

import com.test.Carrefour.model.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

	public interface ProductRepository {

		List<Product> findAll();

		Optional<Product> findById(Long id);

		Product save(Product product);

		void deleteById(Long id);
	}

