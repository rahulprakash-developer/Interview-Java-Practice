package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNotRepeatedCharacterExample {
    public static void main(String[] args) {

        String inputString = "Java Concept of the day".replaceAll("\\s+", "").toLowerCase();

        Map<String, Long> charCountMap = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(charCountMap);

        String firstRepeatedCharacter = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() ==1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(firstRepeatedCharacter);

    }
}
