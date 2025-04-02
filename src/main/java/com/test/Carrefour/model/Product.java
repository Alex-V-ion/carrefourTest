package com.test.Carrefour.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	private String name;
	private Double price;
	private String image;
	
	
	//Getters
	public String getName() {
		return this.name;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public String getImage() {
		return this.image;
	}
	
	
	//Setters
	public void setName(String n) {
		this.name = n;
	}
	
	public void setPrice(Double p) {
		this.price = p;
	}
	
	public void setImage(String i) {
		this.image = i;
	}

}
