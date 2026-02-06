package basicPrograms.in;

public class SimpleMethod {
	static void greet(){
		System.out.println("Good Morning !");
	}
	static void printTable(int num) {
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println(num+" x "+ i + " = " + num*i);
		}
	}
	static int square (int x) {
		return x * x;
	}
	
	static int add(int a,int b) {
		return a + b;
	}
	public static void main(String[] args) {
		
		greet();
		int num =4;
		printTable(num);
		
		
		int result = square(4);
		
		System.out.println(result);
		
		
		int sum = add(4,9);
		System.out.println(sum);

	}
}
