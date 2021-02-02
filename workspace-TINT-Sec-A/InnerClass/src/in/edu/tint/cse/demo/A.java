package in.edu.tint.cse.demo;

public class A {
	int x;

	class B {
		int a;

		void methodInner() {
			A outer = new A();
			outer.x = 20;
		}

	}

	void methodOuter() {
		B inner = new B();
		inner.a = 10;
	}
}
