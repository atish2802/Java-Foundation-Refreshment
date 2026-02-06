package method.co.in;

import java.util.Scanner;

public class EvenOdd {
	static void evenOdd(int n) {
		if(n == 0) {
			System.out.println("Even"); 
		}else {
			System.out.println("Odd");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt();
		evenOdd(n);
		
		
	}
}
