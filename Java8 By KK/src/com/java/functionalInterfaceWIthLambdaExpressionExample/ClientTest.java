package com.java.functionalInterfaceWIthLambdaExpressionExample;

public class ClientTest {
	public static void main(String[] args) {

		MyInterface myInterface = () -> System.out.println("Hello Rahul from MyInterface");
		myInterface.method1();

		System.out.println("----------------------");

		MyInterface2 myInterface2 = name -> System.out.println("Hello " + name + " from MyInterface2");

		myInterface2.method2("Rahul");

		System.out.println("----------------------");

		MyInterface3 myInterface3 = (name, age) -> {
			System.out.println("Your name is " + name);
			System.out.println("and your age is " + age);
		};
		myInterface3.method3("Rahul", 30);

		System.out.println("-----------------------------");

		MyInterface4 myInterface4 = (name, email) -> {
			System.out.println(name +" "+ email);
			return "Hello";

		};

		myInterface4.method4("Rahul", "email");

	}
}
