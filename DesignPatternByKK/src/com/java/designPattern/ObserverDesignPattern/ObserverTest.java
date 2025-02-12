package com.java.designPattern.ObserverDesignPattern;

/**
 * @author rahul.prakash
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		FirstMessageSubscriber first = new FirstMessageSubscriber();
		SecondMessageSubscriber second = new SecondMessageSubscriber();
		ThirdMessageSubscriber third = new ThirdMessageSubscriber();

		MessagePublisher message = new MessagePublisher();

		message.register(first);
		message.register(second);

		message.notifyUpdate(new Message("This is the First message"));
		
		System.out.println("--------------------------");
		
		message.unregister(first);
		message.register(third);
		
		message.notifyUpdate(new Message("This is the Second Message"));
	}

}
