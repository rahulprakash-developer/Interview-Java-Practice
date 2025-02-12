package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;

public class SumAndAvergaeExample {
    public static void main(String[] args) {
        int arr [] = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(arr).sum();

        double average = Arrays.stream(arr).average().getAsDouble();

        System.out.println(sum);
        System.out.println(average);
    }
}
