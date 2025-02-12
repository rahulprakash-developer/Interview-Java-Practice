package com.java.designpatterbyKk.BuilderDesignPattern;

public class Laptop {

	private String ram;
	private String cpu;
	private String hdd;

	private boolean isGrabhicalEnable;
	private boolean isBluetoothEnable;

	private Laptop(LaptopBuilder builder) {
		this.ram = builder.ram;
		this.cpu = builder.cpu;

		this.hdd = builder.hdd;

		this.isBluetoothEnable = builder.isBluetoothEnable;

		this.isGrabhicalEnable = builder.isGrabhicalEnable;

	}

	public String getRam() {
		return ram;
	}

	public String getCpu() {
		return cpu;
	}

	public String getHdd() {
		return hdd;
	}

	public boolean isGrabhicalEnable() {
		return isGrabhicalEnable;
	}

	public boolean isBluetoothEnable() {
		return isBluetoothEnable;
	}

	public static class LaptopBuilder {
		private String ram;
		private String cpu;
		private String hdd;

		private boolean isGrabhicalEnable;
		private boolean isBluetoothEnable;

		public LaptopBuilder(String ram, String cpu, String hdd) {
			super();
			this.ram = ram;
			this.cpu = cpu;
			this.hdd = hdd;
		}

		public LaptopBuilder setBluetoothEnable(boolean isBluetoothEnable) {
			this.isBluetoothEnable = isBluetoothEnable;
			return this;
		}

		public LaptopBuilder setGrabhicalEnable(boolean isGrabhicalEnable) {
			this.isGrabhicalEnable = isGrabhicalEnable;
			return this;
		}

		public Laptop build() {
			return new Laptop(this);
		}

	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + ", isGrabhicalEnable=" + isGrabhicalEnable
				+ ", isBluetoothEnable=" + isBluetoothEnable + "]";
	}

}
