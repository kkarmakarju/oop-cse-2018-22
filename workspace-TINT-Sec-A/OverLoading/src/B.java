
public class B extends A {

	int add(double a, double b) {
		super.add(10, 24.5);
		System.out.println("add(double a, double b)");
		return x + y + (int) a + (int) b;
	}

	int add(int a, double b) {
		super.add(10, 20.5);
		System.out.println("B: add(double a, double b)");
		return x + y + (int) a + (int) b;
	}
}
