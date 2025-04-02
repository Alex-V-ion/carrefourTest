package com.test.Carrefour.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	 private String name;
	 private ArrayList<Order> listeOrders;
	 
	// Getters
	    
	 public Long getId() {
			return this.getId();
		}
	 
	    public String getName() {
	        return this.name;
	    }
	    
	    public List<Order> getListOrders(){
	    	return this.listeOrders;
	    }

	    // Setters
	    
	    public void setId(Long i) {
			this.id = i;
		}
	    
	    public void setName(String n) {
	        this.name = n;
	    }
	    
	    public void setListOrders(ArrayList<Order> orders){
	    	this.listeOrders = orders;
	    }
}
