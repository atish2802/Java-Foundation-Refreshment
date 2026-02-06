package method.co.in;

import java.util.Scanner;

public class method {
	
	static void pattern(int n) {
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
//	static void Hello() {
//		System.out.println("Hello sir ! ");
//	}
//	public static void main(String[] args) {
//	
//		Scanner sc = new Scanner(System.in);
//		
//		String name = sc.next();
//		System.out.println(name);
//		Hello();
	
	static int division(int a , int b) {
		return a - b ; 
	}
	public static void main(String[] args) {
		int div = division(10,5);
		
		System.out.println(div);
		
		pattern(5);
	}
}
