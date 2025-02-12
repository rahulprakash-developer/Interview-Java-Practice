package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedArrayExample {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

      Map<String, Long> elementCountMap = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      Map.Entry<String, Long> mostFrequentData = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Most frquent data : " + mostFrequentData.getKey());
        System.out.println("count : " + mostFrequentData.getValue());

    }
}
