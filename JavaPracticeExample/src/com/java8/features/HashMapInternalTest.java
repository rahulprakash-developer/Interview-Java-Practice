package com.java8.features;

import java.io.IOException;
import java.util.HashMap;

public class HashMapInternalTest {
	public static void main(String[] args) {
		HashMap<HashTest, Integer> map = new HashMap<HashTest, Integer>();
		map.put(new HashTest("vishal"), 20);
		map.put(new HashTest("sachin"), 30);
		map.put(new HashTest("vaibhav"), 40);

		System.out.println();
		System.out.println("Value for key sachin: " + map.get(new HashTest("sachin")));
		System.out.println("Value for key vaibhav: " + map.get(new HashTest("vaibhav")));

	}

}

class B extends HashTest {
	B(String key) {
		super(key);
		// TODO Auto-generated constructor stub
	}

	void m1(int x) {

	}
}

class HashTest {
	String key;

	HashTest(String key) {
		this.key = key;
	}

	void m1(int x) throws NullPointerException {

	}

	@Override
	public int hashCode() {
		int hash = (int) key.charAt(0);
		System.out.println("hashCode for key: " + key + " = " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println();
		return key.equals(((HashTest) obj).key);
	}

}
