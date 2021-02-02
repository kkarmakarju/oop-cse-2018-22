
public class C extends B {
	int z;

	
	C(int p, int q, int r){
		super(p, q);
		z = r;
		System.out.println("I am in C");
	}
	
	void print() {
		System.out.println("I am in C - print.");
	}
}
