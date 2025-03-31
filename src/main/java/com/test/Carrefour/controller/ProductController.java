package com.test.Carrefour.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Carrefour.model.Product;
import com.test.Carrefour.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;

    public ProductController(ProductService listService) {
        this.productService = listService;
    }

    @GetMapping
    public List<Product> getAllLists() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getListById(@PathVariable Long id) {
        return productService.getProductById(id)
                .orElseThrow(() -> new RuntimeException("List not found"));
    }

    @PostMapping
    public Product createList(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateList(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteList(@PathVariable Long id) {
    	productService.deleteProduct(id);
    }
}
