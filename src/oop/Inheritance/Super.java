package com.Inheritance;

class A{
	void show() {
		System.out.println("Perent show ...");
	}
}
class B extends A{
	void show() {
		super.show();
		System.out.println("child show ...");
	}
}
public class Super {
		public static void main(String[] args) {
			B b = new B();
			b.show();
		}
	}

