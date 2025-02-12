package com.java.AgregationAndCompositionExample;

public class AggreegationAndComposition {
	public static void main(String[] args) {



		// agreegationDemo();

		compositionDemo();

		/*
		 * In Aggregation is has-a relationship means (One class will have the reference
		 * Another class as class member) Here Address class define the member of
		 * Employee class if you define the Employee class as null after then only
		 * employee is become null Address data it wont be become null
		 */

	}

	/*
	 * private static void agreegationDemo() { Address add = new Address();
	 * 
	 * add.setAdId(12); add.setAddressName("Bangalore");
	 * 
	 * Employee emp = new Employee(); emp.setName("Rahul"); emp.setAge(28);
	 * emp.setAddress(add);
	 * 
	 * System.out.println(emp);
	 * 
	 * System.out.println("---------------------------------");
	 * 
	 * emp = null;
	 * 
	 * System.out.println(emp);
	 * 
	 * System.out.println(add); }
	 */

	private static void compositionDemo() {
		Employee emp = new Employee();

		emp.setAge(28);
		emp.setName("Rahul");
		emp.getAddress().setAddressName("Bangalore");
		emp.getAddress().setAdId(12);
		System.out.println(emp);
		emp = null;
		System.out.println("------------------------------------------");
		System.out.println(emp);
		if (emp != null) {
			System.out.println(emp.getAddress());
		}else
			System.out.println("Address does not exist..");
	}
	}

	/*
	 * In Composition is is-a relationship i.e here we are creating the Address
	 * class object in Employee Constructor in that case once you define the
	 * Employee object as null Address class become null.
	 */

