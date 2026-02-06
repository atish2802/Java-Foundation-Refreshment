package com.Constructor;
class Base{
	Base(){
		System.out.println("I am a constructor");
	}
	Base(int a){
		System.out.println("i am a constructor with the input "+a);
	}
}
class Derived extends Base{
	Derived(){
		super(30);
		System.out.println("I am a derived class constructor");
	}
	Derived(int a , int b){
		super(20);
		System.out.println("I am Derived class constructor with value "+a +" " + b);
	}
}

class ChildDerived extends Derived {
	
	ChildDerived(){
		System.out.println("I am a child of derived Constructor");
	}
	
	ChildDerived(int a , int b , int c){
		super(a,b);
		System.out.println("This is a childDerived Constructor with value : "+ c);
	}
}
public class ConstructorInheritance {
	public static void main(String[] args) {
//		Base b = new Base();
//		Derived d = new Derived(12,44);
		
		ChildDerived cd = new ChildDerived(12,14,15);
	}
}
