package com.java8.features;

import java.io.IOException;
import java.sql.SQLException;

public class PolymorphismExample {

	public static void main(String[] args) {
		A a1 = new C("cc", "dd");
		a1.m1("Hello");
		System.out.println("C main class" + a1.name + "  " + a1.str);
		//System.out.println(null);
		//new A().m3();

	}

}

class A {
	final int ab;
	String str;
	String name;

	A(String str, String name) {
		ab = 0;
		this.name = name;
		this.str = str;
	}
	
	 void m2() throws IOException {
		
	}
	
	static void m3() {
		System.out.println("A class m3()");
	}

	A(int ab) {
		this.ab = ab;
	}

	void m1(String str) {

		System.out.println("m1() -----in A class");
	}

}

class C extends A {

	String str;
	String name;

	C(String str, String name) {
		super(str, name);
		this.name = name;
		this.str = str;
	}
	
	void m2() throws NullPointerException{
		
	}

	static void m3() {
		System.out.println("B class M3()");
	}
	void m1(String str) {

		str = "Hello Rahul";

		System.out.println("super value  " + super.name + "  " + super.str);

		System.out.println("in C class m1()" + str);

	}

}