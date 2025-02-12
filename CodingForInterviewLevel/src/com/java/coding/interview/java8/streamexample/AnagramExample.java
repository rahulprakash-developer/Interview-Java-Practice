package com.java.coding.interview.java8.streamexample;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramExample {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        System.out.println(s1);
        System.out.println(s2);

        if(s1.equals(s2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
