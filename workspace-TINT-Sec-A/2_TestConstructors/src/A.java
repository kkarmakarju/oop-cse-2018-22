
public class A {
	int x;

	A(int p) {
		x = p;
		System.out.println("I am in A");
	}

	A(int p, int q) {
		x = p;
		System.out.println("I am in A");
	}

	void print() {
		System.out.println("I am in A - print.");
	}
}
