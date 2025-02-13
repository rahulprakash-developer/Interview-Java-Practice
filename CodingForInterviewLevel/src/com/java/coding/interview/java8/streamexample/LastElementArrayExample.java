package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;
import java.util.List;

public class LastElementArrayExample {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five");

        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(lastElement);
    }
}
