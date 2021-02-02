package in.edu.tint.cse;

public class TestMain {
	public static void main(String[] args) {
		Gen<Integer> gen1 = new Gen<Integer>(100);
		gen1.print();

		Gen<String> gen2 = new Gen<String>("Abc");
		gen2.print();

		Gen<A> gen3 = new Gen<A>(new A());
		gen3.print();

		// ArrayList<String> alist = new ArrayList<String>();
	}
}
