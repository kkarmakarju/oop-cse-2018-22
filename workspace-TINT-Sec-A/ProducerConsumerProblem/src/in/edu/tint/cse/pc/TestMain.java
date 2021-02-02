package in.edu.tint.cse.pc;

public class TestMain {

	public static void main(String[] args) {
		Item item = new Item();
		Producer producer = new Producer(item);
		Consumer consumer = new Consumer(item);
	}
}
