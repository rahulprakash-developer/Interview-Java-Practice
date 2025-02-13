package com.java.OptionalUsingExample;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		Integer value = null;
		Integer value1 = new Integer(10);

		Optional<Integer> a = Optional.ofNullable(value);
		Optional<Integer> b = Optional.of(value1);
		
		String str ="null";
		Optional op = Optional.of(str);
		
		System.out.println(str.toLowerCase());

		Integer sum = sum(a, b);
		System.out.println(sum);

	}

	private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First paramter is present :::" + a.isPresent());
		System.out.println("Second paramter is present :::" + b.isPresent());

		Integer value1 = a.orElse(new Integer(0));
		Integer value2 = b.get();

		return value1 + value2;

	}

}
