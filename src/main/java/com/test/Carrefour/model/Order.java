package com.test.Carrefour.model;

import java.time.LocalDateTime;
import java.util.List;

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
	    @JoinColumn(name = "productt_id", nullable = false)
	    @JsonBackReference
	    private ListEntity list;

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
