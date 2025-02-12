package com.java.designPattern.ObserverDesignPattern;

public class FirstMessageSubscriber implements Observer {

	@Override
	public void updateObserver(Message message) {
		System.out.println("Message for first subscriber  :: "+ message.getMessage() );
	}

}
