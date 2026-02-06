package com.Polymorphism;

class Calculator{
	int add(int a , int b) {
		return a + b;
	}
	double add(double a , double b) {
		return a+b;
	}
	
	int add(int a, int b , int c   ) {
		return a + b + c ;
	}
}
public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(12, 13));
		System.out.println(c.add(12.0,13.5));
		System.out.println(c.add(12,13,14));
	}
}
