package com.MiniProjects;
import java.util.Random;
import java.util.Scanner;
class Game{
	int number;
	int inputNumber;
	int numberOfGusses = 0;
	
	 Game() {
		Random random = new Random();
		this.number = random.nextInt(1,100);
	 }

	 void UserInput() {
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
	 }
	
	boolean CorrectNumber(){
		numberOfGusses ++;
		if(inputNumber == number) {
			System.out.format("You gess right number %d  and \n You Gussed it in %d attempts ",number,numberOfGusses);
			return true;
		}else if(inputNumber < number){
			System.out.println("You choosed Small Number");
		}else if(inputNumber > number){
			System.out.println("You choosed Bigger Number");
		}
		return false;
	}
	
}
public class GussTheNumber {
	public static void main(String[] args) {
		Game g = new Game();
		System.out.println("Guss the number...");
		boolean b  = false ;
		while(!b) {	
			g.UserInput();
			b =  g.CorrectNumber();
			
			
		}
	}
}
