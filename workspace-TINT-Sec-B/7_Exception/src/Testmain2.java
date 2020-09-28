
public class Testmain2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int[] arr = new int[10];

		System.out.println("Before");
		try {
			System.out.println(x / y);
			System.out.println(arr[15]);
			System.out.println("1");
		} catch (Exception e) {
			System.out.println("Better luck next time.");
		} finally {
			System.out.println("I am in Finally.");
		}
		System.out.println("After");
		System.out.println(StackOverflowError.class);
	}

}
