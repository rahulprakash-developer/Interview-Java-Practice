package com.java.exceptionHandling;

public class ExceptionTest1 {
	public static void main(String[] args) {

		String data = null;
		try {
			data = args[0];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("provide the value");
		}
		int x = 0;
		try {
			x = Integer.parseInt(data);
		} catch (NumberFormatException e) {
			System.out.println("Provide the value as CLa");
		}
		try {
			int res = 10 / x;
			System.out.println("res" + res);
		} catch (ArithmeticException e) {
			System.out.println("Provide non zero int value as CLA");
		}
		
		System.out.println("MAIn end");
	}

}
