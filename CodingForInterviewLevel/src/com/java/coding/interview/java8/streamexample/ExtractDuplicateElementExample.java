package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateElementExample {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueElement = new HashSet<Integer>();
        Set<Integer> duplicateElements = listOfIntegers.stream().filter(i -> ! uniqueElement.add(i)).collect(Collectors.toSet());
        System.out.println(duplicateElements);



    }


}
