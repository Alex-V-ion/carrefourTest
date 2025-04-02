package com.test.Carrefour.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "orders")
public class Order {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private Long customerId;

	    private List<Product> orderedProducts;

	    @Column(updatable = false)
	    private LocalDateTime createdAt = LocalDateTime.now();

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "product_id", nullable = false)
	    @JsonBackReference
	    private Product list;

	    // Getters
	    public Long getId() {
	        return id;
	    }
	    
	    public Long getCustomerId() {
	        return id;
	    }
	    

	    // Setters
	    public void setId(Long id) {
	        this.id = id;
	    }
	    
	    public void setCustomerId(Long customerId) {
	        this.customerId = customerId;
	    }

}
