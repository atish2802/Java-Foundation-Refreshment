package com.ClassObject;

class Circle {
	double pi = 3.14;
	
	public void area(double r) {
		System.out.println((pi * r * r)); 
	}
	
	public void circunference(double r) {
		System.out.println(2 * pi * r);
	}
	public void redius(double r) {
		double redius = r /(2*pi);
		System.out.println(redius);
	}
}
public class FindCircle {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.redius(15);
		c.area(12);
		c.circunference(10);
	}
}
