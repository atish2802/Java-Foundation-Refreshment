package basicProgram.com;

public class Operators {
	public static void main(StringManipulation[] args) {
		int a = 7;
		int b = 3;
		System.out.println(a / b);
		System.out.println(a % b);

		
		int x = 15;
		int y = 20;
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x < y);

		boolean c = true;
		boolean d = false;
		System.out.println(c && d);
		System.out.println(c || d);
		System.out.println(!(c && d));
		
		int z = 10;
		z += 5;
		z *= 2;
		z -= 4;
		z /= 2;
		System.out.println(z);
		
		
		
		int f = 7;
		System.out.println(f++);
		System.out.println(++f);
		System.out.println(f--);
		System.out.println(--f);

		
		//quiz 
		 int u = 7 ;
		 int v = ++u * 8;
		 System.out.println(v);


	}
}
