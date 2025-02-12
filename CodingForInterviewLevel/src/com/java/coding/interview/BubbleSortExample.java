package com.java.coding.interview;

public class BubbleSortExample {
	public static void main(String[] args) {

		int[] arr = { -1, 6, 2, 3, 4, 5, 1, 7, 8, 9 };
		int sum = 10;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					k++;
					
				}
			}

		}

		System.out.println(k);

	}

}
