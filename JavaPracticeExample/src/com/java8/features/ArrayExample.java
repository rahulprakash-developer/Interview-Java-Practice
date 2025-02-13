package com.java8.features;

public class ArrayExample {

	public static void main(String[] args) {

		System.out.println("Lenght " + args.length);

		System.out.println(args[0] + "\t" + args[1]);
		System.out.println(args[0] + args[1]);

		int ab = Integer.parseInt(args[0]);
		int bc = Integer.parseInt(args[1]);

		String[] arr = new String[4];
		arr[0]="rr";
		arr[1]="dd";
		arr[2]="ff";
		arr[3]="gg";
		for (int i = 0; i < arr.length; i++) {


			System.out.println(arr[i]);

		}

		System.out.println(ab + bc);
	}
}
