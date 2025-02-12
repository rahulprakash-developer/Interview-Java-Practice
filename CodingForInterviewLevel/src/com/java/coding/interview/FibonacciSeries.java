package com.java.coding.interview;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt();

		System.out.println("Number Print " + number);

		for (int i = 0; i <= number; i++) {
			System.out.println(fibonacci(i) + "");
		}

	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);

	}
}
