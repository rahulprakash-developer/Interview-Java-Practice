package com.java.HashMapInternalWorkingExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalExample {

	public static void main(String[] args) {

		String s1 = "FB";
		String s2 = "Ea";
		
		System.out.println(s1.hashCode()+" \t" + s2.hashCode());

		Map<String, Integer> map = new HashMap<>();

		map.put(s1, 1);
		map.put(s2, 2);
		System.out.println(map);

	}

}

