package com.java.designPattern.ObserverDesignPattern;

public interface Subject {

	public void register(Observer obsever);
	public void unregister(Observer obsever);

	public void notifyUpdate(Message message);

}
