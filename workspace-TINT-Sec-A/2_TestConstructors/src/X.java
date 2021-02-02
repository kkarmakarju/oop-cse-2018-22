
public class X {
	int x;
	int y;

	X(int x) {
		super();
		this.x = x;
	}

	X(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// Copy constructor
	X(X obj) {
		x = obj.x;
		y = obj.y;
	}

	void print() {
		System.out.println(x + " " + y);
	}

	void print(int u) {
		System.out.println(x + " " + y + " " + u);
	}
}
