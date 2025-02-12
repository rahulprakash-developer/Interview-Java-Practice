package com.java.MethodReferenceForConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ConstrutorMethodReference {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(4, 19, 20, 21);

		number.forEach(x -> System.out.println(x));

		List<Double> value = findSqareRoot(number, Integer::new);// Here its showing constructor Method reference
		
		
		value.forEach(System.out::println);

	}

	public static List<Double> findSqareRoot(List<Integer> number, Function<Integer, Integer> f) {

		List<Double> doubleValueList = new ArrayList<>();
		number.forEach(x -> doubleValueList.add(Math.sqrt(f.apply(x))));
		return doubleValueList;

	}

}
