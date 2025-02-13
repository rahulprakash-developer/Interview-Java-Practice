package com.java.designPattern.ObserverDesignPattern;

public class SecondMessageSubscriber implements Observer {

	@Override
	public void updateObserver(Message message) {
		System.out.println("Message for second subscriber  :: "+ message.getMessage() );
	}

}
