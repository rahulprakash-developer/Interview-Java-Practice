package com.java.coding.interview.java21;

public class Zone {
	String name;
	double width;
	double height;

	public Zone(String name, double width, double height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}

	// Example method to calculate the area
	public double area() {
		return width * height;
	}
}