package com.Constructor;

class MyDetails{
	String name ;
	int number;
	
	public MyDetails() {
		name = "jayesh";
		number = 1234;
	}
	public MyDetails(String surName) {
		name = surName;
		
	}
	
	void printDetails() {
		System.out.println("Name : " + name);
		System.out.println("Number : "+ number);
	}
	
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		MyDetails m1 = new MyDetails();
		MyDetails m2 = new MyDetails("Kedar");
		
		m1.printDetails();
		m2.printDetails();
	}
	
	
}
