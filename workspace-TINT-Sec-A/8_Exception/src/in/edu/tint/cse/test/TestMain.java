package in.edu.tint.cse.test;

public class TestMain {

	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		int arr[] = new int[10];
		try {
			System.out.println(arr[7]);
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println("You are dividing an element by zero. Please check input.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to access an element beyond the limit.");
		} catch (Exception e) {
			System.out.println("Error occured. Contact your nearest branch.");
		}
	}
}
