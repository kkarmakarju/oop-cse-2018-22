
public class SavingsAccount extends Thread {
	int ab;

	public void run() {
		getAccountBalance();
		withdraw(1000);
		
	}

	int getAccountBalance() {
		return ab;
	}

	synchronized static void withdraw(int wa) {
		// ab -= wa;
	}
}
