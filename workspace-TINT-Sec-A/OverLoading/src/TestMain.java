
public class TestMain {

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.add());
		System.out.println(a1.add(10.4, 4));
		B b1 = new B();
		System.out.println(b1.add(10, 2.3));
		System.out.println(a1.add(10, 2.3));

		A a2 = new B();
		System.out.println(a2.add(10, 15.5));
	}
}
