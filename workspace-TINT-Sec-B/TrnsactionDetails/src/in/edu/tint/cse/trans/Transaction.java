package in.edu.tint.cse.trans;

import java.util.Date;

public class Transaction {
	private int accountNo;
	private Date dateOfTransaction;
	private int amount;
	private String transactionType;

	public Transaction(int accountNo, Date dateOfTransaction, int amount, String transactionType) {
		super();
		this.accountNo = accountNo;
		this.dateOfTransaction = dateOfTransaction;
		this.amount = amount;
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "Transaction [accountNo=" + accountNo + ", dateOfTransaction=" + dateOfTransaction + ", amount=" + amount
				+ ", transactionType=" + transactionType + "]";
	}
	
	

}
