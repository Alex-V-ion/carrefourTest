package com.test.Carrefour.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.test.Carrefour.model.Product;
import com.test.Carrefour.repository.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository productRepository;

    public ProductService(ProductRepository ProductRepository) {
        this.productRepository = ProductRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        Product existing = productRepository.findById(id).isPresent()
                ? productRepository.findById(id).get()
                : null;

        if (existing == null) {
            throw new RuntimeException("Product not found");
        }

        existing.setName(updatedProduct.getName());
        try {
			return ProductRepository.save(existing);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public void deleteProduct(Long id) {
        ProductRepository.deleteById(id);
    }
}
