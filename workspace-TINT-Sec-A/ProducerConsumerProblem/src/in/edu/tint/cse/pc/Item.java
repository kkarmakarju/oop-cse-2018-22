package in.edu.tint.cse.pc;

public class Item {
	int n;

	boolean flag = false;

	synchronized public int consume() {
		if (!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		System.out.println("Consume: " + n);
		flag = false;
		notify();
		return n;
	}

	synchronized public void produce(int i) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.n = i;
		flag = true;
		System.out.println("Produce: " + n);
		notify();
	}
}
