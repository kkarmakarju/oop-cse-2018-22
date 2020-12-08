package in.edu.tint.cse.demo;

public class B extends A {
	
	void meth1(String x, String y) {
		System.out.println("-----B:1-----");
	}
	
	void meth1(String x, int... numbers) {
		System.out.println("-----B:2-----");
	}
}
