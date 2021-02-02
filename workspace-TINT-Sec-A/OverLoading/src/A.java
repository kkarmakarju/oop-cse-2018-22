
public class A {
	int x = 5;
	int y = 7;
	String s;

	// add method is overloaded
	int add() {
		System.out.println("add()");
		return x + y;
	}

	int add(int a, double b) {
		System.out.println("A: add(int a, double b)");
		return x + y + a + (int)b;
	}

	int add(double a, int b) {
		System.out.println("add(double a, int b)");
		return x + y + (int) a + b;
	}
}
