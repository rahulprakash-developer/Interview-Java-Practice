package com.java.designPattern.factoryDesignPattern;

public class ComputerFactory {

	private ComputerFactory() {

	}

	public static Computer getCompuert(ComputerType computerType, String ram, String cpu, String hdd) {
		switch (computerType) {
		case PC:
			return new PC(ram, hdd, cpu);
		case LAPTOP:
			return new Laptop(ram, hdd, cpu);

		case SERVER:
			return new Server(ram, hdd, cpu);
		default:
			throw new RuntimeException("Invalid computer Type");

		}

	}

}
