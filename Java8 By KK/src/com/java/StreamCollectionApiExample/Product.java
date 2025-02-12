package com.java.StreamCollectionApiExample;

public class Product {
	private String name;
	private int price;

	public Product(int price,String name) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
