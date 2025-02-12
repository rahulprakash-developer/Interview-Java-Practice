package com.java.designPattern.ObserverDesignPattern;

import java.util.HashSet;
import java.util.Set;

public class MessagePublisher implements Subject {

	private Set<Observer> observers = new HashSet<Observer>();

	@Override
	public void register(Observer obsever) {
		observers.add(obsever);
		
	}

	@Override
	public void unregister(Observer obsever) {
		observers.remove(obsever);
		
	}

	@Override
	public void notifyUpdate(Message message) {
		for (Observer observer : observers) {
			observer.updateObserver(message);
		}
	}

}
