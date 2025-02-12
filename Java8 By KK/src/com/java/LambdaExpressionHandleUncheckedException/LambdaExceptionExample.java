package com.java.LambdaExpressionHandleUncheckedException;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExceptionExample {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 5, 0, 9, 11, 15);
		list.forEach(consumerWrapper(i -> System.out.println(50 / i), Exception.class));

	}

	public static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer, Class<E> clazz) {
		return i -> {
			try {
				consumer.accept(i);
			} catch (Exception e) {

				System.out.println("ArithmeticException occured:: " + e.getMessage());
			}
		};
	}
}

/*
 * list.forEach(i -> {
 * 
 * try { System.out.println(50 / i); } catch (ArithmeticException e) {
 * 
 * System.out.println("ArithmeticException occured:: "+ e.getMessage()); } });
 * 
 * This code for to handle unchecked exception but this looks not not good
 * because instead of doing handle inside the lambda we can write seperate
 * wrapper method to handle the exception as below:
 * 
 * 
 * public static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
 * return i -> { try { consumer.accept(i); } catch (ArithmeticException e) {
 * 
 * System.out.println("ArithmeticException occured:: " + e.getMessage()); } }; }
 * 
 * but here also its not generic to handle generic we can do one more this have
 * to modify the above code as below:
 * 
 * public static <T, E extends Exception> Consumer<T>
 * consumerWrapper(Consumer<T> consumer, Class<E> clazz) { return i -> { try {
 * consumer.accept(i); } catch (Exception e) {
 * 
 * System.out.println("ArithmeticException occured:: " + e.getMessage()); } }; }
 *
 * Now this is generic so we can use this everywhere when its required
 * 
 */
