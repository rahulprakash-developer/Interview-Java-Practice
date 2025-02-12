package com.java.StreamToPrimitiveExample;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamPremitiveExample {

	public static void main(String[] args) {
		IntStream intS = IntStream.range(1, 5);

		intS.forEach(System.out::println);
		
		

        IntStream inStrm = IntStream.of(10, 20, 30, 40);
        System.out.println("----- IntStream -----");
        inStrm.forEach(System.out::println);
        
        
        double[] results = {98.12, 72.17, 75.20, 68.6};
        DoubleStream resultStream = Arrays.stream(results);
        System.out.println("----- DoubleStream -----");
        resultStream.forEach(System.out::println);
        

	}

}
