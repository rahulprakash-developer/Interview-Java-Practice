package com.designPatterbyKK.factoruDesignPatter;

public class FactoryDesignTest {

	public static void main(String[] args) {

		Computer laptop = ComputerFactory.getCompuert(ComputerType.LAPTOP, "12", "22", "33");

		System.out.println("Laptop" + laptop);

		Computer PC = ComputerFactory.getCompuert(ComputerType.PC, "12", "43", "33");

		System.out.println("PC" + PC);

		Computer Server = ComputerFactory.getCompuert(ComputerType.SERVER, "12", "444", "33");

		System.out.println("Server" + Server);

	}

}
