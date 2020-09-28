
public class B extends A {
	int y;

	B(int p, int q) {
		super(p);
		y = q;
		System.out.println("I am in B");
	}

	B(int p) {
		super(p, 10);
		System.out.println("I am in B");
	}

	void print(int x) {
		System.out.println("I am in B - print.");
	}
}
