package com.AbstractAndInterface;

class Monkey{
	void jump() {
		System.out.println("Jumping...");
	}
	void bite() {
		System.out.println("Biting...");
	}
}

interface BasicAnimal{
	void eat();
	void sleep();
}
class Human extends Monkey implements BasicAnimal{
	void speek() {
		System.out.println("Hello ,good morning ...");
	}
	
	public void eat() {
		System.out.println("Eating....");
	}
	public void sleep() {
		System.out.println("Sleeping...");
	}
}
public class Excercise1 {
	public static void main(String[] args) {
//			Human h = new Human();
//			h.bite();
		
		
		    Monkey m = new Human();
		    m.bite();
	}
}
