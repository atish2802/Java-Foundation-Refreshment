package Multithreding;


class MyRunnable1 implements Runnable{
	public void run() {
		int i = 0 ;
		while(i < 50) {
			System.out.println("MyRunneble1 is Running....");
		i++;
		}
	}
}

class MyRunnable2 implements Runnable{
	public void run() {
		int i = 0;
		while(i < 50) {
			System.out.println("MyRunnable2 is Running....");
		i++;
		}
	}
}
public class RunnebleThread {
	public static void main(String[] args) {
		MyRunnable1 mr1 = new MyRunnable1();
		Thread t1 = new Thread(mr1);
		
		MyRunnable2 mr2 = new MyRunnable2();
		Thread t2 = new Thread(mr2);
		
		t1.start();
		t2.start();
	}

	
	
}
