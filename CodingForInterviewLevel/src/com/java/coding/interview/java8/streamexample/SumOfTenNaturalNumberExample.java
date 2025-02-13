package com.java.coding.interview.java8.streamexample;

import java.util.stream.IntStream;

public class SumOfTenNaturalNumberExample {
    public static void main(String[] args) {
        int sum = IntStream.range(1,11).sum();
        System.out.println(sum);
    }
}
