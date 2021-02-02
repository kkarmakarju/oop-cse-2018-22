package in.edu.tint.cse.sample.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestMain {

	public static void main(String[] args) {
		Set<String> myset = new TreeSet<String>();
		myset.add("XXXX");
		myset.add("YYYY");
		myset.add("ZZZZ");
		
		System.out.println(myset.size());
		myset.add("YYYY");
		System.out.println(myset.size());
		
		Set<String> myset1 = new HashSet<String>();
		myset1.add("adfg");
		
		
	}

}
