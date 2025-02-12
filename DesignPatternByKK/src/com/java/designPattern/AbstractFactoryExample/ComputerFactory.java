package com.java.designPattern.AbstractFactoryExample;

public class ComputerFactory {

	private ComputerFactory() {

	}

	public static Computer getComputer(AbstractFactory abstractFactory) {
		return abstractFactory.createComputer();
	}
}
