package com.java.coding.interview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoSrtringExample {

    public static void main(String[] args) {
// Output = axbyczd below

        String st = "abcd";
        String st1 = "xyz";
        StringBuilder merged = new StringBuilder();
        int maxLength = Math.max(st.length(), st1.length());
//using with forloop
        for (int i = 0; i < maxLength; i++) {
            if (i < st.length()) {
                merged.append(st.charAt(i));
            }
            if (i < st1.length()) {
                merged.append(st1.charAt(i));
            }
        }
        
        System.out.println(st.concat(st1));

        System.out.println(merged);
// using java 8 streams
       String mergedString =  IntStream.range(0, maxLength)
                .mapToObj(i -> (i < st.length() ? String.valueOf(st.charAt(i)) : "") +
                        (i < st1.length() ? String.valueOf(st1.charAt(i)) : ""))
                .collect(Collectors.joining());

        System.out.println("using java 8 : " + mergedString);
    }
}

