package in.edu.tint.cse;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Start of Main");
		A a1 = new A("A", 1);
		System.out.println(a1.getPriority());
		a1.setPriority(2);
		System.out.println(a1.getPriority());
		
//		a1.print();
//		A a2 = new A("A", 2);
//		A a3 = new A("A", 3);
//		
//		a3.print();
//		try {
//			a1.t.join();
//			a2.t.join();
//			a3.t.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			a1.print();
//		}

		B b1 = new B("Thr1", 1);
		try {
			b1.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		B b2 = new B("Thr1", 2);
		B b3 = new B("Thr1", 3);
		
		//System.out.println(b1.getPriority());

		System.out.println("End of Main");
	}
}
