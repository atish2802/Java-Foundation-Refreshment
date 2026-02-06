package method.co.in;

public class MethodOverlodding {
	static void print(int a ) {
		System.out.println(a * a);
	}
	static void print(String s) {
		System.out.println("This is multiplecation  : "+s);
	}
	public static void main(String[] args) {
		print(4);
		print("number");
	}
}
