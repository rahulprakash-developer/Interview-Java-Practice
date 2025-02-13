package com.java.rahul.logic_code;

public class PrimeNumberTest {

	public static void main(String[] args) {

		int num = 18, i = 2;

		boolean flag = false;

		/*
		 * for (int i = 2; i <= num / 2; ++i) {
		 * 
		 * // condition for nonprime number if (num % i == 0) { flag = true; break; }
		 * 
		 * }
		 * 
		 * if (!flag) { System.out.println(num + "is a prime number"); } else {
		 * System.out.println(num + "is not  a prime number");
		 * 
		 * }
		 */

		// Using While loop

		while (i < num / 2) {

			if (num % 2 == 0) {
				flag = true;
				break;
			}
			++i;

		}

		if (!flag) {
			System.out.println(num + "is a prime number");
		} else {
			System.out.println(num + "is not  a prime number");
		}
	}
}