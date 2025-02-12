package com.java.ReductinAndCollectionApiStreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReductionAndCollectorsExample {
	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(10);
		integers.add(20);
		integers.add(30);

		// Reduce Example

		Integer sum = integers.stream().reduce(100, (x, y) -> x + y);
		System.out.println(sum);

		System.out.println("------------------------------");

		// Collect Example

		List<String> strList = new ArrayList<>();
		strList.add("Rahul");
		strList.add("Rohan");
		strList.add("Roma");

		List<String> list = strList.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		list.forEach(System.out::println);

	}

}
