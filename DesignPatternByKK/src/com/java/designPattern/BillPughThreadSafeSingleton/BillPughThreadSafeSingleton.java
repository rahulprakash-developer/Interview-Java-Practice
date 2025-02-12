package com.java.designPattern.BillPughThreadSafeSingleton;

public class BillPughThreadSafeSingleton {
	
	public static void main(String[] args) {
		
		Singleton singelton = Singleton.getInstance();
		Singleton singelton1 = Singleton.getInstance();
		
		System.out.println(singelton.hashCode());
		System.out.println(singelton1.hashCode());
		
	}

}
