package com.java8.features;

public class ExeceptionExample {
	public static void main(String[] args) {
		
		try {
			//int res =10/0;
			//System.out.println("Result ---" + res);
			
			System.out.println("Hello try");
			return;
		}catch(Exception e) {
			System.out.println("Invalid input");
			//System.out.println("in catch block");
			return;
		}finally {
			System.out.println("in finally");
			System.out.println("Main completed");
			return;
		}
		
	}

}
