package in.edu.tint.cse.demo;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("MT-1");
		DemoThread dt1 = new DemoThread("DT-1", 1000);
		DemoThread dt2 = new DemoThread("DT-2", 500);
		for (int i = 1; i <= 5; i++) {
			System.out.println("MT-2: " + i);
		}
	}
}
