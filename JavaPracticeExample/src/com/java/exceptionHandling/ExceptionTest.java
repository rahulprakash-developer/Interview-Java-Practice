package com.java.exceptionHandling;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			int res = 10 / 0;
			System.out.println("Res" + res);
		}
		//System.out.println("chalo");
		catch (NumberFormatException e) {
			System.out.println("Invalid input");
		}
		System.out.println("Hello");

	}

}
