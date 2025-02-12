package com.java.LambdaExpressionHandleCheckedException;

@FunctionalInterface
public interface ThrowingConsumer<T, E extends Exception> {
	void accept(T t) throws E;

	/*
	 * Note: Here We are created new functional interface because in client code we
	 * are throwing the IOException but Consumer(Functional Interface) accept()
	 * method is not throwing any exception to resolve this problem we created new
	 * interface as above and in accept() method we are throwing exception
	 */

}
