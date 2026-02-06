package basicProgram.com;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num =input.nextInt();
		
		int rev = 0 ;
		
		for(;num > 0 ; num /=10) {
			rev = rev * 10 + num % 10;
		}
		System.out.println(rev);
	}
}








