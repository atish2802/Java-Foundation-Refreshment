package Java8.MethodRefrence;

import java.time.LocalDate;

public class Stuff {
	public static void doStuff() {
		System.out.println("This is Stuff method");
		System.out.println("This is 2nd Stuff method");
		LocalDate localDate = LocalDate.now(); 
		
		System.out.println(localDate.toString());
		
		
		}
	public static void threadTask() {
		for(int i = 1 ; i <=10 ; i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
