package com.java8feature.javabrain;

public class ClosureExample {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;// before java 8 if u want to modify the value in any block the you must have to
					// initialize final varable but in case of java 8 its not mandatory it
					// automatically give error becuase if you going to modify the variable in block
					// it will give u error
/*
		doProcess(a, new Process() {

			@Override
			public void proc(int i) {
				// b=1;  //Local variable b defined in an enclosing scope must be final or effectively final
				System.out.println(i + b);
			}

		});
	}*/
		doProcess(a, i -> System.out.println(i+b));
	} 
		
		
		
	public static void doProcess(int i, Process p) {
		p.proc(i);
	}

}

interface Process {
	void proc(int i);
}
