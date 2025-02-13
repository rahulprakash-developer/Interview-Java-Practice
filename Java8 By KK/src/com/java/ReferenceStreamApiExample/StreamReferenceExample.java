package com.java.ReferenceStreamApiExample;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReferenceExample {

	public static void main(String[] args) {

		List<String> collect = Stream.of("a", "b", "c").filter(e -> e.contains("b")).collect(Collectors.toList());

		Optional<String> findAny = collect.stream().findAny();

		System.out.println(findAny.get());

		Optional<String> findFirst = collect.stream().findFirst();

		System.out.println(findFirst.get());

		/*
		 * Optional<String> findFirst = filter.findFirst();
		 * System.out.println(findFirst.get()); The above lines of code when we are
		 * trying to call findFirst() with stream i.e. already consumed then it runtime
		 * you will get following error: Exception in thread "main"
		 * java.lang.IllegalStateException: stream has already been operated upon or
		 * closed at
		 * java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229) at
		 * java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464) at
		 * com.java.ReferenceStreamApiExample.StreamReferenceExample.main(
		 * StreamReferenceExample.java:15). To avoid this exception we can refactor the
		 * code with below: List<String> collect = Stream.of("a", "b", "c").filter(e ->
		 * e.contains("b")).collect(Collectors.toList());
		 * 
		 * Optional<String> findAny = collect.stream().findAny();
		 * 
		 * System.out.println(findAny.get());
		 * 
		 * Optional<String> findFirst = collect.stream().findFirst();
		 * 
		 * System.out.println(findFirst.get());
		 * 
		 * 
		 * 
		 */
	}

}
