package com.java.datastructure;

import java.util.Scanner;

public class Array_Deletion {

	public static void main(String[] args) {

		int n, m, p;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array value : ");
		n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n - 1];
		System.out.print("Enter values : ");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter index to be deleted : ");
		m = sc.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (i < m) {
				b[i] = a[i];
			} else if (i == m) {

				continue;
			} else {
				b[i - 1] = a[i];
			}

		}

		System.out.print("Elements are : ");
		for (int i = 0; i < n - 1; i++) {
			System.out.println(b[i]);
		}
	}

}
