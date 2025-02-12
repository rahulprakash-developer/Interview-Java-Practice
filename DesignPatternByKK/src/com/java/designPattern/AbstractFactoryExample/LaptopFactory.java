package com.java.designPattern.AbstractFactoryExample;

public class LaptopFactory implements AbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public LaptopFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Laptop(ram, hdd, cpu);
	}

}
