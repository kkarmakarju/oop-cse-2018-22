package in.edu.tint.cse.sample.proj;

public class TestMain {

	public static void main(String[] args) {
		Sample sample = new Sample();
		try {
			sample.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
