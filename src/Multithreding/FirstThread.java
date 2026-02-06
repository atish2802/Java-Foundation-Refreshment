package Multithreding;


class MyThread1 extends Thread{
	public void run() {
		int i = 0;
		while(i < 100) {
		System.out.println("My first Thread running....");
		i++;
		}
	}
}
class Mythread2 extends Thread{
	public void run() {
		int i = 0;
		while(i < 100) {
		System.out.println("My Second Thread Stoped ");
		i++;
		}
	}
}
public class FirstThread {
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		Mythread2 m2 = new Mythread2();
		
		m1.start();
		m2.start();
	}
}
