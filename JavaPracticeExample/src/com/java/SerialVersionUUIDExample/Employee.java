package com.java.SerialVersionUUIDExample;

import java.io.Serializable;

public class Employee implements Serializable {

	
	private static final long serialVersionUID = -7064274327001380077L;
	private int id;
	private String name;
	private String email;
	private Double salary;
	

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
