package in.edu.tint.cse.sample.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

public class TestMain {

	public static void main(String[] args) {
		// key => value pair
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "XYZ");
		map.put(2, "P");
		map.put(2, "Q");
		map.put(4, "XYZ");
		map.put(5, "ABC");

		System.out.println(map.size());
		System.out.println(map.get(2));

		System.out.println(map.keySet());
		System.out.println(map.values());

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "SSSS");
		tmap.put(2, "SVVVV");

		for (int x : tmap.keySet()) {
			System.out.println(tmap.get(x));
		}

		
		 
	}

}
