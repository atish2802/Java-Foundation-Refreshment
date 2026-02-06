package com.Constructor;


class Student{
	String name ;
	int roll;
	
	Student(String n , int r){
		name = n;
		roll = r;
	}
		
		void details() {
			System.out.println(name + " " + roll);
		}
}
public class Parameterized {
	public static void main(String[] args) {
		
		Student s = new Student("Vaibhav", 11);
		s.details();
	}
}
