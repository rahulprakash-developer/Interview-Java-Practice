package com.java.polymorphism;

public class MethodOverridingExample {
	public static void main(String[] args) {

		//Parent parent = new Child(10, 20);

//		parent.method1();

	}

}

abstract class Parent {

	private int i;

	abstract void m1();

	public Parent(int i) {
		this.i = i;
	}

	public void method1() {
		System.out.println("Value of Parent is " + i);

	}
}

 abstract class Child extends Parent {
	private int j;

	public Child(int i, int j) {
		super(i);
		this.j = j;
	}

	@Override
	public void method1() {

		System.out.println("Value of child is " + j);

	}

	

}
