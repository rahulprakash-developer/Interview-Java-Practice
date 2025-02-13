package com.java.coding.interview;

public class PyramidStarExample {
	public static void main(String[] args) {
		int i, j, row = 5;

		for (i = 0; i < row; i++) {

			for (j = row - i; j > 1; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
