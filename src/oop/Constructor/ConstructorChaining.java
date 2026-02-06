package com.Constructor;

class Car{
	
	Car(){
		this(100);
		System.out.println("This is a car constructor ");
	}
	
	Car(int price){
		System.out.println("Price : " + price );
	}	
}
public class ConstructorChaining {
	public static void main(String[] args) {
		Car c = new Car();
	}
}
