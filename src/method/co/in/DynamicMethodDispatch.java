package method.co.in;

class Animal{
	void speek() {
		System.out.println("Animal speeks...");
	}
}
class Dog extends Animal{
	void speek() {
		System.out.println("Dog barks...");
	}
}
public class DynamicMethodDispatch {
	public static void main(String[] args) {
//		Animal a = new Animal();
		Animal a = new Dog(); // DynamicMethodDispatch
		a.speek();
	}
}
