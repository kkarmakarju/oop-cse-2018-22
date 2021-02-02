package in.edu.tint.cse.test;

public class TestMain2 {

	public static void main(String[] args) {
		int acountbalance = 100;
		int withdraw = 400;

		try {
			// ...........
			// ...........
			if (withdraw > acountbalance) {
				throw new MyException();
			} else {
				acountbalance -= withdraw;
				System.out.println(acountbalance);
			}
		} catch (MyException e) {
			System.out.println("Insufficient balance");
		}
	}
}
