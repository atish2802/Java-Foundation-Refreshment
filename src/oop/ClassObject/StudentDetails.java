package com.ClassObject;

class Student{
	String name;
	int roll_no;
	
	  void showDetails(){
		System.out.println("Name : "+ name);
		System.out.println("Roll_no "+ roll_no);
	  }
}
public class StudentDetails {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "Rahul";
		s1.roll_no = 12;
		
		s1.showDetails();
		
		
		Student s2 = new Student();
		s2.name = "Rajesh";
		s2.roll_no = 13;
		
		s2.showDetails();
		
	}
}
