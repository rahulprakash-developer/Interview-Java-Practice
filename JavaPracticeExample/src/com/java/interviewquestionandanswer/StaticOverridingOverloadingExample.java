package com.java.interviewquestionandanswer;

public class StaticOverridingOverloadingExample {

	public static void main(String[] args) {

		staticMethod st = new staticMethod1();
		st.m1("hello");
	}

}

class staticMethod {

	static void m1(String str) {
		System.out.println("hello staticMethod " + str);
	}

	static void m1(String str, int i) {
		System.out.println("hello staticMethod " + str);
	}
}

class staticMethod1 extends staticMethod {
	static void m1(String str) {
		System.out.println("hello staticMethod1 " + str);

	}

	static void m3(String str) {
		System.out.println("hello staticMethod1 " + str);

	}
}
