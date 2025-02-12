package com.java.interview;

import java.util.Collections;

public class PrintName30Times {

	public static void main(String[] args) {

		String name = "Rahul";

		String newStr = String.join("", Collections.nCopies(30, name));
		System.out.println(newStr);

	}
}
