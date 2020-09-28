
public class A {
	static int objCount = 0;
	static A o;

	private A() {

	}

	static A createInstance() {
		if (objCount == 0) {
			o = new A();
			objCount++;
			return o;
		} else {
			return o;
		}
	}
}
