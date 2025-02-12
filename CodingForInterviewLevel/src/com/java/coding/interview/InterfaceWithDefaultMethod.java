package com.java.coding.interview;

public class InterfaceWithDefaultMethod implements m1, m2 {

	public static void main(String[] args) {

		InterfaceWithDefaultMethod i = new InterfaceWithDefaultMethod();
		//i.getData();
		//i.getData();

	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		m1.super.getData();
	}

}

interface m1 {

	default void getData() {
		System.out.println("in getData");
	}
	
	public static void main(String[] args) {
		
	}
}

interface m2 {
	default void getData() {
		System.out.println("in getDataM2");

	}
}