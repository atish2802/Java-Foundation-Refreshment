package com.company;
import java.util.Scanner;
public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	int  first,second;
	
	System.out.print("Enter the numbers");
	first = sc.nextInt();
	second =sc.nextInt();
		System.out.println("Befor Swap :"+first + second);

	first=first+second;
	second=first-second;
    first=first-second;
    
 System.out.println("After Swap : "+first+second);
  
   
	}
}
