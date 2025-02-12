package com.java.AbstractionExample;

public class AbstractionExample {
	public static void main(String[] args) {
		MyClass myclass = new ChildClass();
		myclass.m1();
		myclass.show();
		myclass.msg("Rahul");

	}

}

interface Myinterface {
	void show();

	public void msg(String str);

}

abstract class MyClass implements Myinterface {

	@Override
	public void show() {
		System.out.println("Hello MyClass Method");
	}

	
	  @Override public void msg(String str) { System.out.println("Hello MyClass" +
	  str);
	  
	  }
	 

	void m1() {
		System.out.println("in Myclass m1()");
	}

}

class ChildClass extends MyClass {

	@Override
	public void show() {
		System.out.println("Hello ChildClass Method");

	}

	@Override
	public void msg(String str) {
		System.out.println("Hello  ChildClass " + str);

	}

}
