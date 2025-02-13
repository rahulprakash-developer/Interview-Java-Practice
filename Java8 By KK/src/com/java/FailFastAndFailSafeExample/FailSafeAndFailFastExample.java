package com.java.FailFastAndFailSafeExample;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeAndFailFastExample {
	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>();
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("Apple", "Ios");
		map.put("Sony", "Xperia");
		map.put("HTC", "Global");
		map.put("Samsung", "India");

		Set<String> set = map.keySet();

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			 map.put("Micromax", "Chinese");
			String phoneType = it.next();
			System.out.println(phoneType + "\t" + map.get(phoneType));

		}

	}

}

/*
 * map.put("Micromax", "Chinese");// You can not modify or update the element
 * while iteration it will throw "java.util.ConcurrentModificationException" but
 * with the use fo ConcurrenHashMap you can easily modify and update the element
 */
