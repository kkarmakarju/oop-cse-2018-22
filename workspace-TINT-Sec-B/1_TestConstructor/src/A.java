
public class A {
	int x;
	int y;

	// constructor 1
	A(int p) {
		x = p;
	}

	// constructor 2
	A(int p, int q) {
		x = p;
		y = q;
	}

	// Copy constructor
	A(A ob) {
		x = ob.x;
		y = ob.y;
	}
}
