package com.java.mutipleinheritanceExample;

public class MultipleInheritanceInterfaceExample2 {

	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.show();
		t.unshow();

	}

}

interface G {
	void show();
}

interface A1  extends G{

	void show();
}

interface B1 extends G{

	void unshow();
}

class Test1 implements A1,B1{

	@Override
	public void unshow() {
		
	}

	@Override
	public void show() {
		
	}
	
}
