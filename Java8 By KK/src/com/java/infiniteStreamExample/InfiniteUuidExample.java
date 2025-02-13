package com.java.infiniteStreamExample;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteUuidExample {
	public static void main(String[] args) {

		Supplier<UUID> uuid = UUID::randomUUID;

		Stream<UUID> random = Stream.generate(uuid);

		List<UUID> randomInts = random.skip(10).limit(10).collect(Collectors.toList());

		randomInts.forEach(System.out::println);

		System.out.println("---------------------");

		Stream<Integer> integer = Stream.iterate(0, i -> i + 1);
		integer.limit(10).forEach(System.out::println);
	}

}
