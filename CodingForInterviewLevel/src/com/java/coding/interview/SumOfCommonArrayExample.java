package com.java.coding.interview;

public class SumOfCommonArrayExample {

	public static void main(String[] args) {

		int arrA[] = { 2, 5, 8, 90, 12, 4 };
		int arrB[] = { 1, 7, 12, 5, 9, 22 };

		int sum = 0;

		for (int i = 0; i < arrA.length; i++) {

			for (int j = 0; j < arrB.length; j++) {

				if (arrA[i] == arrB[j]) {
					sum = sum + arrA[i];
				}

			}
		}
		System.out.println("Sum Value " + sum);
	}

}
