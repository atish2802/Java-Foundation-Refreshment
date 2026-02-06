package com.ExceptionHandling;

import java.util.Scanner;

public class NestedTryCatch {
	public static void main(String[] args) {
		
		int [] marks = new int[3];
		marks[0] = 12;
		marks[1] = 13;
		marks[2] = 14;
		
		Scanner sc = new Scanner(System.in);
		
		boolean b = true;
	while(b) {
			
		
		System.out.println("Enter the value of index ");
		int ind = sc.nextInt();
		
		try {
			System.out.println("Welcome in nested try catch block ");
			
			try {
				System.out.println(marks[ind]);
				b = false;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Sorry this index does not exist ");
				System.out.println("Exception in level 2");
			}
		}catch(Exception e ) {
			System.out.println("Exception in level 1 ");
		}
	}
	}
}
