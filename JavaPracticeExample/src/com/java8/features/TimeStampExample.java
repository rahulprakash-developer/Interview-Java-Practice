package com.java8.features;

import java.sql.Date;
import java.sql.Timestamp;

public class TimeStampExample {

	public static void main(String[] args) {

		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		Date date = new Date(stamp.getTime());
		System.out.println(date.toString());
	}

}
