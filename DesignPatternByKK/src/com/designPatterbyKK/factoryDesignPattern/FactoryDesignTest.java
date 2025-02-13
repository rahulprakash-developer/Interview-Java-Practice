package com.designPatterbyKK.factoryDesignPattern;

public class FactoryDesignTest {

	public static void main(String[] args) {

		Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "12", "22", "33");

		System.out.println("Laptop" + laptop);

		Computer PC = ComputerFactory.getComputer(ComputerType.PC, "12", "43", "33");

		System.out.println("PC" + PC);

		Computer Server = ComputerFactory.getComputer(ComputerType.SERVER, "12", "444", "33");

		System.out.println("Server" + Server);

	}

}
