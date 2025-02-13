package com.java.coding.interview;

public class FindDuplicateStringExample {

	public static void main(String[] args) {

		String str = "Good Evening Java Developer";
		String spaceRemove = str.replaceAll("\\s+", "");
		String lowerCase = spaceRemove.toLowerCase();
		System.out.println("LowerCase " + lowerCase);


		char[] ch = lowerCase.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count += 1;
				}
			}
			System.out.println(ch[i] + "-- " + count);
		}

	}

}
