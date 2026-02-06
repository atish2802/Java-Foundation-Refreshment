package com.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Ravi");
		name.add("Amit");
		name.add("Sumit");
		name.add("Jatin");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		boolean b = false;
		while(true) {
			if(name.contains(sc.next())) {
				System.out.println(" is available ");
				break;
			}else {
				System.out.println("Not available");
			}
			
		}
		
		
	
		
		
	}
}
