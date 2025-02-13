package com.java.coding.interview;

import java.util.Objects;

public class HashCodeEqualsExample {

	public static void main(String[] args) {
		Hello h = new Hello();
		h.setId(1);
		h.setName("Rahul");
		Hello h1 = new Hello();
		h1.setId(1);
		h1.setName("Rahul");

		System.out.println(h.equals(h1));
		System.out.println(h == h1);

	}

}

class Hello {

	int id;
	String name;

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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hello other = (Hello) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
