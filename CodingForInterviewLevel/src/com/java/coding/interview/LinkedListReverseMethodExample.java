package com.java.coding.interview;

import java.util.LinkedList;

public class LinkedListReverseMethodExample {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(12);
		linkedList.add(23);

		linkedList.add(43);
		linkedList.add(11);
		linkedList.add(32);

		for (int i = 0; i < linkedList.size() / 2; i++) {
			Integer temp = linkedList.get(i);
			linkedList.set(i, linkedList.get(linkedList.size() - i - 1));
			linkedList.set(linkedList.size() - i - 1, temp);

		}
		System.out.println("After Reverse " + linkedList);
	}

}
