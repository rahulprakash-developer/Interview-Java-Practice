package com.java.coding.interview;

public class StarPrintExample {

	public static void main(String[] args) {

		int count = 10;
		int i;
		int j;

		for (i = 0; i < count; i++) {

			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

}
