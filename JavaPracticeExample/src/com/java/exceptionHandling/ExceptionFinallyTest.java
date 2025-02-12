package com.java.exceptionHandling;

public class ExceptionFinallyTest {
	
	public static void main(String str[]) {

		ExceptionFinallyTest.main1();
	
	}
	
	public static  int main1() {

		try {
			// int res = 10 / 3;
			 //System.out.println("Resr" + "Hello");
			return 1;
		} catch (NumberFormatException e) {
			 //System.out.println("Resr" + "Hello 1");
			return 2;
		} finally {
			 //System.out.println("Resr" + "Hello2");
			return 3;
			

		}
	}

}
