package com.java.ListExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("Raam");
		list.add("Raam");
		list.add("Rahul");
		list.add("Ram");
		list.add(null);
		list.add(null);
		
		Set<String> set = new HashSet<>(list);
		
		int size = list.size();
		System.out.println(size);
		
		System.out.println("--------------------------");
		
		list.forEach(s->System.out.println(s));
		
		System.out.println("---------------------------");
		
		System.out.println(set.size());
		
		set.forEach(s->System.out.println(s));
		
	}

}

