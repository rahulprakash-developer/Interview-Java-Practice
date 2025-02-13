package com.java.coding.interview.java8.streamexample;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumofAllDigitsExample {
    public static void main(String[] args) {

        int i = 123456;

       Integer sumOfDigits =  Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        Integer sumOfDigits1 =  Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();


        System.out.println(sumOfDigits1);


    }
}
