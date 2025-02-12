package com.java.designPattern.AbstractFactoryExample;

public class PCFactory implements AbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}

}
