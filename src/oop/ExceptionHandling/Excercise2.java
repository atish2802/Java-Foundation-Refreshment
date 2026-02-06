package com.ExceptionHandling;

import java.util.Scanner;

public class Excercise2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;

		boolean flag = true;
		
		Scanner input = new Scanner(System.in);
		
		int index;
		int i = 0;
		
		while(flag && i < 5){
		try {
			
			System.out.println("Enter a array index : ");
			index = input.nextInt();
			
			System.out.println("The value of arr[index] is : " + arr[index]);
			
			break;
			
		}catch(Exception e) {
			System.out.println("Invalid index ");
			i++;
		}
		}
	}
}
