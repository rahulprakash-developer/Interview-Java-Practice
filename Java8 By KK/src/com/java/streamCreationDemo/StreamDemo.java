package com.java.streamCreationDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		String[] arr = new String[] { "aa", "bb", "cc" };

		Stream<String> stream = Arrays.stream(arr);// Here you can create the stream object

		stream.forEach(System.out::println);
		System.out.println("---------------------");

		Stream<String> str = Stream.of("a", "b", "c");// Here also you can create the stream object
		str.forEach(System.out::println);
		
		List<String> list = new ArrayList<>();
		list.add("Abc");
		list.add("bcd");
		list.add("dec");
		
		Stream<String> steam = list.stream();
		
		steam.forEach(System.out::println);

		

	}

}
