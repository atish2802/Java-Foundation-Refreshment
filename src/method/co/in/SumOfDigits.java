package method.co.in;

public class SumOfDigits {
	static int sod(int n) {
		if(n==0) {
			return 0;
		}else {
			return (n%10) + sod (n/10);
		}
	}
	public static void main(String[] args) {
		 System.out.println(sod(34534));
	}
}
