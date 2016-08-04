package com.niit.shoppingcart;
import org.springframework.stereotype.Component;
@Component//annotation is for automatic bean indication
public class Product {
	private String id;
	private String name;
	private int Price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
}
