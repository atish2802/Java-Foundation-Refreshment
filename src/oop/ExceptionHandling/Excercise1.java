package com.ExceptionHandling;

public class Excercise1 {
	public static void main(String[] args) {
		try {
			int a = 9/0;
			
		}catch(ArithmeticException e) {
			System.out.println("HeHe.....");
			
		}catch(IllegalArgumentException e) {
			System.out.println("HaHa.....");
		}
	}
}
