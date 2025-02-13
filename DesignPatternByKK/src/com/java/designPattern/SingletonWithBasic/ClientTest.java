package com.java.designPattern.SingletonWithBasic;

public class ClientTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();

		System.out.println(singleton.hashCode());//--366712642
		System.out.println(singleton1.hashCode());//--366712642in both case we will get same hashcode value 

	}
}

