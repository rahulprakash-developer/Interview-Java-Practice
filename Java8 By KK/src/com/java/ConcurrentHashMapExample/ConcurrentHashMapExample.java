package com.java.ConcurrentHashMapExample;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

		for (int i = 0; i < 101; i++) {
			concurrentHashMap.put(i, "Person_" + i);
		}

		concurrentHashMap.forEach((key, val) -> {
			System.out.println("Thread Name is " + Thread.currentThread().getName());
			System.out.println(key + "\t" + val);//Will print sequentially
		});
		
		System.out.println("------------------------------");
		
		concurrentHashMap.forEach(5,(key, val) -> {
			System.out.println("Thread Name is " + Thread.currentThread().getName());
			System.out.println(key + "\t" + val);//
		});

	}

}
