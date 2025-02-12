package com.java.ConcurrentHashMapMethodsExample;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMethodTest {

	public static void main(String[] args) {

		ConcurrentHashMap<String, UUID> concurrentHashMap = new ConcurrentHashMap<String, UUID>();

		for (int i = 0; i < 51; i++) {
			concurrentHashMap.put("Session_" + i, UUID.randomUUID());
		}

		// For getting Key

		concurrentHashMap.forEachKey(3, System.out::println);// Will print parallel

		System.out.println("------------------------------------------------");

		// For Getting Value

		concurrentHashMap.forEachValue(3, System.out::println);

		System.out.println("--------------------------------------------------");

		// For getting Key Value both

		concurrentHashMap.forEachEntry(3, e -> System.out.println(e.getKey() + "\t" + e.getValue()));// will print
																										// Parallel

		System.out.println("=========================================================================");

		// Search the key

		ConcurrentHashMap<Integer, UUID> concurrentHash = new ConcurrentHashMap<Integer, UUID>();

		for (int i = 0; i < 50; i++) {
			concurrentHash.put(i, UUID.randomUUID());
		}

		Integer sessionId = 20;
		String search = concurrentHash.search(3, (k, v) -> {
			if (k.equals(sessionId)) {
				return new String(k + "\t" + v);
			}
			return null;
		});

		System.out.println(search);

		System.out.println("---------------------------------------------------------");

		// Search the value

		String searchEntries = concurrentHash.searchEntries(3, (e) -> {
			if (e.getValue().toString().contains("ab")) {
				return new String(e.getKey() + "\t" + e.getValue());
			}
			return search;
		});
		System.out.println(searchEntries);

		System.out.println("--------------------------------------------------------");
		Integer searchKeys = concurrentHash.searchKeys(3, (k) -> {
			if (k > 20) {
				return k;
			}
			return null;
		});
		System.out.println(searchKeys);// Output will give parallel result becuase if he start looking at first
										// whatever he will get you can see the output

		System.out.println("--------------------------------------------------------");

		String searchValues = concurrentHash.searchValues(3, v -> {
			if (v.toString().contains("ab")) {
				return v.toString();
			}
			return null;
		});
		System.out.println(searchValues);
		
		System.out.println("--------------------------------------------------------");

		// Reduce Method example

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("Krishan", "India");
		map.put("Ahmad", "China");
		map.put("Frank", "US");
		map.put("Martin", "Germany");

		String reduce = map.reduce(2, (k, v) -> k + "-" + v, (r1, r2) -> r1 + "," + r2);
		System.out.println(reduce);

	}

}
