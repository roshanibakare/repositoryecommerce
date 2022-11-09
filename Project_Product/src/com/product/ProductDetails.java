package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDetails {
	
	 int id;
     String name;
     String description;
     int price;
     int quantity;
     
     public ProductDetails() {
 		super();
 		this.id = id;
 		this.name = name;
 		this.description = description;
 		this.price = price;
 		this.quantity = quantity;
 	}
     
     
	public ProductDetails(int id, String name, String description, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesceiption() {
		return description;
	}
	public void setDesceiption(String desceiption) {
		this.description = desceiption;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", name=" + name + ", desceiption=" + description + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	public static void getprice() {
		
		
	}
	
	
}

  
	
	 
  
	 
	
	 



