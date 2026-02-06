package com.ClassObject;

class Employee{
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n ) {
		name = n;
	}
	
}
public class EmployeeDetailes {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Yogesh");
		System.out.println(e1.getName());
		e1.salary = 1000;
		System.out.println(e1.getSalary());
		
		
		Employee e2 = new Employee();
		e2.setName("Parth");
		e2.salary = 2000;
		
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		
		
		
		
		

	}
}
