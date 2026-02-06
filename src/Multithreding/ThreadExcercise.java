package Multithreding;

class Excercise1 extends Thread{
	public void run() {
		int i = 0;
		while(i < 100) {
		System.out.println("Good Morning ! ");
		i++;
		}
	}
}

class Excercise2 extends Thread{
	public void run() {
		int i = 0;
		while(i < 100) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				
			System.out.println(e );
			}
			System.out.println("Welcome !");
			
			i++;
		}
	}
}

public class ThreadExcercise {
	public static void main(String [] args) {
		Excercise1 e1 = new Excercise1();
		e1.setPriority(10);
		Excercise2 e2 = new Excercise2();
		e2.setPriority(5);
		System.out.println(e1.getState());
		e1.start();
		e2.start();
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		
		System.out.println(e1.getState());
		System.out.println(Thread.currentThread().getState());
		
	}
}
