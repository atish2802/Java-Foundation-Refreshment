package com.Constructor;

class Stude{
	int id ;
	
	Stude(int id ){
		this.id = id ;
	}
	
	void show() {
		System.out.println("Id : "+id);
	}
}
public class ConstructorExample {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 5;i++) {
			Stude s = new Stude(i);
			s.show();
		}
	}
}
