package in.edu.tint.cse;

import java.util.Vector;

public class TestVectorMain {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("Hello");
		vec.add("Hi");

		Vector<String> vec2 = new Vector<String>();
		vec2.add("1111");
		vec2.add("hvejbwd");
		
		System.out.println(vec.size());
		vec.addAll(vec2);
		System.out.println(vec.size());
		
	}

}
