package com.MiniProjects;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScisor {
	public static void main(String[] args) {
		System.out.println("Welcome in Rock Paper Scisor Game ! ");
		
		Scanner input = new Scanner(System.in);
	
		while(true) {
			
			System.out.println("Please Enter \n 1. for Rock \n 2. for Paper \n 3. for Scisor");
			int userInput = input.nextInt();
		
			if(userInput != 1 && userInput != 2 && userInput != 3) {
				System.out.println("Invalid Input !");
				break;
			}
		
		
			Random r = new Random();
			int computerInput = r.nextInt(1,4);
	
			
			if(userInput == computerInput) {
				System.out.println("Draw");
			}else if(userInput == 1 && computerInput == 3 || userInput == 3 && computerInput == 2 || userInput == 2 && computerInput == 1 ) {
				System.out.println("You win !");
			}else {
				System.out.println("Computer Win");
			}
		}
	}
}
