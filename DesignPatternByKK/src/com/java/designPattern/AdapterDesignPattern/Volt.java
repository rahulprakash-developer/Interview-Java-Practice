package com.java.designPattern.AdapterDesignPattern;

public class Volt {

	private int volts;

	public Volt(int volts) {
		this.volts = volts;

	}

	public int getVolts() {
		return volts;
	}

	@Override
	public String toString() {
		return "Volt [volts=" + volts + "]";
	}

}
