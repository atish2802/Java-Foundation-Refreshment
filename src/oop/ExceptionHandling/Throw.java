package com.ExceptionHandling;

public class Throw {
//	public static void validAge(int age) {
//		if(age < 18) {
//			throw new ArithmeticException("Not Eligible For Voting !");
//		}else {
//			System.out.println("Eligible for vote !");
//		}
//	}
	
public static void main(String[] args) {
//	validAge(20);
	
	int age = 17;
		
		try {
			if(age < 18) {
				throw new ArithmeticException("Not Eligible for vote ");
			}else {
				System.out.println("Eligible for Voting ");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
	}
	
}
}




