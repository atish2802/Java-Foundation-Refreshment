package com.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		for(int i = number.size() -1 ; i >= 0 ; i--) {
			System.out.print(number.get(i));
		}
		
		
		//Add number
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter five subject marks :  ");
		
		for(int i = 0 ; i < 5 ; i++) {
			marks.add(sc.nextInt());
		}
		
		int sum = 0 ;
		
		for(int i : marks) {
			sum += i;
		}
		
		System.out.println("marks : "+ marks);
		System.out.println("Total marks "+ sum);
		System.out.println("Average of total marks is : "+ sum/5);
	}
}
