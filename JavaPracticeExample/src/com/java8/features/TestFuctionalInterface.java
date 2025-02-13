package com.java8.features;

public class TestFuctionalInterface {
	
	public static void main(String[] args) {
		
		HelloInterface hello =()-> System.out.println("hello Test ");
		hello.getHello();
		hello.m1();
		HelloInterface.m2();
		
	}

}
