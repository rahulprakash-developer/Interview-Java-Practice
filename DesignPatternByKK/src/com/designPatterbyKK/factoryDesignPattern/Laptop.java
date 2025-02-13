package com.designPatterbyKK.factoryDesignPattern;

public class Laptop implements Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public Laptop(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String ram() {
		return this.ram;

	}

	@Override
	public String cpu() {
		return this.cpu;
	}

	@Override
	public String hdd() {
		return this.hdd;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}
	
	

}
