package com.java.coding.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapExample {

	public static void main(String[] args) {
		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
		list.add(new Hosting(2, "linode.com", 90000));
		list.add(new Hosting(3, "digitalocean.com", 120000));
		list.add(new Hosting(4, "aws.amazon.com", 200000));
		list.add(new Hosting(5, "com", 1));

		Map<Integer, String> map = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
		map.forEach((k, v) -> System.out.println("Key " + k + " " + " Value " + v));
	}

}

class Hosting {

	int id;
	String name;
	int code;

	public Hosting(int id, String name, int code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}