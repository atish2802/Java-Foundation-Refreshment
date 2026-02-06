package Java8.LambdaExp;

public class Main {
	public static void main(String[] args) {
		System.out.println("System Running.....");
		
		
//		This is with object 
//	FunInter funInter = new FunInterImple();
//	
//	funInter.sayHello();
		
		
		//This is without object  called anonymous class 
		
//		FunInter i  = new FunInter() {
//
//			@Override
//			public void sayHello() {
//				System.out.println("Hello , this is anonymous Class !");	
//			}
//			
//		};
//		
//		i.sayHello();
		
		
		//This is with Lambda 
		
//		FunInter i = () -> {
//			System.out.println("This is lambda Class ");
//		};
//		
//		i.sayHello();
		
		
		StringLength i = (str) -> str.length(); {
			System.out.println(i.getLength("Atish"));
		};
		
		
		
	}
}
