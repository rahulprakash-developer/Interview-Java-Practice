package com.java.coding.interview.java8.streamexample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAgePersonInYearsExample {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1988, 03, 04);
        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthday, today));
    }
}
