package in.edu.tint.cse.pc;

public class Consumer implements Runnable {
	Thread t;
	Item item;

	public Consumer(Item item) {
		this.item = item;
		t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {
		while (true) {
			try {
				t.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			item.consume();
		}
	}

}
