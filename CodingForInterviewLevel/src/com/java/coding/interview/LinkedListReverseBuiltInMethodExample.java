package com.java.coding.interview;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverseBuiltInMethodExample {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(12);
		linkedList.add(23);

		linkedList.add(43);
		linkedList.add(11);
		linkedList.add(32);

		System.out.println("before Reversing " + linkedList);

		Collections.reverse(linkedList);

		System.out.println("After Reversing " + linkedList);

	}

}
