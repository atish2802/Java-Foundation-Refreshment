package basicProgram.com;
import java.util.Scanner;
public class MathTable {
	public static void main(StringManipulation[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(input + " * " + i + " = " + (input * i ) );
			
		}
	}
}
