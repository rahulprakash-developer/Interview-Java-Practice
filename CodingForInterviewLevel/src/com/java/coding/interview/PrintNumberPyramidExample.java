package com.java.coding.interview;

public class PrintNumberPyramidExample {
	public static void main(String[] args) {

		int i, j, count = 4;
		int temp = 0;
		for (i = 0; i < count; i++) {

			for (j = 0; j <= i; j++) {
				temp += 1;
				System.out.print(temp);
			}
			System.out.println();

		}
	}

}
