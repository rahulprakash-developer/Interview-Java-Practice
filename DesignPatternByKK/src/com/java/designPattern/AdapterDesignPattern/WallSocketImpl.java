package com.java.designPattern.AdapterDesignPattern;

public class WallSocketImpl implements WallSocket{

	@Override
	public Volt getVolts() {
		return new Volt(240);
	}

}
