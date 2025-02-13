package com.java.coding.interview;

public class FindMissingDuplicateNumberExample {

	public static void main(String[] args) {

		int arr[] = { 7, 6, 6, 5, 4, 5, 4 };

		for (int i = 0; i > arr.length; i++) {

			for (int j = i + 1; j < i; j++) {

				if (arr[i] == arr[j]) {
				
				} else { 
					System.out.println(arr[i]);
				}
			}

		}
	}

}
