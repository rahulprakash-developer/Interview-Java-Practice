package com.java.designPattern.AdapterDesignPattern;

public class MobileAdaptoImpl implements MobileAdaptor {

	private WallSocket wallSocket;

	public MobileAdaptoImpl(WallSocket wallSocket) {
		this.wallSocket = wallSocket;
	}

	@Override
	public Volt get3Volt() {
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolts() / 80;
		return new Volt(v3);
	}

}
