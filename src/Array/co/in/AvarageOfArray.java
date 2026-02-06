package Array.co.in;

import java.util.Scanner;

public class AvarageOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks : ");
		int [] marks = new int[5];
		int total = 0;
		for(int i = 0 ; i < marks.length ; i++ ) {
			marks[i] = sc.nextInt();
			total += marks[i];
		}
		System.out.println(total);
	}
}