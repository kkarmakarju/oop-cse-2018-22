package in.edu.tint.cse.sample.comp;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain2 {

	public static void main(String[] args) {

		ArrayList<Book> books =new ArrayList<Book>();
		books.add(new Book(1, "C Prog", 10.5));
		books.add(new Book(4, "Java Prog", 10.5));
		books.add(new Book(3, "Aython Prog", 10.5));
		
		Collections.sort(books, new IdComparator());
		System.out.println(books);
		
		Collections.sort(books, new NameComparator());
		System.out.println(books);
		
		
	}

}
