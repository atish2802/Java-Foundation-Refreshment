package com.company;
import java.util.Scanner;
public class AverageOfThreeNUmber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		
		float avg = (one +two+three)/3;
		System.out.println(avg);
	}
}
