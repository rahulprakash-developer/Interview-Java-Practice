package com.java.coding.interview.java8.streamexample;

import java.util.stream.IntStream;

public class PalindromeExample {
    public static void main(String[] args) {
        String str = "ROTATOR";

        boolean isPalindrom = IntStream.range(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        if (isPalindrom) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
