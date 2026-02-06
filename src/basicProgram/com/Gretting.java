package basicProgram.com;

import java.util.Scanner;

public class Gretting {
	public static void main(StringManipulation[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello sir , What's your name ? ");
		String name = sc.next();
		
		System.out.println("Hello "+name + " Welcome in our Hotel PalmTree ! ");
	}
}
