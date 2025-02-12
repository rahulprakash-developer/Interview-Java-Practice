package com.java.thread.producerConsmerExample;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {

	public static void main(String[] args) {

		String str = "Rahul";
		String str1 = new String("Rahul").intern();
		
		String str2 = str1.concat("RahulPrakash").intern();
		
		
		
	

		System.out.println(str == str1);
		System.out.println(str == str2);

		
		

		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());

		// Creating BlockingQueue of size 10
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		// starting producer to produce messages in queue
		//new Thread(producer).start();
		// starting consumer to consume messages from queue
		//new Thread(consumer).start();
		System.out.println("Producer and Consumer has been started");
	}

}
