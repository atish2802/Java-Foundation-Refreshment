package basicPrograms.in;

import java.util.Scanner;
public class Ascii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Charector : ");
		char ch = sc.next().charAt(0);
		
		int ascii = (int)ch;
		System.out.println(ascii);
	}
}
