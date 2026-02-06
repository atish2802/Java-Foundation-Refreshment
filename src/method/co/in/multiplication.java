package method.co.in;
import java.util.Scanner;
public class multiplication {
	void  mul(int n) {
		for (int i = 1 ; i <=10 ; i++) {
			System.out.println(n+ " X "+ i + " = " + (n * i));
		}		  
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		multiplication mp = new multiplication();
		
	    mp.mul(5);
	   	
	}

}
