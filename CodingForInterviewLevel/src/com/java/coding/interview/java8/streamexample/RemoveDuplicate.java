package com.java.coding.interview.java8.streamexample;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {


        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> uniqueStrings = listOfStrings.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueStrings);
    }
}
