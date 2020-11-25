package in.edu.tint.cse;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// Stack<E> stack = new Stack<E>();
		MyDS<Integer> a = new MyDS<Integer>();
		MyDS<String> b = new MyDS<String>();

		ArrayList<String> list = new ArrayList<String>();

		list.add("Hello");
		list.add("Hi");
		list.add("Hello");

		list.add(1, "AAA");

		list.remove("Hello");
		list.remove("Hello");

		System.out.println(list.size());

		for (String s : list) {
			System.out.println(s);
		}

		// System.out.println("+++" + list.get(1));

	}

}
