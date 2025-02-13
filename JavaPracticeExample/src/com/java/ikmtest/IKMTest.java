package com.java.ikmtest;

import java.util.Optional;

public class IKMTest {

	public static void main(String[] args) {

		/*
		 * java.util.Random r = new java.util.Random(); int result = r.nextInt(7);
		 * 
		 * System.out.println(result); --Output = 1
		 */

		String a = null;

		Optional<String> b = Optional.empty();

		try {
			System.out.println(a.length());
			System.out.println("lenght "+b.orElse("").length());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			a = "String";
			System.out.println("in finally" + a.length());
			b= Optional.ofNullable("");
			System.out.println("lllll"+b.get().length());
		}
	}

}
