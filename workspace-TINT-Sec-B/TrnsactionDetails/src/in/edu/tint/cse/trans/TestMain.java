package in.edu.tint.cse.trans;

import java.util.Date;

public class TestMain {

	public static void main(String[] args) {
		int temp = 10001;
		Account[] accounts = new Account[10];
		int j = 0;
		Transaction[] transactions = new Transaction[100];

		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(temp + i, 1000, new Date());
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(accounts[i]);
		}

		//=================================
		Transaction tr = accounts[4].withdrawByCash(105);
		transactions[j++] = tr;

		tr = accounts[8].withdrawByCash(200);
		transactions[j++] = tr;

		for (int i = 0; i < 100; i++) {
			if(transactions[i]==null)
				break;
			System.out.println(transactions[i]);
		}
	}

}
