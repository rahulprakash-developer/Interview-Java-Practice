package com.java.coding.interview.java8.streamexample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArrayExample {

    public static void main(String[] args) {


/*        int arr[] = new int[]{1, 4, 5, 9, 3, 6};

        int reversedArray[] = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - 1]).toArray();*/

        int arr[] = new int[]{1, 4, 5, 9, 3, 6};

        int[] reversedArray = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();

        System.out.println(Arrays.toString(reversedArray));


    }

}
