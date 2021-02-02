
public class A extends Thread {
	Thread t;
	String str;

	public A(String str) {
		t = new Thread(this, "Thread A:");
		this.str = str;
		System.out.println("A: constructor: " + str);
		t.start();
	}

	void print() {

	}

	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("A: I am in run :" + str + ": " + i);
		}

	}

}
