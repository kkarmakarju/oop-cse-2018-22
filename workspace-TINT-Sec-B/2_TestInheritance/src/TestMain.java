
public class TestMain {
	public static void main(String[] args) {
		B b = new B();

		System.out.println("x: " + b.x);
		//System.out.println("p: " + b.p);
		System.out.println("q: " + b.q);

		C c = new C();
		System.out.print(c.d);
		System.out.print(c.q);
		
		A a = new A();
		//System.out.println(a.p);
		System.out.println(a.q);
	}
}
