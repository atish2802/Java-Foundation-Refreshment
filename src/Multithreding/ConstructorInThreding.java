package Multithreding;

class MyThread extends Thread{
	
	public  MyThread(String name) {
		super(name); 
		System.out.println("My name is : "+ name);
	}
	
	public void run() {
		int i = 34;
		System.out.println("Thank you");
//		while(true) {
//			System.out.println("I am a thread");
//		}
	}
}
public class ConstructorInThreding {
	public static void main(String[] args) {
		MyThread mt = new MyThread("Atish");
		MyThread mt2 = new MyThread("Bhavesh");
		mt.start();
		mt2.start();
		mt2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("The id of this thread is : "+ mt.getId());
		System.out.println("The name of this Thread is : "+ mt.getName());
		System.out.println("The id of this thread is : "+ mt2.getId());
		System.out.println("The name of this Thread is : "+ mt2.getName());
		
		System.out.println(mt2.getPriority());
	}
}
