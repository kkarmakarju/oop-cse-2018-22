
public class B implements Runnable {
	Thread t;

	public B() {
		t = new Thread(this, "Thread B");
		System.out.println("B: constructor");
		t.start();
	}

	public void run() {
		synchronized (t) {
			for (int i = 1; i <= 5; i++) {
				try {
					t.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("B: I am in run : " + i);
			}
		}
	}
}
