
public class TestMain {
	public static void main(String[] args) {
		B ob = new B(1, 11);
		System.out.println(ob.x + " " + ob.y);
		
		B ob1 = new B(5, 10);
		ob1.meth1();
		ob1.meth2();
		
		A ob2 = new B(11,13);
		ob2.meth1();
		
		
	}
}
