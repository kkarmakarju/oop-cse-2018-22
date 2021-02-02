package in.edu.tint.cse.proj2;

import in.edu.tint.cse.proj1.A;
import in.edu.tint.cse.proj1.Intf1;
import in.edu.tint.cse.proj1.Intf2;

public class MainTest {
	public static void main(String args[]) {
		A ob1 = new A();

		ob1.method1();
		ob1.method2();
		ob1.method3();
		ob1.method4();
		
		
		Intf1 i1 = new A();
		i1.method1();
		
		Intf2 i2 = new A();
		i2.method1();
		i2.method3();

	}
}
