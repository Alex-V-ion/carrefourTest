package com.test.Carrefour.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	 private String name;
	 private ArrayList<Order> listeOrders;
	 
	// Getters
	    
	    public String getName() {
	        return this.name;
	    }
	    
	    public List<Order> getListOrders(){
	    	return this.listeOrders;
	    }

	    // Setters
	    public void setName(String n) {
	        this.name = n;
	    }
	    
	    public void setListOrders(ArrayList<Order> orders){
	    	this.listeOrders = orders;
	    }
}
