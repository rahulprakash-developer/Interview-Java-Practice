package com.java.classimplementmoreinterfacewithdefaultmethod;

public class Test  implements I1,I2{
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1();
	}


	@Override
	public void m1() {
		I1.super.m1();
	}
}
