package com.java.StreamUsingPipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipeline {

	public static void main(String[] args) {

		Stream<String> oneModifiedstream = Stream.of("abc", "bcd", "cde").skip(1);
		oneModifiedstream.forEach(System.out::println);

		System.out.println("--------------------------------------");
		
		Stream<String> stream = Stream.of("abc1", "bcd2", "cde3").skip(1).map(element -> element.substring(0, 3));
		stream.forEach(System.out::println);
		
		System.out.println("--------------------------------------");
		
		List<String> asList = Arrays.asList("abc1", "bcd2", "cde3");
		long count = asList.stream().skip(1).map(element->element.substring(0,3)).sorted().count();
		System.out.println(count);
	}

}
