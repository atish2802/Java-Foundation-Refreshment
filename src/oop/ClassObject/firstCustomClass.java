package com.ClassObject;

class Car{
	String color;
	int speed;
	
	void drive() {
		System.out.println("Car is driving ! ");
	}
}
public class firstCustomClass {
		public static void main(String[] args) {
			
			Car car = new Car();
			car.drive();
			car.color = "red";
			car.speed = 100;
			System.out.println("Color : "+ car.color);
			System.out.println("Speed : " + car.speed);
			
			
		}
}
