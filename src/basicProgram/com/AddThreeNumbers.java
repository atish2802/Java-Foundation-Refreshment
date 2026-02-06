package basicProgram.com;
import java.util.Scanner;
public class AddThreeNumbers {
	public static void main(StringManipulation[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a first subject marks : ");
		int first = input.nextInt();
		System.out.println("Enter a second subject marks : ");
		int second = input.nextInt();
		System.out.println("Enter a third subject marks : ");
		int third = input.nextInt();
		
		int sum =  first + second + third ;
		
		int avg = sum / 3 ;
		
		System.out.println("The sum of all three subject is : "+sum );
		System.out.println("And the Average is : "+avg);
		
		input.close();
		
		
	}
}
