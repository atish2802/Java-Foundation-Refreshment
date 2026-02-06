package com.Inheritance;

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor");
    }
}


class Base{
	int x ; 
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x ;
	}
	
	public void printMe() {
		System.out.println("I am a method ! ");
	}
}
	
class Derived extends  Base{
	int y ;
		 
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
		
}
public class Test {
	public static void main(String[] args) {
		/*
		Base b = new Base();
		b.setX(12);
		System.out.println(b.getX());
		*/
		
		Derived d = new Derived();
		d.setX(12);
		System.out.println(d.getX());
		d.setY(10);
		System.out.println(d.getY());
		
		
		Parent p = new Parent();
	}
}
