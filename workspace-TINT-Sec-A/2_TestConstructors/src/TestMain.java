
public class TestMain {

	public static void main(String[] args) {
		// A ob1 = new A();
		// B ob2 = new B();

		C ob3 = new C(2, 6, 9);
		System.out.println(ob3.x + " " + ob3.y + " " + ob3.z);

		X ob4 = new X(10);
		X ob5 = new X(10, 20);

		X ob6 = new X(ob5);

		ob6.print();

		Calculator calculator = new Calculator();
		int res = calculator.add(15, 8);
		System.out.println(res);
		res = calculator.add(1, 2, 3, 5);
		System.out.println(res);

		C ob = new C(1, 2, 3);
		ob.print();// defined in A
		ob.print(10);// defined in class B
		
		
	}
}
