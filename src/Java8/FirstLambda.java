package Java8;

interface Demo{
	void greet(String name);
}

public class FirstLambda {
	public static void main(String[] args) {
		Demo obj = (name) -> {
			System.out.println("I am a Lambda of Demo "+name);
		};
		obj.greet("Atish");
	}
}
 