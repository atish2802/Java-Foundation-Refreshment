package method.co.in;

public class VarArgs {
	static void sum(int ...nums) {
		int total = 0;
		for(int n : nums) {
			total += n;
		}
		System.out.println("sum : "+total);
	}
	public static void main(String[] args) {
		
		sum(12,23);
		sum(1,2,3);
		sum(1,2,3,4,4);
		
		
	}
}
