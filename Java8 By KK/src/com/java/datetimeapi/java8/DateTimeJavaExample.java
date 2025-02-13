package com.java.datetimeapi.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeJavaExample {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		System.out.println("LocalDate : " + date);

		LocalTime time = LocalTime.now();

		System.out.println("LocalTime :  " + time);

		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("LocalDateTime :  " + localDateTime);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatDate = localDateTime.format(format);

		System.out.println("FormatDate : " + formatDate);

		// printing months days and seconds
		Month month = localDateTime.getMonth();
		int day = localDateTime.getDayOfMonth();
		int seconds = localDateTime.getSecond();
		System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);

		// printing some specified date
		LocalDate date2 = LocalDate.of(1950, 1, 26);
		System.out.println("the republic day :" + date2);

		LocalDateTime local = localDateTime.withDayOfMonth(30).withYear(2016);

		System.out.println("local : " + local);

		// to get the current zone
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("the current zone is " + currentZone.getZone());

	}

}
