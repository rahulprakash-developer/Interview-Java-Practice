package com.java.rahul.logic_code;

public class Person extends A {

	public static void main(String[] args) {
		Person person = new Person();
		person.m1();
	}

	@Override
	void m1() {
		System.out.println("Hello ");
		
	}
	
}

	

abstract class B {
	
	abstract void m1();

}

abstract class A extends B{
	
	abstract void m1();
}
