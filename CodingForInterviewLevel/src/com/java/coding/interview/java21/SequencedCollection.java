package com.java.coding.interview.java21;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SequencedCollection {
	
	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("1","2","4","6","8");
		
		//String firstItem = list.iterator().next();
		//String lastItem = list.get(list.size() - 1);
		
		//System.out.println(firstItem);
		//System.out.println(lastItem);
		
		//String firstItem = list.getFirst();
		//String lastItem = list.getLast();
		
		//System.out.println(firstItem);
		//System.out.println(lastItem);
		
		
		/* * List<String> sequenceList = new ArrayList<>();
		 * 
		 * // Adding elements to the sequence collection sequenceList.add("Apple");
		 * sequenceList.add("Banana"); sequenceList.add("Orange");
		 * 
		 * // Accessing elements in the sequence collection
		 * System.out.println("Elements in the sequence collection:"); for (String fruit
		 * : sequenceList) { System.out.println(fruit); }
		 * 
		 * // Removing an element from the sequence collection
		 * sequenceList.remove("Banana");
		 * 
		 * // Accessing elements after removal
		 * System.out.println("\nElements after removing 'Banana':"); for (String fruit
		 * : sequenceList) { System.out.println(fruit); }
*/

		
		
	/*	 * Map<String, Integer> sequenceMap = new LinkedHashMap<>();
		 * 
		 * // Adding key-value pairs to the sequence map sequenceMap.put("One", 1);
		 * sequenceMap.put("Two", 2); sequenceMap.put("Three", 3);
		 * 
		 * // Accessing elements in the sequence map
		 * System.out.println("Key-Value pairs in the sequence map:"); for
		 * (Map.Entry<String, Integer> entry : sequenceMap.entrySet()) {
		 * System.out.println(entry.getKey() + ": " + entry.getValue()); }
		 * 
		 * // Removing a key-value pair from the sequence map sequenceMap.remove("Two");
		 * 
		 * // Accessing elements after removal
		 * System.out.println("\nKey-Value pairs after removing 'Two':"); for
		 * (Map.Entry<String, Integer> entry : sequenceMap.entrySet()) {
		 * System.out.println(entry.getKey() + ": " + entry.getValue()); }*/


		
		
		Set<String> sequenceSet = new LinkedHashSet<>();

        // Adding elements to the sequence set
        sequenceSet.add("Apple");
        sequenceSet.add("Banana");
        sequenceSet.add("Orange");

        // Accessing elements in the sequence set
        System.out.println("Elements in the sequence set:");
        for (String fruit : sequenceSet) {
            System.out.println(fruit);
        }

        // Removing an element from the sequence set
        sequenceSet.remove("Banana");

        // Accessing elements after removal
        System.out.println("\nElements after removing 'Banana':");
        for (String fruit : sequenceSet) {
            System.out.println(fruit);
        }
	}

}
