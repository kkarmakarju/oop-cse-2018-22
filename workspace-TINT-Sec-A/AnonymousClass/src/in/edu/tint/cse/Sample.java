package in.edu.tint.cse;

public class Sample {

	void print() {
		System.out.println(new SampleIntf() {
			public int calcualteSum(int x, int y) {
				return x + y;
			}
		}.calcualteSum(10, 20));
	}
}
