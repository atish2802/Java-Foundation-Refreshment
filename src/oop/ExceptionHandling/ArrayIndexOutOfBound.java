package com.ExceptionHandling;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		try{
			int [] arr = {1,2,3};
			System.out.println(arr[2]);
		}catch(Exception e) {
			System.out.println("Index is invalid.");
		}finally {
			System.out.println("Thank you using this code !");
		}
	}
}
