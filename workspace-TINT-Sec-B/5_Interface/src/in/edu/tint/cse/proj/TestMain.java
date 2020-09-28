package in.edu.tint.cse.proj;

public class TestMain {
	public static void main(String[] args) {
		A ob1 = new A();
		
		I1 intf1 = new A();
		intf1.method1(10);
		intf1.method2();
		// intf1.method3();
		intf1.method4();
		// intf1.method5();

		I2 intf2 = new A();
		intf2.method1();
		intf2.method5();
	}
}
