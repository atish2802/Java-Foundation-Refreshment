package Java8.MethodRefrence;

public class MethodRef {
	public static void main(String[] args) {
		System.out.println("First MEthod Ref.");
		
		MethodInterface methodInterface = ()->{
			System.out.println("This is lambda method reference");
			
		};
		
		methodInterface.doTask();
		
		
		MethodInterface methodInterface2 = Stuff::doStuff;
		methodInterface2.doTask();
		
		Stuff obj = new Stuff();
		
		Runnable runnable = Stuff::threadTask;
		
		Thread thread = new Thread(runnable); 
		thread.start();
		
		
		
		
		
		
	}
}
