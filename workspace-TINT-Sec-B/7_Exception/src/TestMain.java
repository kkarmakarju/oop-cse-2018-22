
public class TestMain {

	public static void main(String[] args) {
		int x = 10;
		int y = 1;
		int[] arr = new int[10];

		System.out.println("Before");
		try {
			System.out.println(x / y);
			System.out.println(arr[15]);
			System.out.println("1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to access an element from the array beyond scope.");
		} catch (Exception e) {
			System.out.println("A number is divided by zero. Please check your input.");
		} finally {
			System.out.println("I am in Finally.");
		}
		System.out.println("After");
		System.out.println(StackOverflowError.class);
	}

}
