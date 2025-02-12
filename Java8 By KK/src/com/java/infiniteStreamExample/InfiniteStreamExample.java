package com.java.infiniteStreamExample;

import java.util.stream.Stream;

public class InfiniteStreamExample {

	public static void main(String[] args) {
		
		Stream<Integer> infiniteStream = Stream.iterate(0, i->i+2);
		Stream<Integer> count = infiniteStream.limit(10);
		count.forEach(System.out::println);

	}

}
