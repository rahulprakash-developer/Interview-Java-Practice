package com.java.designPattern.AdapterDesignPattern;

public class AdapterClassTest {
	public static void main(String[] args) {
		WallSocket wallSocket = new WallSocketImpl();
		Volt v240 = wallSocket.getVolts();
		System.out.println(v240);
		
		MobileAdaptor mobileAdaptor = new MobileAdaptoImpl(wallSocket);
		Volt v3 = mobileAdaptor.get3Volt();
		System.out.println(v3);
	}

}
