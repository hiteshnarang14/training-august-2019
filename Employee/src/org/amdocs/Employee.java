package org.amdocs;

public class Employee
{
	private String name;
	private String designation;
	private String dept;
	
	private Address data = new Address();



	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(String name, String designation, String dept, Address data) 
	{
		super();
		this.name = name;
		this.designation = designation;
		this.dept = dept;
		this.data = data;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", dept=" + dept + ", data=" + data + "]";
	}

	public String getDetails() {
		return "Employee [name=" + name + ", designation=" + designation + ", dept=" + dept + ", data=" + data + "]";
	}


	
}
