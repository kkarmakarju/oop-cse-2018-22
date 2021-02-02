package in.edu.tint.cse.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TestMain {

	public static void main(String[] args) {
		Map<Integer, String> mymap = new HashMap<Integer, String>();
		mymap.put(1, "Kevin");
		mymap.put(2, "Aditya");
		mymap.put(3, "Kevin");

		mymap.put(4, "Manish");

		System.out.println(mymap.size());

		TreeMap<Integer, String> mymap2 = new TreeMap<Integer, String>();

		for (String s : mymap.values()) {
			System.out.println(s);
		}
//		for (Iterator iterator = mymap.values().iterator(); iterator.hasNext();) {
//			System.out.println(iterator.toString());
//		}

	}
}
