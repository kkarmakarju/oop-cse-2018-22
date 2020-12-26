package in.edu.tint.cse.pc;

public class Producer implements Runnable {
	Thread t;
	Item item;

	public Producer(Item item) {
		this.item = item;
		t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		int i = 0;

		while (true) {
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			item.produce(i++);
		}
	}
}
