package com.java.AgregationAndCompositionExample;

public class Employee {
	private String name;
	private int age;
	private Address address;
	
	public Employee() {
		address = new Address();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	/*public void setAddress(Address address) {
		this.address = address;
	}*/
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	

}
