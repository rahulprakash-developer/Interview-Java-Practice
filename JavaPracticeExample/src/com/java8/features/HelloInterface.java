package com.java8.features;


@FunctionalInterface
public interface HelloInterface {
	
	public void getHello();
	//public void getM1();
	
	default void m1() {
		System.out.println("hello m1");
	}
	
	static void m2() {
		System.out.println("Hell in m2");
	}
	
	
	
	

}


