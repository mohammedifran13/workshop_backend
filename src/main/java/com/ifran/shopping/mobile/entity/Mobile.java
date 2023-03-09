package com.ifran.shopping.mobile.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobile")
public class Mobile {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "color")
	private String color;	
	
	@Column(name = "price")
	private int price;
	
	
	public Mobile() {}
	
	public Mobile(int id,String brand,String model,String color,int price) {
	this.id = id;
	this.brand = brand;
	this.model = model;
	this.color = color;
	this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}