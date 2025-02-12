package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicatCharacterExample {
    public static void main(String[] args) {
        String str = "Java Concept of the day".replaceAll("\\s+", "").toLowerCase();

        Set<String> uniqueChars = new HashSet<String>();

        Set<String> duplicateChars = Arrays.stream(str.split("")).filter(ch -> !uniqueChars.add(ch)).collect(Collectors.toSet());
        System.out.println(duplicateChars);
    }
}
