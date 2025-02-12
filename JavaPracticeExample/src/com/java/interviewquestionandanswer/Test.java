package com.java.interviewquestionandanswer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("1");
		list.add("1");
		list.add("1");
	//	for(Object obj : reverse(list)) Compile time error
		//System.out.println(obj + ",");
	}
	
	public static Iterator reverse(List list) {
		Collections.reverse(list);
		return list.iterator();
	}

}
