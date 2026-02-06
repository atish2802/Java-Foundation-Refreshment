package basicProgram.com;

import java.util.Scanner;

public class KilometersToMiles {
	public static void main(StringManipulation[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the distance : ");
		int distance = input.nextInt();
		
		float miles =  (float) (distance * 0.62137) ;	
		
		System.out.println("It means you covered " + miles + " miles ! ");
	}
}
