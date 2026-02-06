package com.ClassObject;

class CellPhone{
	public void ringing() {
		System.out.println("ringing...");
	}
	
	public void vibrating() {
		System.out.println("Vibrating...");
	}
}
public class PhoneFeatures {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.ringing();
		cp.vibrating();
	}
}
