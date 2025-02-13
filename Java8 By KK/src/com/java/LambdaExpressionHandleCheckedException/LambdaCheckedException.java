package com.java.LambdaExpressionHandleCheckedException;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaCheckedException {
	public static void main(String[] args) throws IOException {
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(handlingConsumerWrapper(i -> writeToFile(i), IOException.class));
	}

	private static Object writeToFile(Integer i) {
		return null;
	}

	static <T, E extends Exception> Consumer<T> handlingConsumerWrapper(ThrowingConsumer<T, E> throwingConsumer,
			Class<E> exceptionClass) {

		return i -> {
			try {
				throwingConsumer.accept(i);
			} catch (Exception ex) {
				try {
					E exCast = exceptionClass.cast(ex);
					System.err.println("Exception occured : " + exCast.getMessage());
				} catch (ClassCastException ccEx) {
					throw new RuntimeException(ex);
				}
			}
		};
	}

	
	
	/*
	 * 
	 * 
	 * integers.forEach(i -> { try { writeToFile(i); } catch (Exception e) { throw
	 * new RuntimeException(e); } }); }
	 * 
	 * private static Object writeToFile(Integer i) throws IOException {
	 * 
	 * return null; }
	 * 
	 * This code for to handle checked exception but this looks not good because
	 * instead of doing handle inside the lambda we can write seperate wrapper
	 * method to handle the exception as below:
	 * 
	 * integers.forEach(throwingConsumerWrapper(i -> writeToFile(i))); }
	 * 
	 * private static Object writeToFile(Integer i) { return null; }
	 * 
	 * private static <T> Consumer<T> throwingConsumerWrapper(ThrowingConsumer<T,
	 * Exception> throwingConsumer) {
	 * 
	 * return i -> { try { throwingConsumer.accept(i); } catch (Exception ex) {
	 * throw new RuntimeException(ex); } }; } but here also its not generic,to
	 * handle generic we can do one more this have to modify the above method as
	 * below:
	 * 
	 */
}
