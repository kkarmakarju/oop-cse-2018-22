package in.edu.tint.cse.demo;

public class DemoThread extends Thread {
	Thread t;
	int speed;

	public DemoThread(String name, int speed) {
		this.speed = speed;
		t = new Thread(this, name);
		System.out.println(name + " started");
		t.start();
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName() + "::" + i);
			try {
				t.sleep(speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(t.getName() + " ended");
	}
}
