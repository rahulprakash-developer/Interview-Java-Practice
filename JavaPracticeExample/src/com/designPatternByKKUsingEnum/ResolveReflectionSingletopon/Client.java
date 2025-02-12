package com.designPatternByKKUsingEnum.ResolveReflectionSingletopon;

public class Client {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.GETINSTANCE;
		Singleton singleton1 = Singleton.GETINSTANCE;
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton1.hashCode());
		
		
		System.out.println(singleton.getInstance());
		
		

		
		
	}
			

}
