package com.java.ArrayListWithInternalExample;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();

		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		vector.add(9);
		vector.add(10);

		System.out.println(vector.capacity());

		vector.add(11);

		System.out.println(vector.capacity());

	}

}
