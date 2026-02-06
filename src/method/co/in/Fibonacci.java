package method.co.in;

public class Fibonacci {
	
	static int fibo(int n) {
		if(n==0 || n==1){
			return n;
		}else {
			return fibo(n-1) + fibo(n - 2);
		}
	}
	
	static void fibonacci(int n) {
		int a = 0 , b = 1;
		
		System.out.print(a+" "+ b + " ");
		
		for(int i = 2 ; i <= n ; i++) {
			int c = a + b ;
			System.out.print(c+ " ");
			a = b ;
			b = c;
		}
	}
public static void main(String[] args) {
	
	System.out.println(fibo(8));
	
	fibonacci(7);
}
}
	