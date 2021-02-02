
public class TestMain {

	public static void main(String[] args) {
		SavingsAccount sa1 = new SavingsAccount();

		try {
			sa1.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (sa1) {

		}

	}

}
