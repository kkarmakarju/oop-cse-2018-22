package in.edu.tint.cse;

public class TestMain {

	public static void main(String[] args) {
		Sample sample1 = new Sample(20);
		Sample sample2 = new Sample(25);

		Sample sample3 = new Sample(sample1);

		System.out.println(sample1);
		System.out.println(sample2);
		System.out.println(sample3);

		int x = 2000000000;
		System.out.println(x);

		// -128 to 127
		Integer y = -129;
		Integer z = -129;
		if (y == z)
			System.out.println("Same");
		else
			System.out.println("Not");

		//System.out.println(x.getClass());
		
		int arr[] = new int[10];
		System.out.println(arr.getClass());
		
	}

}
