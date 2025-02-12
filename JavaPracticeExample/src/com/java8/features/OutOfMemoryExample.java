package com.java8.features;


public class OutOfMemoryExample {


	public static void main(String args[]) throws Exception {
		
		Employee1 emp[] = new Employee1[500];
		for (int i = 0; i < emp.length; i++) {
			//new Employee("Rohan --" + (i+1));
			emp[i] = new Employee1("Rahul --" + (i+1));
			
		}
		
	}
}

class Employee1{
	
	String eid;
	
	double add[] = new double[123456];
	
	Employee1(String eid) {
		this.eid=eid;
		System.out.println("Object Id : "+ eid);
	}
	
	@Override
	protected void finalize(){
		System.out.println("Finalize-- "+ eid);
	}
	
}
