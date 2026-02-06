package com.AbstractAndInterface;

abstract class Pen{
	abstract void write();
	abstract void refiling();
}

class FountenPen extends Pen{
	void write() {
		System.out.println("Writing...");
	}
	void  refiling() {
		System.out.println("refiling...");
	}
	
	void changeNib() {
		System.out.println("Changing nib...");
	}
}


public class PenAbstract {
	public static void main(String[] args) {
		FountenPen fp = new FountenPen();
		fp.changeNib();
	}
}
