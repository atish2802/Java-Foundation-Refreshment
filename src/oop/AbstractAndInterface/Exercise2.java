package com.AbstractAndInterface;

abstract class Telephone{
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
}

class SmartTelephone extends Telephone{
	public void ring() {
		System.out.println("Rining...");
	}
	public void lift() {
		System.out.println("Lifting...");
	}
	public void disconnect() {
		System.out.println("Disconnecting...");
	}
}
public class Exercise2 {
	public static void main(String[] args) {
		Telephone st = new SmartTelephone();
		st.disconnect();
		st.lift();
		st.ring();
	}
}
			

