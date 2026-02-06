package com.Inheritance;

class Circle {
	
	public int radius;
	
	Circle(int r ){
		System.out.println("I am a parameterized circle constructor ! ");
		this.radius = r;
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius ;
		
	}
}

class Cylinder1 extends Circle {
	public int height;
	
	public Cylinder1(int r , int h) {
		super(r);
		this.height = h; 
		
		System.out.println("I am parameterized Cylinder1 constructor ");
	}
	
	public double volume() {
		return Math.PI * this.radius * this.radius * height;
	}
	
}

public class CircleInheritance {
	public static void main(String[] args) {
//		Circle c = new Circle(12);
		Cylinder1 c1 = new Cylinder1(12, 15);
		
		System.out.println(c1.volume());
		
	}

}
