package in.edu.tint.cse.demo;

public class TestMain {

	public static void main(String[] args) {
		MyThread myThread1 = new MyThread("MyThread", 1);
		MyThread myThread2 = new MyThread("MyThread", 2);

		System.out.println(myThread1.getPriority());
		System.out.println(myThread2.getPriority());

		myThread1.setPriority(1);
		myThread2.setPriority(2);

		System.out.println(myThread1.getPriority());
		System.out.println(myThread2.getPriority());

//		MyThreadRunnable myThread1 = new MyThreadRunnable("MyThread1", 1);
//		MyThreadRunnable myThread2 = new MyThreadRunnable("MyThread2", 2);
//		MyThreadRunnable myThread3 = new MyThreadRunnable("MyThread3", 3);
//
//		try {
//			myThread1.t.join();
//			myThread2.t.join();
//			myThread3.t.join();			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		System.out.println("TestMain");
	}
}
