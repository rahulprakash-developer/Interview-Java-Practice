package com.java.StreamReductionExample;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionExample {
	public static void main(String[] args) {
		// 1+2+3=6
		OptionalInt reduce = IntStream.range(1, 4).reduce((a, b) -> a + b);
		System.out.println(reduce.getAsInt());

		System.out.println("--------------------------------------------");

		// 10+1+2+3
		int reduce2 = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		System.out.println(reduce2);

		System.out.println("---------------------------------------------");

		Integer reduce3 = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> {
			System.out.println("Comibiner called");
			return a + b;
		});//Here combiner will called 2 time (first time it will call and add value like )
		//11,12+13=25+11=36
		System.out.println(reduce3);

	}

}
