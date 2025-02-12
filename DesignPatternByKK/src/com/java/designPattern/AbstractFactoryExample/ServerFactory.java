package com.java.designPattern.AbstractFactoryExample;

public class ServerFactory implements AbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}

}
