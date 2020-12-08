package in.edu.tint.cse.trans;

import java.util.Date;

public class Account {
	private int accountNo;
	private int balance;
	private Date dateOfLastUpdation;

	public Account(int accountNo, int balance, Date dateOfLastUpdation) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.dateOfLastUpdation = dateOfLastUpdation;
	}

	Transaction withdrawByCash(int amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance!");
			return null;
		}
		this.balance = this.balance - amount;
		dateOfLastUpdation = new Date();

		Transaction transaction = new Transaction(accountNo, dateOfLastUpdation, amount, "By cash");
		return transaction;
	}

	@Override
	public String toString() {
		return "Balance [accountNo=" + accountNo + ", balance=" + balance + ", dateOfLastUpdation=" + dateOfLastUpdation
				+ "]";
	}
}
