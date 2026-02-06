package Java8.LambdaExp;

public class ThreadLambda {
	public static void main(String[] args) {

		Runnable thread1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(thread1);
		t.start();

		Runnable thread2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(2 + " * " + i + " = " + 2 * i);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException i1) {
					i1.printStackTrace();
				}
			}
		};

		Thread t1 = new Thread(thread2);
		t1.start();
	}
}
