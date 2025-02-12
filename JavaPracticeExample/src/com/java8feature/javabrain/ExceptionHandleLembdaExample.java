package com.java8feature.javabrain;

import java.util.function.BiConsumer;

public class ExceptionHandleLembdaExample {
	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 4 };
		int key = 2;

		process(number, key, wrapperLambda((k, v) -> System.out.println(k / v)));

		/*
		 * process(number, key, (k, v) -> { try { System.out.println(k / v); }catch
		 * (Exception e) { System.out.println("Excepiton occured"); } });// writing
		 * exception to here we can move to this one method }
		 */

	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {// creating new
																										// lambda

		return (k, v) -> {
			try {
				consumer.accept(k, v);
			} catch (ArithmeticException e) {
				System.out.println("Exception occured");
			}
		};

	}

	// writing exception to here we can move to this one method

	private static void process(int[] number, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : number) {
			consumer.accept(i, key);

		}

	}
}
