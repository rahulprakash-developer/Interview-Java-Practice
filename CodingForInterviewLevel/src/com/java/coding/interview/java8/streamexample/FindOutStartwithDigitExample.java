package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;
import java.util.List;

public class FindOutStartwithDigitExample {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);

    }
}
