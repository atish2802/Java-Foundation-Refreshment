package com.ExceptionHandling;

public class TestException {
	public static void main(String[] args) {
		try {
			int a = 10 /0;
		}catch(Exception e) {
			System.out.println("Can't divide by zero !");
		}
	}
}
