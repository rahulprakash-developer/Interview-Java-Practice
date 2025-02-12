package com.java.streamOperationExample;

import java.util.ArrayList;
import java.util.List;

public class StreamOperationExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Rohan");
		list.add("Roma");
		list.add("Rajesh");
		
		/*Stream<String> stream = list.stream();
		Stream<String>  distinct = stream.distinct();
		Long count = distinct.count();
		
		System.out.println(count);*/
		
		// The above line of code with same line as below 
		
		Long count = list.stream().distinct().count();
		
		System.out.println(count);
		
		
		//Checking condition in iteartion with Java 8
		
		boolean isExists = list.stream().anyMatch(s->s.contains("Ra44"));
		System.out.println(isExists);
	}

}
