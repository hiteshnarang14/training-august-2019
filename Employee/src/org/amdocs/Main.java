package org.amdocs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("404", "MG", "Mumbai", "421002");
		
		Employee sharma = new Employee("Sharma", "SWE", "Sales", address);
		System.out.println(sharma.getDetails());

	}

}
