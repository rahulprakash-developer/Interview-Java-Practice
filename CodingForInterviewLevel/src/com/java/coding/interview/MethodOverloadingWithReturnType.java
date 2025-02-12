package com.java.coding.interview;

public class MethodOverloadingWithReturnType {

	public void m1(int i) {
		System.out.println("Hello m1 void");
	}

	public String m1(String str) {
		System.out.println("Hello m1 String");// we cant overload method with changing the return type

		return str;

	}

	public static void main(String[] args) {
		MethodOverloadingWithReturnType method = new MethodOverloadingWithReturnType();
		method.m1(1);
	}

}
