package com.company;
import java.util.Scanner;
public class squre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,squre;
		System.out.println("Enter number :");
		num = sc.nextInt();
		squre =num*num*num;
		System.out.println("The cube  of"+num+" is"+squre);
		
		
	}

}
