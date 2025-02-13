package com.java.interviewquestionandanswer;

public class MethodOverLoadingOverridingExample {

	public static void main(String[] args) {

		A b = new B();
		B b1 = new B();
		A a = new A();
	b1.m3(null);
		// b.m1("Rahul");
		// b.m3("Rahul");

	}

}

class A {
	void m1(String str) {
		System.out.println("Hello A" + str);
	}

	void m2(String str, int i) {
		System.out.println("Hello " + str + " " + i);
	}
}

class B extends A {
	void m1(String str) {
		System.out.println("Hello B " + str);
	}

	void m3(String str) {

		System.out.println("b Class " + str);

	}
}