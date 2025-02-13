package com.java.designPattern.AbstractFactoryExample;

public class AbstractFactoryDesignTest {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer(new PCFactory("3", "33", "44"));

		System.out.println("PC :: " + pc);

		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("3", "33", "44"));

		System.out.println("Laptop :: " + laptop);

		Computer Server = ComputerFactory.getComputer(new ServerFactory("3", "33", "44"));

		System.out.println("Server:: " + Server);

	}

}
