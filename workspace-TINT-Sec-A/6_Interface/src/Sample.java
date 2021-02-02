
public class Sample {
	static {
		System.out.println("I am static block");
	}

	public Sample() {
		System.out.println("I am constructor");
	}

	static void print() {
		System.out.println("I am static method");
	}

	void show() {
		System.out.println("I am a normal method");
	}
}
