package com.java.exceptionHandling;

public class ExceptionTest2 {

	public static void main(String[] args) {

		try {
			System.out.println("hello");
			return ;
		}catch (Exception e) {
			System.out.println("edee");
			return;
		}catch (Throwable e) {
			System.out.println("edee");
			return;
		}finally {
			System.out.println("ddd");
			return;
		}
	}

}
