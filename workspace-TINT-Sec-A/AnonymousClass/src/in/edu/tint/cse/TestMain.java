package in.edu.tint.cse;

public class TestMain {

	public static void main(String[] args) {
		/* used earlier */
		MyIntf myClass = new MyClass();
		myClass.method1();
		myClass.method2();
		//myClass.method3();

		/* Anonymous Class*/
		MyIntf intf = new MyIntf() {
			public void method2() {
				System.out.println("I am method1");
			}
			
			public void method1() {
				System.out.println("I am method2");
				method3();
			}
			
			public void method3() {
				System.out.println("I am method3");
			}
		};
		
		intf.method1();
		intf.method2();
		//intf.method3(); ----error
	}

}
