package Array.co.in;

import java.util.Scanner;

public class ArrayProblem {
	public static void main(String[] args) {
		int [] num = new int[5];
		
		num[0] = 5;
		num[1] = 6;
		num[2] = 7;
		num[3] = 8;
		num[4] = 9;

//		System.out.println(num[4]);
		
//		using for loop
		for(int i = 0 ; i < num.length;i++) {
			System.out.println(num[i]);
		}
		
//		using foreach loop
		for(int n:num) {
			System.out.println(n);
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int [] marks = new int[5];
		int total = 0 ;
		for(int i = 0 ;i < marks.length;i++) {
			marks[i] = sc.nextInt();
			total = total + marks[i];
		}
		System.out.println(total);		
		
		
		// reverse array
		
		int [] number = {12,23,43,23,23,32,34};
		
		for(int i = number.length-1 ; i >= 0 ; i--) {
			System.out.println(number[i]);
		}
	}
		
}
