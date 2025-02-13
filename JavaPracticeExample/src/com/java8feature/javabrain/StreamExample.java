package com.java8feature.javabrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
		List<Person> personList = Arrays.asList(new Person("rahul ", "prakash", 32),
				new Person("Pandey ", "rajesh", 12), new Person("Jaya ", "minky", 22),
				new Person("Minky", "srivastave", 23));
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
		//stream.forEach(p->System.out.println(p));
		
		
		//Converting stream to collection
		
		List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        
        Stream<Integer> streaming = list.stream();
        
       // Convert Stream to List – Stream.collect( Collectors.toList()
        
        List<Integer> evenNumbersList = streaming.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.print(evenNumbersList);

		
		
		/*personList.stream()
		.filter(p -> p.getLname().startsWith("r"))
		.forEach(p -> System.out.println(p.getFname()));
		*/
	}

}
