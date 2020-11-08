package in.edu.tint.cse.sample;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		Integer[] arr = new Integer[10];

		ArrayList<String> arrayList1 = new ArrayList<String>();

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(10);

		ArrayList<Student> arrayList3 = new ArrayList<Student>();

		String str = "Anindya";
		arrayList1.add(str);
		arrayList1.add("Mohit");
		arrayList1.add("Kevin");
		System.out.println(arrayList1);

		arrayList1.add(1, "Sayon");
		System.out.println(arrayList1);

		// arrayList1.remove(0);
		// arrayList1.remove(str);
		// arrayList1.remove(str);
		System.out.println(arrayList1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("AAA");
		list2.add("XXX");

		arrayList1.add(str);
		arrayList1.addAll(1, list2);
		arrayList1.add(2, "SSS");
		System.out.println(arrayList1);

		arrayList1.removeAll(list2);
		arrayList1.remove(str);
		System.out.println(arrayList1);

		for (String s : arrayList1) {
			System.out.println(s);
		}
		System.out.println(arrayList1);
	}

}
