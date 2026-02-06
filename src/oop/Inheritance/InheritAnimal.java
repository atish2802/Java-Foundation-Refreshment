package com.Inheritance;
class Animal{
	public void sound() {
		System.out.println("Animal sounds.... ");
	}
}
class Dog extends Animal{
	public void Dsound() {
		System.out.println("Bark.... ");
	}
}
class Cat extends Dog{
	public void Csound() {
		System.out.println("Miyau");
	}
}
public class InheritAnimal {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		
		Cat  c =  new Cat();
		c.sound();
		c.Csound();
		c.Dsound();
	}
}
