package com.Inheritance;
class Person{
	String name ;
	
	void walk() {
		System.out.println("Walking...");
	}
}

class Student extends Person{
	void study() {
		System.out.println(name+" is  studying ");
	}
}
public class Details {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Atish";
		
		s.walk();
		s.study();
	}
}
