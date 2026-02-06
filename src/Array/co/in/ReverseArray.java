package Array.co.in;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter "+ n + " elements : ");
		
		for(int i = 0 ; i <  n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("The Reverse arrays are : ");
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			System.out.println(arr[i]);
		}
	}
}