package com.java.interviewquestionandanswer;

public class GenericTest {

	
	public static void main(String[] args) {
		Test1 test = new Test1();
		Test1<Number> number = new Test1();
		number.add(new Integer(1));
		number.add(new Double(1.0));
	}
}

class Test1<T>{
	void add(T t) {
		
	}
}
