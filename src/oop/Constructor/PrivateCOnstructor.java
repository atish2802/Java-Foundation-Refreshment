package com.Constructor;

class PrivateConst{
	 private PrivateConst() {
		System.out.println("This is private type of constructor");
	}
	
	 public static PrivateConst getInstance() {
		return new PrivateConst();
	}
}
public class PrivateCOnstructor {
	public static void main(String[] args) {
		PrivateConst pc = PrivateConst.getInstance();
	}
}
