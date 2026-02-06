package basicProgram.com;

import java.util.Scanner;

public class Expressions {
	public static void main(StringManipulation[] args) {
		int a = 10 , b = 15 , c = 20 ;
		
		int ans = ( (b * b)  - (4 * a * c)) / 2 * a;
		
		System.out.println(ans);
		
		
		
		int d = 7 / 4  * 9 / 2 ;
		System.out.println(d);
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Grade : ");
		char g = input.next().charAt(0);
		char newChar = (char)(g + 8);
		System.out.println("you got " + newChar);
		
		
		
	}
}
