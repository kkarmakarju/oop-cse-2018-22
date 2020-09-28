
public class TestMain {

	public static void main(String[] args) {
		int x = 11;
		int y = 0;

		System.out.println(x);

		try {
			// System.out.println(x / y);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		int[] arr = new int[10];
		try {
			System.out.println(arr[12]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		// int arr[10];
		// printf("%d", arr[12]);

		x += y;
		System.out.println(x);
	}

}
