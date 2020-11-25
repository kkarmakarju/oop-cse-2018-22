package in.edu.tint.cse.sample;

import java.util.Vector;

public class TestMainVector {

	public static void main(String[] args) {
		Vector<String> vStrings = new Vector<String>();
		vStrings.add("SDF");
		vStrings.remove(0);
		System.out.println(vStrings.lastElement());

		for (String v : vStrings) {
			System.out.println(v);
		}
	}

}
