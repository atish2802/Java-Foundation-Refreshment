package com.AbstractAndInterface;

 abstract class Perent{
	
	Perent(){
		System.out.println("I am constructor of perent class ");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	
	abstract public void greet1();
	abstract public void greet2();
	
	abstract public int sum(int a , int b);
	
}
 
 class Child extends Perent{
	
	public void greet1() {
		System.out.println("Hello Good Morning ");
	}
	public void greet2() {
		System.out.println("Hello Good Afternoon ");
	}
	 
	public int sum(int a , int b) {
		return a + b ; 
	}
 }
public class FirstAbstract {
	public static void main(String[] args) {
		Child c = new Child();
		c.greet1();
		c.greet2();
		

		System.out.println(c.sum(12, 15));
	}
}
