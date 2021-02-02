
public class TestMain {

	public static void main(String[] args) {
		// C c1 = new C();
		System.out.println("Start of main");

		A a1 = new A("A1");
		try {
			a1.t.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		A a2 = new A("A2");
		B b1 = new B();

		try {

			a2.t.join();
			b1.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// a1.print();
		System.out.println("End of main");
	}
}
