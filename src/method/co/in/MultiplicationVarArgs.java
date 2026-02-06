package method.co.in;

public class MultiplicationVarArgs {
	static int mul(int...nums) {
		int total = 1;
		for(int i : nums) {
			total = total * i;
		}
		return  total;
	}
	public static void main(String[] args) {
		System.out.println(mul(1,2,3,4,5));
	}
}
