package method.co.in;

class A{
	int a ;
	public int num () {
		return 4;
	}
	public void math2() {
		System.out.println("I am the method 2 of class A");
	}
}
class B extends A{
	public void math2() {
		System.out.println("I am the method 2 of class B");
	}
	public void math3() {
		System.out.println("I am the method 3 of class B");
	}
}
public class OverRiding {
	public static void main(String[] args) {
		B b = new B();
		b.math2();
	}
}
