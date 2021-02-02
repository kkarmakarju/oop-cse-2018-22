
public class Sample {

	static {
		System.out.println("I am static block");
	}

	public void greetHi() {
		System.out.println("I am a method.");
	}

	public static void greetHello() {
		System.out.println("I am a static method.");
	}

	public Sample() {
		System.out.println("I am constructor.");
	}

//	int calculatefactorial(int n) {
//		int res = 1;
//		for (int i = 2; i <= n; i++)
//			res *= i;
//
//		return res;
//	}
}
