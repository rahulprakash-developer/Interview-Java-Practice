package com.java.coding.interview;

public class FindMissingNumberInArrayExample {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 4, 5, 6, 7 };

		int n = nums.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++)
			sum = sum - nums[i];
		System.out.println("find the number " + sum);

	}

}
