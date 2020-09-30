package in.edu.tint.cse;

public class A extends Thread {

	Thread t = null;

	public A() {
		super();
		this.t = new Thread("thread1");
		System.out.println("xxxxxxxx");
		t.start();
	}

	public void run() {
		System.out.println("I am a thread");

	}
}
