package com.java.coding.interview;

import java.util.Random;

public class RandomNumberGenerateForEach {

	public static void main(String[] args) {
		Random random = new Random();

		random.ints().limit(10).forEach(System.out::println);

	}

}
