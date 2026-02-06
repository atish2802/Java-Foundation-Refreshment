package com.ExceptionHandling;

public class MultipleCatchBLock {
	public static void main(String[] args) throws Exception {
		try {
//			int [] arr = {1,2,3,4};
//			int [] arr = {1,2,3};
			int []arr = new int [3];
			arr[5] = 100/0;
//			System.out.println(arr[4]);
		}catch(ArithmeticException e) {
			System.out.println("Aruthmatic error ! ");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index error !");
		}
	}
}
