package in.edu.tint.cse.sample.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMain {

	public static void main(String[] args) {
		ArrayList<Item> al = new ArrayList<Item>();
		al.add(new Item(1, "AAA", 10.5));
		al.add(new Item(3, "BBB", 104.5));
		al.add(new Item(2, "CCC", 110.5));

		Collections.sort(al);
		Iterator<Item> itr = al.iterator();
		while (itr.hasNext()) {
			Item item = (Item) itr.next();
			System.out.println(item);

		}

		ArrayList<String> myl = new ArrayList<String>();
		myl.add("A");
		myl.add("C");
		myl.add("B");

		System.out.println(myl);

		Collections.sort(myl);

		System.out.println(myl);
	}
}
