package in.edu.tint.cse.sample.proj;

public class Sample {

	public void method1()  {
		int x = 10;
		int y = 0;
		int[] arr = new int[10];
		try {
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(arr[15]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		x = x + 5;
		System.out.println(x);
	}
}
