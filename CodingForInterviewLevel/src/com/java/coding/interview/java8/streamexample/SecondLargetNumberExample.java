package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargetNumberExample {
    public static void main(String[] args) {

        List<Integer> listofIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer secondLargestNumber = listofIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(secondLargestNumber);
    }
}
