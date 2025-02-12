package com.java.coding.interview.java8.streamexample;

import java.util.stream.IntStream;

public class PrintFirstTenEvenNumberExample {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).map(i -> i * 2).forEach(System.out::println);
    }
}
