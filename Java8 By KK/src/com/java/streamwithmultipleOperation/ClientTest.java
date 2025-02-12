package com.java.streamwithmultipleOperation;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ClientTest {

	public static void main(String[] args) {

		IntStream range = IntStream.range(1, 10);
		range.forEach(System.out::println);

		System.out.println("-----------------------");

		IntStream rangeClosed = IntStream.rangeClosed(1, 10);
		rangeClosed.forEach(System.out::println);
		
		System.out.println("------------------------------------");
		
		Random random = new Random();
		DoubleStream doubles = random.doubles(5);
		doubles.forEach(System.out::println);
		
		System.out.println("------------------------");
		
		IntStream chars = "abc".chars();
		chars.forEach(System.out::println);
		
		System.out.println();

	}

}
