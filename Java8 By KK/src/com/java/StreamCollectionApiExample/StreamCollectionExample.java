package com.java.StreamCollectionApiExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectionExample {
	public static void main(String[] args) {

		// Converting Stream to collection

		List<Product> asList = Arrays.asList(new Product(12, "Potatoes"), new Product(23, "Orange"),
				new Product(25, "Apple"), new Product(10, "Mangoes"), new Product(11, "Grapes"),
				new Product(30, "Banana"));

		List<String> collect = asList.stream().map(Product::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("-------------------------------------");

		// Reduce a String

		String collect2 = asList.stream().map(Product::getName).collect(Collectors.joining(",", "[", "]"));

		System.out.println(collect2);

		System.out.println("-------------------------------------");

		// Average Price

		Double collect3 = asList.stream().collect(Collectors.averagingInt(Product::getPrice));

		System.out.println(collect3);

		System.out.println("-------------------------------------");

		// Getting Statistic Report

		IntSummaryStatistics collect4 = asList.stream().collect(Collectors.summarizingInt(Product::getPrice));
		System.out.println(collect4);

		System.out.println("-------------------------------------");

		// Using GroupbyInfo Report
		Map<Integer, List<Product>> collect5 = asList.stream().collect(Collectors.groupingBy(Product::getPrice));

		collect5.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});

		System.out.println("-------------------------------------");

		// Divide Streams element into groups according to some predicate
		Map<Boolean, List<Product>> collect6 = asList.stream()
				.collect(Collectors.partitioningBy(p -> p.getPrice() > 15));
		collect6.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});

		System.out.println("-------------------------------------------");

		// pushing the collector to perform additional transformation
		Collection<Product> collect7 = asList.stream()
				.collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableCollection));
		collect7.forEach(System.out::println);
	}

}
