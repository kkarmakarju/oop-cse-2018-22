package in.edu.tint.cse.demo;

public class A {

	void meth1() {
		System.out.println("-----A:1-----");
	}

	void meth1(int x) {
		System.out.println("-----A:2-----");
	}

	void meth1(String x, int... numbers) {
		System.out.println("-----A:5-----");
	}

	void meth1(String x) {
		System.out.println("-----A:3-----");
	}
	
	void meth1(String x, int y) {
		System.out.println("-----A:4-----");
	}
	
}
