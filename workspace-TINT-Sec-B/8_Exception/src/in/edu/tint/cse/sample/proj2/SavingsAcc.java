package in.edu.tint.cse.sample.proj2;

public class SavingsAcc {
	int accbalance = 10000;

	void withdraw(int amount) throws InsufficientBalanceException {
		if (accbalance < amount) {
			throw new InsufficientBalanceException();
		} else {
			accbalance -= amount;
			System.out.println(accbalance);
		}
	}
}
