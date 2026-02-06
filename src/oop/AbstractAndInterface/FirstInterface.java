package com.AbstractAndInterface;

interface Bicycle{
	int a = 45;
	void applyBreak(int decrement);
	void speedUp(int increment);
}

class AvonCycle implements Bicycle{
	void blowHorn() {
		System.out.println("Pee Pee Poo Poo !");
	}
	public void applyBreak(int decrement) {
		System.out.println("Applying Break " + decrement);
	}
	
	public void speedUp(int increment) {
		System.out.println("Applying SpeedUp " + increment);
	}
}



public class FirstInterface {
	public static void main(String[] args) {
		AvonCycle ac = new AvonCycle();
		ac.speedUp(12);
		
	}
}
