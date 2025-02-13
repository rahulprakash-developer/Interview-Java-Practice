package com.java.coding.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonCharacterArrayExample {

	public static void main(String[] args) {

		String arr[] = { "India", "Japan", "China" };

		for (int i = 0; i < arr.length; i++) {
			char arr1[] = arr[i].toCharArray();

			for (int j = 0; j < arr1.length; j++) {
				
			}
		}
		

		HashMap<Character, Integer> finalCount = new HashMap<>();

		for (char c = 'a'; c <= 'z'; ++c)

			
			finalCount.put(c, 100);

		HashMap<Character, Integer> count = new HashMap<>();

		for (String word : arr)

		{

			count.clear();

			for (char c : word.toCharArray())

				count.put(c, count.getOrDefault(c, 0) + 1);
			for (char c = 'a'; c <= 'z'; ++c)
				finalCount.put(c, Math.min(finalCount.get(c), count.getOrDefault(c, 0)));
		}
		List<String> result = new ArrayList<>();
		int times;
		for (char c = 'a'; c <= 'z'; ++c) {
			times = finalCount.get(c);
			while (times > 0) {
				result.add(Character.toString(c));
				--times;
			}
		}
		System.out.println(result);

	}

}
