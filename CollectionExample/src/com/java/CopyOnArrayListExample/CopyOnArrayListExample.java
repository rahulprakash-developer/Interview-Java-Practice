package com.java.CopyOnArrayListExample;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListExample {

	public static void main(String[] args) {

	//	List<Integer> list = new ArrayList<Integer>();
		
		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.println(integer);
			if (integer == 5) {
				// it.remove();// it wont give any error but in case if we call remove method of
				// list class
				// then it will concurrentModificationException because list is failfast

				//list.remove(integer);
				list.add(null);
			}

		}

		System.out.println("-----------");
		System.out.println(list);
	}

}
