package com.java.datastructure;

import java.util.Scanner;

public class Array_Creation {

	public static void main(String[] args) {

		int n, m, p;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of elements in array");
		n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n + 1];
		System.out.print("Enter values");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter index of new value to be instered ");
		m = sc.nextInt();
		System.out.print("Enter new value to be inserted");
		p = sc.nextInt();

		for (int i = 0; i < n + 1; i++) {

			if (i < m) {
				b[i] = a[i];
				System.out.println("b[i] 1 : " + b[i]);
				System.out.println("a[i] : " + a[i]);

			} else if (i == m) {
				b[i] = p;
				System.out.println("b[i] 2 : " + b[i]);

			} else {
				b[i] = a[i - 1];
				System.out.println("b[i] 3: " + b[i]);
				System.out.println("a[i - 1] " + a[i - 1]);
			}
		}

		System.out.print("Elements are : ");
		for (int i = 0; i < n + 1; i++) {
			System.out.println(b[i]);
		}
	}

}
