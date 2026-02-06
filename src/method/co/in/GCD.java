package method.co.in;

public class GCD {
	static int findgcd(int a , int b) {
		if(b == 0 ) {
			return a;
		}else {
			return findgcd(b,a % b);
		}
	}
	public static void main(String[] args) {
		
		System.out.println(findgcd(3,6));
	}
}
