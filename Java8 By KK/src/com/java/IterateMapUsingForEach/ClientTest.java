package com.java.IterateMapUsingForEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClientTest {
	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(101, new Employee("Rahul ", "rahul@g", 1000.0d));
		map.put(202, new Employee("Roma ", "roma@g", 9000.0d));
		map.put(303, new Employee("Rohan ", "rohan@g", 1111000.0d));

		Set<Entry<Integer, Employee>> set = map.entrySet();

		for (Entry<Integer, Employee> entry : set) {

			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

		System.out.println("-------------------------------");

		Set<Integer> data = map.keySet();
		for (Integer integer : data) {

			System.out.println(integer);
			System.out.println(map.get(integer));

		}
		
		System.out.println("-------------------");
		
		map.forEach((k,v)-> System.out.println(k+"\t"+ v));

	}

}
