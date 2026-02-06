package basicProgram.com;

public class SumOfGivenNum {
	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		for(; num > 0 ; num /= 10) {
			sum = sum + num % 10;
		}
		System.out.println(sum);
	}
}
