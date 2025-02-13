package com.java.designpatterbyKk.BuilderDesign;

public class BuilderExample {
	public static void main(String[] args) {

		Laptop laptop = new Laptop.LaptopBuilder("33", "44", "66").build();

		System.out.println("Laptop Config " + laptop);

		Laptop laptop1 = new Laptop.LaptopBuilder("33", "44", "66").setBluetoothEnable(true).setGrabhicalEnable(true)
				.build();

		System.out.println("Laptop Config " + laptop1);
	}

}
