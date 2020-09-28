
public class Y extends X {
	int b;
	
	Y(int p) {
		super(p);
		a = p;
		System.out.println("I am in Y");
	}
	
	Y(int p, int q){
		super(p);
		b = q;
		System.out.println("I am in Y");
	}
}
