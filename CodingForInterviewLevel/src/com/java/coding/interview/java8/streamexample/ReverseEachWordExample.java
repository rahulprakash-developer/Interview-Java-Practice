package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordExample {

    public static void main(String[] args) {

        String str = "Java concept of the day";

        String reversed = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversed);
    }
}
