package com.java.coding.interview.java8.streamexample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyEachCharacterExample {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> charCountMap =
                inputString.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
    }
}

