
public class SavingsAccount extends Thread {
	int ab;

	public void run() {
		getAccountBalance();
		withdraw(1000);
	}

	int getAccountBalance() {
		return ab;
	}

	synchronized void withdraw(int wa) {
		ab -= wa;
	}
}
